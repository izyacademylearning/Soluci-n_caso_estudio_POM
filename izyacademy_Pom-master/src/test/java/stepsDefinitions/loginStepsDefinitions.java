package stepsDefinitions;



import groovy.lang.GString;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import steps.loginStep;



public class loginStepsDefinitions {

    loginStep loginStep = new loginStep();

    @ParameterType(".*")
    public String user(String user){
        return  user;
    }

    @ParameterType("row")
    public int row(String captureGroup) {
        return Integer.parseInt(captureGroup);
    }



    @When("the user enter the email as email with the {int}")
    public void theUserEnterTheEmailAsEmailWithThe(int row) {
        loginStep.ClickSignIn();
        loginStep.EnterEmail(row);
    }

    @When("the user enter the password as password with the {int}")
    public void theUserEnterThePasswordAsPasswordWithThe(int row) {
        loginStep.EnterPassword(row);
        loginStep.ClickLogin();
    }


    @Then("the {user} looks at the home page")
    public void theUserLooksAtTheHomePage(String user) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginStep.CompareName(user);

    }



}
