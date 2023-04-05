
import elements.TextBox;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TextBoxTest extends BaseTest{
    TextBox objTextBox = new TextBox(getDriver());
    @Before
    public void openPage(){
        openUrl(Url.urlTextBox);
    }
    @Test
    public void fillFormAndSend(){
       // TextBox objTextBox = new TextBox(driv);
        objTextBox.fillForm("Maks","rigt@gmail.com","Moscow","Moscow");

    }
    @After
    public void quitDriver() {
        baseAfter(getDriver());
    }
}
