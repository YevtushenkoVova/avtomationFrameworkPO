package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private WebElement rozetkaSalerFiltre() {
        return getElementByXpath("//a[@data-id='Rozetka']");
    }

    private WebElement hpFiltre() {
        return getElementByXpath("//a[@data-id='HP']");
    }

    private List<WebElement> listProd() {
        return getElementsByXpath("//span[@class='goods-tile__title']");
    }

    private WebElement page3Product() {
        return getElementByXpath("//ul[@class='pagination__list']/li/a[text()='3']");
    }

    //Method

    public ProductPage rozetkaSalerFiltreClick() {
        rozetkaSalerFiltre().click();
        return this;
    }

    public ProductPage hpFiltreClick() {
        hpFiltre().click();
        return this;
    }

    public ProductPage clickPage3Prod() {
        page3Product().click();
        return this;
    }

    public void getListProd(int i) {
        listProd().get(i);
    }

    public ProductPage checkFiltreHP() {
        for (int i = 0; i < 3; i++) {
            if (listProd().size() > 10) {
                for (int j = 0; j < listProd().size(); j++) {
                    System.out.println(j);
                    Assert.assertTrue(listProd().get(j).getText().contains("HP"));
                }
            } else {
                sleep(100);
            }
        }
        return this;
    }


// Check

    public ProductPage checkNumber3URL() {
        Assert.assertEquals(driver.getCurrentUrl(), ("https://rozetka.com.ua/search/?page=3&text=Sony"));
        return this;
    }

    public ProductPage checkNumber3Text() {
        Assert.assertTrue(page3Product().getText().contains("3"));
        return this;
    }

    public ProductPage checkNumber3IsDisp() {
        Assert.assertTrue(getElementByXpath("//a[@class='pagination__link ng-star-inserted pagination__link--active'][text()='3']").isDisplayed());
        return this;
    }
}

