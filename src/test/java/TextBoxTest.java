
import elements.TextBox;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TextBoxTest {
    WebDriver driver;
    @Before
    public void openTest(){
        driver = new SafariDriver();
        driver.get("https://demoqa.com/text-box");
    }
    @Test
    public void fillFormAndSend(){
        TextBox objTextBox = new TextBox(driver);
        objTextBox.fillForm("Maks","rigt@gmail.com","Moscow","Moscow");

    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
