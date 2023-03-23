import elements.Buttons;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ButtonsTest extends BaseTest {
    Buttons objButtons = new Buttons(getDriver());
    @Before
    public void openTest(){
        openUrl(Url.urlButtons);
    }

    @Test
    public void doubleClickTest(){
        objButtons.doubleClick();
    }
    @Test
    public void rightClickTest(){
        objButtons.rightClick();
    }
    @Test
    public void clickMeTest(){
        objButtons.clickMe();
    }
    @After
    public void quitDriver() {
        baseAfter(getDriver());
    }
}
