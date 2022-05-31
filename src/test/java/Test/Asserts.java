package Test;

import Page.HomePage;
import Page.ProductPage;
import org.testng.annotations.Test;

public class Asserts extends TestInit{

    @Test
    public void checkNumberPage(){
        openRozetka();
        new HomePage(driver)
                .enterProductInSearch("Sony")
                .openPageProduct();
        new ProductPage(driver)
                .clickPage3Prod()

                .checkNumber3URL()
                .checkNumber3Text()
                .checkNumber3IsDisp();

    }
}
