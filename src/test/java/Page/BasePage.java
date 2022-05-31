package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public abstract class BasePage {

    protected WebDriver driver;

    private int BASIC_TIME = 15;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

//    public WebElement getFindElementWithWait(String XPath){
//        WebDriverWait wait = new WebDriverWait(Duration.ofSeconds(10)
//        return wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(XPath)));
//    }

    public WebElement getElementByXpath(String locator) {
        return waitElementToBeClickable(locator);
    }

    public WebElement waitElementToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        return wait.until(elementToBeClickable(By.xpath(locator)));
    }

    public List<WebElement> getElementsByXpath(String lokator){
        return waitVisibilityOfAllElementsLocatedBy(lokator) ;
    }

    public List<WebElement> waitVisibilityOfAllElementsLocatedBy(String lokator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(lokator)));
    }

    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
