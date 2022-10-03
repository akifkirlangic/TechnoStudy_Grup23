package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuContent extends Parent{

    public MenuContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//*[text()='Register']")
    private WebElement register;

    @FindBy (css="[name='username']")
    private WebElement login_username;


    @FindBy (css="[name='password']")
    private WebElement login_password;

    @FindBy (css="[value='Log In']")
    private WebElement login;

    @FindBy (linkText = "Bill Pay")
    private WebElement billpayButton;




    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)

        {

            case "register" : myElement=register; break;
            case "login" : myElement=login; break;
            case  "billpayButton" : myElement=billpayButton; break;

        }

        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "login_username" : myElement=login_username; break;
            case "login_password" : myElement=login_password; break;

        }

        sendKeysFunction(myElement, value);
    }
}
