package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

//driver.manage().window().maximize(); ekranı max yapar.
//GWD: General WebDriver
public class GWD {

    // herbir thread e özel local static driver oluşturdum
    public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); // Webdriver 1, Webdriver 2 ...

    private static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();
    // threadDriver.get() --> bulunduğum thread deki driverı ver
    // threadDriver.set(driver) --> bulunduğum thread e driver set ediliyor
    public static WebDriver getDriver()
    {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");
        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        //diğer senaryolar için default chrome

        if (threadBrowserName.get() == null)
            threadBrowserName.set("chrome");


        if (threadDriver.get() == null) { // 1 kere çalışssın
            switch (threadBrowserName.get()){
                case "firefox":
                    threadDriver.set(new FirefoxDriver());

                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;

                default:
                    //chrome
                    ChromeOptions options = new ChromeOptions();
                   //options.addArguments("--user-data-dir=./User_Data");
                     options.addArguments("--remote-allow-origins=*");
                    // Jenkins için başlıksız cpu ve gpu kullanımı durduruldu hafızada maximaxe edildi
                    // options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    threadDriver.set(new ChromeDriver(options));
            }

        }
        threadDriver.get().manage().window().maximize();
        return threadDriver.get();
    }
    public static void quitDriver(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if (threadDriver.get() != null){ // dolu ise, boş değilse
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get(); driver=null;
            threadDriver.set(driver);
        }
    }
    public static void threadBrowserSet(String browser) {
    threadBrowserName.set(browser);


    }
    public static String threadBrowserGet(){
        return threadBrowserName.get();
    }

}
