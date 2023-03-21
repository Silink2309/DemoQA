import elements.CheckBox;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxTest {
    WebDriver driver;
    String url ="https://demoqa.com/checkbox";
    @Before
    public void openTest(){
        driver = new SafariDriver();
       // driver =new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void checkBox(){
       CheckBox objCheckBox =new CheckBox(driver);
       objCheckBox.wholeListTest();
    }
    @Test
    public void desktopTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.desktopTest();

    }
    @Test
    public void documentTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.documentTest();
    }
    @Test
    public void workSpaceTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.workSpaceTest();
    }
    @Test
    public void officeBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.officeBoxTest();
    }
    @Test
    public void downloadBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.downloadBoxTest();
    }
    @Test
    public void notesBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.notesBoxTest();
    }
    @Test
    public void commandsBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.commandsBoxTest();
    }
    @Test
    public void reactBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.reactBoxTest();
    }
    @Test
    public void angularBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.angularBoxTest();
    }
    @Test
    public void veuBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.veuBoxTest();
    }
    @Test
    public void publicBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.publicBoxTest();
    }
    @Test
    public void privateBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.privateBoxTest();
    }
    @Test
    public void classifieldBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.classifieldBoxTest();
    }
    @Test
    public void generalBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.generalBoxTest();
    }
    @Test
    public void wordBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.wordBoxTest();
    }
    @Test
    public void excelBoxTest(){
        CheckBox objCheckBox =new CheckBox(driver);
        objCheckBox.excelBoxTest();
    }
    @After
    public void tearDown() {
       driver.quit();
    }

}
