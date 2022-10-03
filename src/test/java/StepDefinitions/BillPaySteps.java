package StepDefinitions;

import Pages.DialogContent;
import Pages.MenuContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillPaySteps {

    MenuContent mn = new MenuContent();
    DialogContent dc = new DialogContent();

    @And("pay bill button click")
    public void payBillButtonClick() {
        mn.findAndClick("billpayButton");

    }


    @When("pay electricity , water and natural gas bills payeeName as {string} streetAddress as {string} cityAddress as {string} stateAddress as {string} zipCode as {string} phoneNumber as {string} Account as {string} VerifyAccount as {string} Amount as {string}")
    public void payBill(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) {

        dc.findAndSend("payeeName",arg0);
        dc.findAndSend("streetAddress",arg1);
        dc.findAndSend("cityAddress",arg2);
        dc.findAndSend("stateAddress",arg3);
        dc.findAndSend("zipCode",arg4);
        dc.findAndSend("phoneNumber",arg5);
        dc.findAndSend("payeeAccountNumber",arg6);
        dc.findAndSend("payeeVerifyAccount",arg7);
        dc.findAndSend("amount",arg8);

        dc.findAndClick("sendPayment");


    }


    @Then("verify that the bills have been paid after each payment")
    public void verifyThatTheInvoiceHasBeenPaidAfterEachPayment() {

        dc.findAndContainsText("verifyPayment", "Bill Payment Complete");


    }



}
