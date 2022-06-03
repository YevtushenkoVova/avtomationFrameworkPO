package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;

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

    private WebElement getButtonHelpZSU() {
        return getElementByXpath("//a[@class='help-zsu header-actions__component']");
    }

    private WebElement getLupa() {
        return getElementByXpath("//i[@class='fa fa-search']");
    }

    private WebElement compBtn() {
        return getElementByXpath("//a[@class='menu-categories__link'][contains(text(),'Ноутбуки и компьютеры')]");
    }

    private WebElement getButtonNoutbuki() {
        return getElementByXpath("//a[@title='Ноутбуки'][contains(text(),'Ноутбуки')]");
    }

    private WebElement getComputerAsser() {
        return getElementByXpath("//a[@title='Ноутбук Acer Aspire 7 A715-42G-R0VS (NH.QBFEU.00A) Charcoal Black']");
    }

    private WebElement getButtonBasket() {
        return getElementByXpath("//span[@class='buy-button__label ng-star-inserted']");
    }

    private WebElement getBascet() {
        return getElementByXpath("//a[@class='button button_size_large button_color_green cart-receipt__submit ng-star-inserted']");
    }

    // Method

    public void sideMenuClose() {
        if (sideMenu().isEnabled()) {
            sideMenu().click();
        }
    }

    public void goToTwoTap() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
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

    public HomePage getButtonHelpZSUclick() {
        getButtonHelpZSU().click();
        goToTwoTap();
        return this;
    }

    public HomePage clickButtonComputer() {
        compBtn().click();
        return this;
    }

    public HomePage clickButtonNoutbuki() {
        getButtonNoutbuki().click();
        return this;
    }

    public HomePage getCompAsser() {
        getComputerAsser().click();
        return this;
    }

    public HomePage clickButtonBasket() {
        Actions actions = new Actions(driver);
        actions.moveToElement(input()).perform();
        getButtonBasket().click();
        return this;
    }

    //Check

    public void checkLincLaptop() {
        Assert.assertTrue(laptopLink().isDisplayed());
    }

    public void getLupasearch() {
        Assert.assertTrue(getLupa().isDisplayed());
    }

    public void getBascetsearch() {
        Assert.assertTrue(getBascet().isDisplayed());
    }

}


