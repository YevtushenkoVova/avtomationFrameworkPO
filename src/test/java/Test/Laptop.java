package Test;

import Page.HomePage;
import Page.ProductPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Laptop extends TestInit {

    @Test
    public void checkUrlLaptop() {
        openRozetka();
        new HomePage(driver)
                .enterProductInSearch("Ноутбук")
                .openPageProduct()

                .checkLincLaptop();
    }

    @Test
    public void checkFiltreBrendLaptop() {
        openRozetka();
        new HomePage(driver)
                .enterProductInSearch("Ноутбук")
                .openPageProduct();
        new ProductPage(driver)
                .rozetkaSalerFiltreClick()
                .hpFiltreClick()

                .checkFiltreHP();
    }

    @Test
    public void checkMonitor(){
        openRozetka();
        new HomePage(driver)
        .enterProductInSearch("Мониторы")
        .openPageProduct();
  new ProductPage(driver)
        .rozetkaSalerFiltreClick()
        .hpFiltreClick()

        .checkFiltreHP();
    }

    @Test
    public void checkMFU() {
        openRozetka();
        new HomePage(driver)
                .enterProductInSearch("some text");
    }
}
