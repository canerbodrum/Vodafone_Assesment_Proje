package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD;
import Utilities.SessionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.JSONObject;
import org.testng.Assert;

import java.io.IOException;

public class _03_LoginSteps extends Parent {
    DialogContent dc = new DialogContent();
    @When("Login With individual account")
    public void loginWithIndividualAccount() throws IOException, InterruptedException {

            //  manuel giriş yapınca json coockieleri json data ile çeker
            //  sessionManager.storeSessionFile("vodafone");
            //kullandığım telefon numarası
            //05435254800
        SessionManager sessionManager=new SessionManager(GWD.getDriver());
        JSONObject existingSession = new JSONObject();
        existingSession.put("path","/");
        existingSession.put("domain",".vodafone.com.tr");
        existingSession.put("name","tokenIdList");
        existingSession.put("isHttpOnly",true);
        existingSession.put("isSecure",true);
        existingSession.put("expiry","2024-06-06T22:14:19.715Z");
        existingSession.put("value","|DCE-fa940d52-31b8-4b1b-bded-c6f0b35e9b65");
        sessionManager.setCookies(existingSession);
        dc.clickFunction(dc.login);
        waitUntilClickable(dc.login2);
        dc.login2.click();
        dc.clickFunction(dc.mynumber);
    }
    @And("Navigate to Login Page And Click Without Vodafone Account")
    public void navigateToLoginPageAndClickWithoutVodafoneAccount() {
        dc.clickFunction(dc.vodafonludegilim);
    }

    @Then("Accept reqiured data and Click Login")
    public void acceptReqiuredDataAndClickLogin() {
        dc.clickFunction(dc.checkbox);
        dc.clickFunction(dc.checkbox2);
        dc.clickFunction(dc.vodafonluDegilimLoginButton);
    }

    @Then("Verify Cridential user Should Be Login")
    public void verifyCridentialUserShouldBeLogin() {
        waitUntilVisible(dc.usermenu);
        Assert.assertTrue(dc.usermenu.isDisplayed());
    }
}
