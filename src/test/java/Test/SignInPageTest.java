package Test;

import Page.HomePage;
import Page.SignInPage;
import org.testng.annotations.Test;

public class SignInPageTest extends TestInit{

    @Test
    public void checkValidSignIn(){
        openRozetka();
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInBtn();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.enterValidDataEmailInput();
        signInPage.enterValidDataPassInput();
        signInPage.clickSignInBtn();

        signInPage.checkMessageErrorRobot();
    }

    @Test
    public void checkEmptyFieldsSignIn(){
        openRozetka();
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInBtn();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickSignInBtn();

        signInPage.checkMessageEmptyFields();
    }
}
