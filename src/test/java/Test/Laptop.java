package Test;

import Page.HomePage;
import Page.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;

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
    public void checkMonitor() {
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

    @Test
    public void helpZSU() {
        openRozetka();
        new HomePage(driver)
                .getButtonHelpZSUclick()
                .getLupasearch();

    }

    @Test
    public void checkComputer() {
        openRozetka();
        new HomePage(driver)
                .clickButtonComputer()
                .clickButtonNoutbuki()
                .getCompAsser()
                .clickButtonBasket()
                .getBascetsearch();
    }

    @Test
    public void alcohol() {
        openRozetka();
        new HomePage(driver)
                .checkBattonAlcohol()
                .btnIncognito()
                .btnVine()
                .btnChizay();
        new ProductPage(driver)
                .checkFilterVine()
                .check12();
    }

    @Test
    public void start() {
        openRozetka();
    }
}

