package stepsDefinitions;

import Driver.GoogleChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import steps.goPage;

public class openBrowserStepsDefinitions {

    goPage goPage = new goPage();

    @After
    public void tearDown(){
        GoogleChromeDriver.quitBrowser();
    }
    @Given("The user enter the page")
    public void theUserEnterThePage() {
        goPage.openBrowser("http://izyacademy.com:8000/login");
    }
}
