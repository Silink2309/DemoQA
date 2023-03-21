import elements.RadioButton;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class RadioButtonTest {
    WebDriver driver;
    String url ="https://demoqa.com/radio-button";
    @Before
    public void openTest(){
        driver = new SafariDriver();
        driver.get(url);
    }
    @Test
    public void testYesButton(){
        RadioButton objRadioButton = new RadioButton(driver);
        objRadioButton.testYesButton();
    }
    @Test
    public void testImpressiveButton(){
        RadioButton objRadioButton = new RadioButton(driver);
        objRadioButton.testImpressiveButton();
    }
    @Test
    public void testNoButton(){
        RadioButton objRadioButton = new RadioButton(driver);
        objRadioButton.testNoButton();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
