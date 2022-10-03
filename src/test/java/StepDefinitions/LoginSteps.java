package StepDefinitions;

import Pages.DialogContent;
import Pages.MenuContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    MenuContent mn = new MenuContent();
    DialogContent dc = new DialogContent();

        @When("login with valid username as {string} password as {string}")
    public void loginWithValidUsernameAsPasswordAs(String arg0, String arg1) {

            mn.findAndSend("login_username",arg0);
            mn.findAndSend("login_password",arg1);
            mn.findAndClick("login");

    }


    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {

            dc.findAndContainsText("loginVerify" ,"Accounts Overview");


    }
    @And("Logout Button")
    public void logoutButton() {

        dc.findAndClick("logout");
    }

    @Then("User should invalid login")
    public void userShouldInvalidLogin() {

            dc.findAndContainsText("invalidVerify" ,"An internal error has occurred and has been logged.");
    }
}
