package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class DialogContent extends Parent {
    // POM: Page Object Model
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='İlgilenmiyorum']")
    public WebElement ilgilenmiyorum;

    @FindBy(id = "rejectAllButton")
    public WebElement rejectAllButton;

    @FindBy(xpath = "//a[text()='Alışveriş']")
    public WebElement Alışveriş;

    @FindBy(xpath = "//span[text()='Telefonlar']")
    public WebElement Telefonlar;
    @FindBy(xpath = "//a[@class='yonlendirme-close popup-close']")
    public WebElement closepupup;

    @FindBy(name = "data[1][msisdn]")
    public WebElement number;

    @FindBy(name = "data[1][password]")
    public WebElement password;
    @FindBy(xpath = "//b[text()='Siyah']")
    public WebElement siyah;
    @FindBy(xpath = "//button[text()='Devam Et']")
    public WebElement devamEtButton;
    @FindBy(xpath = "//span[text()='Giriş Yap']")
    public WebElement login;
    @FindBy(xpath = "//a[text()='Giriş Yap']")
    public WebElement login2;
    @FindBy(xpath = "//h4[text()='Galaxy A24']")
    public WebElement GalaxyA24;
    @FindBy(css = "[aria-label='Sepete Ekle']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//div[contains(text(),'Değilim')]")
    public WebElement vodafonludegilim;
    @FindBy(name = "data[13][msisdn]")
    public WebElement number2;
    @FindBy(id = "other_field_kvkk")
    public WebElement checkbox;
    @FindBy(id = "other_field_iletisim")
    public WebElement checkbox2;
    @FindBy(xpath = "(//button[text()='Devam Et'])[2]")
    public WebElement vodafonluDegilimLoginButton;
    @FindBy(xpath = "//span[text()='AHMET C.']")
    public WebElement ahmetc;

    @FindBy(css = "[aria-label='Sepetim']")
    public WebElement sepet;

    public WebElement getWebElement(String strButton) {

        switch (strButton) {

            case "Alışveriş":
                return Alışveriş;
            case "Telefonlar":
                return Telefonlar;
            case "number":
                return number;
            case "password":
                return password;
            case "devamEtButton":
                return devamEtButton;
            case "siyah":
                return siyah;
            case "GalaxyA24":
                return GalaxyA24;
            case "sepeteEkle":
                return sepeteEkle;
            case "number2":
                return number2;
        }
        return null;
    }


}
