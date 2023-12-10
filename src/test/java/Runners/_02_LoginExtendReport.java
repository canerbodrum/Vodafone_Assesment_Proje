package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles/loginwithindividualcockies.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _02_LoginExtendReport extends AbstractTestNGCucumberTests {
}


