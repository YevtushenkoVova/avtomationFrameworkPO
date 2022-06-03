package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // WebElement

    private WebElement input() {
        return getElementByXpath("//input");
    }

    private WebElement searchBtn() {
        return getElementByXpath("//button[text()=' Найти ']");
    }

    private WebElement signInBtn() {
        return getElementByXpath("//rz-user/button[@class='header__button ng-star-inserted']");
    }

    private WebElement sideMenu() {
        return getElementByXpath("//button[@data-testid='side-menu-close']");
    }

    private WebElement laptopLink() {
        return getElementByXpath("//span[text()='Компьютеры и ноутбуки']");
    }

    private WebElement clickBtnHelpCenter() {
        return getElementByXpath("//a[@class='button button--medium button--with-icon main-links__help ng-star-inserted'][contains(text(), 'Справочный центр')]");
    }

    private WebElement clickBtnPay() {
        return getElementByXpath("//a[@class='link'][contains(text(),'Оплата')]");
    }

    private WebElement clickBtnCredit() {
        return getElementByXpath("//a[@class='section-list-link'][contains(text(),'Кредитирование и рассрочка')]");
    }
    private WebElement clickBtnHowToMakePayment() {
        return getElementByXpath("//a[@class='article-list-link'][contains(text(),'Как оформить оплату частями без карточек и бумаг от ROZETKA?')]");
}

    private WebElement helpСenter() {
        return getElementByXpath("//a[@class='button article-support-btn'][contains(text(),'Связаться с нами')]");
    }
    // Method

    public void sideMenuClose() {
        if (sideMenu().isEnabled()) {
            sideMenu().click();
        }
    }

    public HomePage enterProductInSearch(String pro) {
        input().sendKeys(pro);
        return this;
    }

    public HomePage openPageProduct() {
        searchBtn().click();
        return this;
    }

    public HomePage clickSignInBtn() {
        signInBtn().click();
        return this;
    }

    public HomePage clickButtonHelpCenter() {
        clickBtnHelpCenter().click();
        return this;
    }

    public HomePage clickpayHelp(){
        clickBtnPay().click();
        return this;
    }

    public HomePage clickCreditAndInstallments() {
        clickBtnCredit().click();
        return this;
    }

    public HomePage clickHowToMakePayment() {
        clickBtnHowToMakePayment().click();
        return this;
    }

    public void checkContactUs() {
        Assert.assertTrue(helpСenter().isDisplayed());
    }

    //Check

    public void checkLincLaptop() {
        Assert.assertTrue(laptopLink().isDisplayed());
    }


}
