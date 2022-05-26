package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private WebElement rozetkaSalerFiltre(){
        return getElementByXpath("//a[@data-id='Rozetka']");
    }

    private WebElement hpFiltre(){
        return getElementByXpath("//a[@data-id='HP']");
    }

    private List<WebElement> listProd(){
        return getElementsByXpath("//span[@class='goods-tile__title']");
    }

    //Method

    public ProductPage rozetkaSalerFiltreClick(){
        rozetkaSalerFiltre().click();
        return this;
    }

    public ProductPage hpFiltreClick(){
        hpFiltre().click();
        return this;
    }

    public void getListProd(int i){
        listProd().get(i);
    }

    public ProductPage checkFiltreHP(){
        for(int i = 0; i < listProd().size() - 1; i++){
            System.out.println(i);
           Assert.assertTrue(listProd().get(i).getText().contains("HP"));
        }return this;
    }
}
