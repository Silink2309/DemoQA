package elements;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Buttons {
    WebDriver driver;
    public Buttons(WebDriver driver){
        this.driver =driver;
    }
    private final By doubleClickButton = By.xpath("(//button[@class='btn btn-primary'])[1]");
    private final By rightClickButton = By.id("//button[@id='rightClickBtn']//ya-tr-span[1]");
    private final By clickMeButton = By.id("WTzbr");
    private final By resultDoubleClickMessage = By.id("doubleClickMessage");
    private final By resultRightMessage = By.id("rightClickMessage");
    private final By resultClickMeMassage = By.id("dynamicClickMessage");

    public void waitForLoad(By selector) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(selector));
    }
    public String actualResult(By locator){
        return driver.findElement(locator).getText();
    }
    public void doubleClick(){
        Actions actions = new Actions(driver);
        waitForLoad(doubleClickButton);
        WebElement element = driver.findElement(doubleClickButton);
        actions.doubleClick(element).perform();
        Assert.assertEquals("","You have done a double click",actualResult(resultDoubleClickMessage));
    }
    public void rightClick(){
        Actions actions = new Actions(driver);
        waitForLoad(rightClickButton);
        WebElement element = driver.findElement(rightClickButton);
        actions.contextClick(element).perform();
        Assert.assertEquals("","You have done a right click",actualResult(resultRightMessage));
    }
    public void clickMe(){
        waitForLoad(clickMeButton);
        driver.findElement(clickMeButton).click();
        Assert.assertEquals("","You have done a dynamic click",actualResult(resultClickMeMassage));
    }

}
