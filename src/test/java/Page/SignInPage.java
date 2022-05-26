package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    private WebElement emailInput(){
        return getElementByXpath("//input[@id='auth_email']");
    }

    private WebElement passInput(){
        return getElementByXpath("//input[@id='auth_pass']");
    }

    private WebElement signInBtn(){
        return getElementByXpath("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']");
    }

    private WebElement messageErrorRobot(){
        return getElementByXpath("//p[@class='error-message error-message_color_red']");
    }

    private WebElement messageEmptyFields(){
        return getElementByXpath("//p[@class='error-message ng-star-inserted']");
    }


    public void enterValidDataEmailInput(){
        emailInput().sendKeys("remont.brovary@gmail.com");
    }

    public void enterValidDataPassInput(){
        passInput().sendKeys("VAPRJ877YHtP");
    }

    public void clickSignInBtn(){
        signInBtn().click();
    }

    public void checkMessageErrorRobot(){
        Assert.assertTrue(messageErrorRobot().isDisplayed());
    }

    public void checkMessageEmptyFields(){
        Assert.assertTrue(messageEmptyFields().isDisplayed());
    }
}
