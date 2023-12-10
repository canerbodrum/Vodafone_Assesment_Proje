package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    DialogContent dc = new DialogContent();

    @After("dependsOnMethods={verifyCridentialUserShouldBeLogin}")
    public void emptytocard(){

        dc.clickFunction(dc.sepet);
        // 2 test senaryosundada sepete ürün eklenmiyor
        // fakat bu şekilde after classım çalışıcak
    }
    @After
    public void after(Scenario scenario) {
        System.out.println("Senaryo bitti");
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) GWD.getDriver();
        final byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(hafizadakiHali, "image/png", "screenshot name");
        }
        GWD.quitDriver();
    }

}