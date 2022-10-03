package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "customer.firstName")
    private WebElement firstname;

    @FindBy(id = "customer.lastName")
    private WebElement lastname;

    @FindBy(xpath = "//*[contains(text(),'Address')]//following::input")
    private WebElement streetAddress;

    @FindBy(xpath="//*[contains(text(),'City')]//following::input")
    private WebElement cityAddress;

    @FindBy(xpath = "//*[contains(text(),'State')]//following::input")
    private WebElement stateAddress;

    @FindBy(xpath = "//*[contains(text(),'Zip')]//following::input")
    private WebElement zipCode;

    @FindBy(xpath = "//*[contains(text(),'Phone')]//following::input")
    private WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    private WebElement ssn;

    @FindBy(id = "customer.username")
    private WebElement username;

    @FindBy(id = "customer.password")
    private WebElement password;

    @FindBy(id = "repeatedPassword")
    private WebElement repeatedPassword;

    @FindBy(css = "[value='Register']")
    private WebElement submit;

    @FindBy (css = "div[id='rightPanel']>p")
    private WebElement verify;

    @FindBy (css= "div[ng-if='showOverview']>h1")
    private WebElement loginVerify;

    @FindBy (className = "error")
    private WebElement invalidVerify;

    @FindBy (linkText = "Log Out")
    private WebElement logout;

    @FindBy (name = "payee.name")
    private WebElement payeeName;

    @FindBy (name = "payee.accountNumber")
    private WebElement payeeAccountNumber;

    @FindBy (name = "verifyAccount")
    private WebElement payeeVerifyAccount;

    @FindBy (name = "amount")
    private WebElement amount;

    @FindBy (css = "[value='Send Payment']")
    private WebElement sendPayment;

    @FindBy (css = "div[ng-show='showResult']>h1")
    private WebElement verifyPayment;





    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "firstname" : myElement=firstname; break;
            case "lastname" : myElement=lastname; break;
            case "streetAddress" : myElement=streetAddress; break;
            case "cityAddress" : myElement=cityAddress; break;
            case "stateAddress" : myElement=stateAddress; break;
            case "zipCode" : myElement=zipCode; break;
            case "phoneNumber" : myElement=phoneNumber; break;
            case "ssn" : myElement=ssn; break;
            case "username" : myElement=username; break;
            case "password" : myElement=password; break;
            case "repeatedPassword" : myElement=repeatedPassword; break;
            case "payeeName" : myElement=payeeName; break;
            case "payeeAccountNumber" : myElement=payeeAccountNumber; break;
            case "payeeVerifyAccount" : myElement=payeeVerifyAccount; break;
            case "amount" : myElement=amount; break;



        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "submit" : myElement=submit; break;
            case "logout" : myElement=logout; break;
            case "sendPayment" : myElement=sendPayment; break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "verify" : myElement=verify; break;
            case "loginVerify" : myElement=loginVerify; break;
            case "invalidVerify" : myElement=invalidVerify; break;
            case "verifyPayment" : myElement=verifyPayment; break;

        }

        verifyContainsText(myElement, text);

    }

}
