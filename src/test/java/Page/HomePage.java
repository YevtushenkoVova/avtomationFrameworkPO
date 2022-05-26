package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String productLaptop = "Ноутбук";

    public final String productTV = "Мониторы";



    private String url_prod = "https://rozetka.com.ua/notebooks/c80004/#search_text=%D0%BD%D0%BE%D1%83%D1%82%D0%B1%D1%83%D0%BA";

    // WebElement

    private WebElement input() {

        return getElementByXpath("//input");
    }

    private WebElement searchBtn() {
        return getElementByXpath("//button[text()=' Найти ']");
    }

    private WebElement signInBtn(){
        return getElementByXpath("//rz-user/button[@class='header__button ng-star-inserted']");
    }

    private WebElement sideMenu(){
        return getElementByXpath("//button[@data-testid='side-menu-close']");
    }

    private WebElement laptopLinck(){
        return getElementByXpath("//span[text()='Компьютеры и ноутбуки']");
    }

    // Method

    public void sideMenuClose(){
        if(sideMenu().isEnabled()) {
            sideMenu().click();
        }
    }

    public HomePage enterProductInSearch(String pro){
        input().sendKeys(pro);
        return this;
    }

    public HomePage openPageProduct(){
        searchBtn().click();
        return this;
    }
    public HomePage clickSignInBtn(){
        signInBtn().click();
        return this;
    }

    //Check

    public void checkLincLaptop(){
        Assert.assertTrue(laptopLinck().isDisplayed());
    }

}
