import elements.CheckBox;
import elements.RadioButton;
import elements.TextBox;
import elements.WebTables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BaseTest  {
    private WebDriver driver = new SafariDriver();
    CheckBox objCheckBox = new CheckBox(driver);
    TextBox objTextBox = new TextBox(driver);
    RadioButton objRadioButton = new RadioButton(driver);
    WebTables objWebTables = new WebTables(driver);

    public void openUrl(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    public WebDriver getDriver(){
        return driver;
    }
    public void baseAfter(WebDriver driver) {
        driver.quit();
    }
}
