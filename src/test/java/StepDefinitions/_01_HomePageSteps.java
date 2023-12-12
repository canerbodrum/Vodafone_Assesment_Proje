package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import Utilities.SessionManager;
import io.cucumber.java.en.*;
import org.json.JSONObject;

import java.io.IOException;

public class _01_HomePageSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Vodafone")
    public void navigate_to_vodafone() {


        GWD.getDriver().get("https://www.vodafone.com.tr/");
        dc.clickFunction(dc.rejectAllButton);
    }

    @Then("User should be Nagivated Vodafone Home Page")
    public void userShouldBeNagivatedVodafoneHomePage() {
        dc.verifyContainsTextFunction(dc.login,"Giriş Yap");
    }
    @Given("Navigate to HomePage")
    public void navigate_to_homepage() {


        GWD.getDriver().get("https://www.vodafone.com.tr/");

    }
}


