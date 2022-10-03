package StepDefinitions;

import Pages.DialogContent;
import Pages.MenuContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class RegisterSteps {

    MenuContent mn = new MenuContent();
    DialogContent dc = new DialogContent();


    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
        GWD.getDriver().manage().window().maximize();

    }

    @When("fill out the register form firstname as {string} lastname as {string} streetAddress as {string} cityAddress as {string} stateAddress as {string} zipCode as {string} phoneNumber as {string} ssn as {string} username as {string} password as {string}repeatedPassword as {string}")
    public void fillOutTheRegisterForm(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10) {

        mn.findAndClick("register");
        dc.findAndSend("firstname",arg0);
        dc.findAndSend("lastname",arg1);
        dc.findAndSend("streetAddress",arg2);
        dc.findAndSend("cityAddress",arg3);
        dc.findAndSend("stateAddress",arg4);
        dc.findAndSend("zipCode",arg5);
        dc.findAndSend("phoneNumber",arg6);
        dc.findAndSend("ssn",arg7);
        dc.findAndSend("username",arg8);
        dc.findAndSend("password",arg9);
        dc.findAndSend("repeatedPassword",arg10);
        dc.findAndClick("submit");

    }


    @Then("verify register successfuly")
    public void verifyRegisterSuccessfuly() {

        dc.findAndContainsText("verify","created successfully");

    }
}
