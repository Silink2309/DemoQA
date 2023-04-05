import elements.CheckBox;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CheckBoxTest extends  BaseTest{
    CheckBox objCheckBox =new CheckBox(getDriver());

    @Before
    public void openTest(){
        openUrl(Url.urlCheckBox);

    }

    @Test
    public void checkBox(){
       objCheckBox.wholeListTest();
    }
    @Test
    public void desktopTest(){
        objCheckBox.desktopTest();

    }
    @Test
    public void documentTest(){
        objCheckBox.documentTest();
    }
    @Test
    public void workSpaceTest(){
        objCheckBox.workSpaceTest();
    }
    @Test
    public void officeBoxTest(){
        objCheckBox.officeBoxTest();
    }
    @Test
    public void downloadBoxTest(){
        objCheckBox.downloadBoxTest();
    }
    @Test
    public void notesBoxTest(){
        objCheckBox.notesBoxTest();
    }
    @Test
    public void commandsBoxTest(){
        objCheckBox.commandsBoxTest();
    }
    @Test
    public void reactBoxTest(){
        objCheckBox.reactBoxTest();
    }
    @Test
    public void angularBoxTest(){
        objCheckBox.angularBoxTest();
    }
    @Test
    public void veuBoxTest(){
        objCheckBox.veuBoxTest();
    }
    @Test
    public void publicBoxTest(){
        objCheckBox.publicBoxTest();
    }
    @Test
    public void privateBoxTest(){
        objCheckBox.privateBoxTest();
    }
    @Test
    public void classifieldBoxTest(){
        objCheckBox.classifieldBoxTest();
    }
    @Test
    public void generalBoxTest(){
        objCheckBox.generalBoxTest();
    }
    @Test
    public void wordBoxTest(){
        objCheckBox.wordBoxTest();
    }
    @Test
    public void excelBoxTest(){
        objCheckBox.excelBoxTest();
    }
    @After
    public void quitDriver() {
        baseAfter(getDriver());
    }

}
