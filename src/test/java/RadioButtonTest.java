import elements.RadioButton;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RadioButtonTest extends BaseTest {
    RadioButton objRadioButton = new RadioButton(getDriver());
    @Before
    public void openTest(){
      openUrl(СonstantUrl.urlRadioButton);
    }
    @Test
    public void testYesButton(){
        objRadioButton.testYesButton();
    }
    @Test
    public void testImpressiveButton(){
        objRadioButton.testImpressiveButton();
    }
    @Test
    public void testNoButton(){
        objRadioButton.testNoButton();
    }
    @After
    public void quitDriver() {
        baseAfter(getDriver());
    }
}
