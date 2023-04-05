package elements;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RadioButton {
    WebDriver driver;
    public RadioButton(WebDriver driver){
        this.driver=driver;
    }
//Локаторы
    private final By yesButton = By.xpath("//label[@for='yesRadio']");
    private final By impressiveButton = By.xpath("(//label[@class='custom-control-label'])[2]");
    private final By noButton = By.xpath("//input[@id=noRadio]");

    private final By result =By.className("mt-3");
//Клик

    public void clickYesButton(){driver.findElement(yesButton).click();}
    public void clickImpressiveButton(){driver.findElement(impressiveButton).click();}
    public void clickNoButton(){driver.findElement(noButton).click();}

    public void waitForLoad(By selector) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(selector));
    }
         public String actualResult(){ return driver.findElement(result).getText();}
//Тело тестов
        public void testYesButton(){
            waitForLoad(yesButton);
            clickYesButton();
            Assert.assertEquals("Ошибка","You have selected Yes",actualResult());
        }

        public void testImpressiveButton(){
        waitForLoad(impressiveButton);
        clickImpressiveButton();
        Assert.assertEquals("Ошибка","You have selected Impressive",actualResult());
        }

        public void testNoButton(){
        waitForLoad(noButton);
        clickNoButton();
        Assert.assertEquals("Ошибка","You have selected No",actualResult());
        }

}
