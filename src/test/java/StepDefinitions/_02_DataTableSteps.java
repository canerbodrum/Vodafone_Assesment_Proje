package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_DataTableSteps {

    DialogContent dc = new DialogContent();

    @Given("Click on the element in HomePage")
    public void clickOnTheElementInHomePage(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for (String strButton : strButtons) {

            WebElement element = dc.getWebElement(strButton);

            dc.clickFunction(element);
        }
    }

    @And("Click on the element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strButton : strButtons) {

            WebElement element = dc.getWebElement(strButton);

            dc.clickFunction(element);
        }

    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {
        List< List<String> > items= dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element= dc.getWebElement(items.get(i).get(0));
            dc.clickFunction(element);
            dc.sendKeysFunction(element, items.get(i).get(1));
        }

    }


}
