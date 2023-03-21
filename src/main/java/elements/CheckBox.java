package elements;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CheckBox {
    private WebDriver driver;
    public CheckBox(WebDriver driver){
        this.driver=driver;
    }

//Локаторы кнопок
    private final By dropDown = By.cssSelector("#tree-node > ol > li > span > button > svg");
    private final By buttonPlus= By.cssSelector("#tree-node > div > button.rct-option.rct-option-expand-all > svg");
    private final By buttonMinus =By.cssSelector("#tree-node > div > button.rct-option.rct-option-collapse-all > svg");
//Локаторы Чекбоксов
    private final By homeBox = By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg");
    private final By result =By.id("result");
    private final By desktopBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    private final By documentBox =By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");
    private final By workSpaceBox =By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    private final By officeBox =By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");

    private final By downloadBox =By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg");
    private final By notesBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    private  final By commandsBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");
    private  final By reactBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    private  final By angularBox =By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg");
    private final By veuBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg");
    private  final By publicBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    private  final By privateBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg > path");
    private  final By classifieldBox =By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg");
    private  final By generalBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > ol > li:nth-child(4) > span > label > span.rct-checkbox > svg");
    private  final By wordBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg");
    private  final By excelBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg ");

//Клики на каждый чекбокс
    public void clickExcelBox(){driver.findElement(excelBox).click();}
    public void clickWordBox(){driver.findElement(wordBox).click();}
    public void clickGeneralBox(){driver.findElement(generalBox).click();}
    public void clickClassifileldBox(){driver.findElement(classifieldBox).click();}
    public void clickPrivateBox(){driver.findElement(privateBox).click();}
    public void clickPublicBox(){driver.findElement(publicBox).click();}
    public void clickVeuBox(){driver.findElement(veuBox).click();}
    public void clickAngularBox (){driver.findElement(angularBox).click();}
    public void clickReactBox(){driver.findElement(reactBox).click();}
    public void clickCommandsBox(){driver.findElement(commandsBox).click();}
    public void clickNotesBox(){driver.findElement(notesBox).click();}
    public void clickDownloadBox(){driver.findElement(downloadBox).click();}
    public void clickOfficeBox (){driver.findElement(officeBox).click();}
    public void clickWorkSpaceBox(){driver.findElement(workSpaceBox).click();}
    public void clickDocumentBox(){driver.findElement(documentBox).click();}
    public void clickButtonPlus(){driver.findElement(buttonPlus).click();}
    public void clickButtonMinus(){driver.findElement(buttonMinus).click();}
    public void clickDesktop(){driver.findElement(desktopBox).click();}
    public void clickHomeBox(){driver.findElement(homeBox).click();}
    public void clickDropDown(){
        driver.findElement(dropDown).click();
    }

    public void fullScreen(){driver.manage().window().maximize();}
    public String actualResult(){
        return driver.findElement(result).getText();
    }
    public void waitForLoad(By selector) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(selector));
    }

        public void buttonMinusTest(){
            clickButtonPlus();
            clickButtonMinus();
        }
        public void wholeListTest(){
                fullScreen();
                clickHomeBox();
                waitForLoad(homeBox);
                clickDropDown();
                 Assert.assertEquals("Erorr","You have selected :homedesktopnotescommandsdocumentsworkspacereactangularveuofficepublicprivateclassifiedgeneraldownloadswordFileexcelFile",actualResult());
}
        public void desktopTest(){
            fullScreen();
             clickButtonPlus();
             waitForLoad(desktopBox);
             clickDesktop();
            Assert.assertEquals("Erorr","You have selected :desktopnotescommands", actualResult());

        }
        public void documentTest(){
            fullScreen();
             clickButtonPlus();
             waitForLoad(documentBox);
             clickDocumentBox();
            Assert.assertEquals("Erorr","You have selected :documentsworkspacereactangularveuofficepublicprivateclassifiedgeneral",actualResult());


        }
        public void workSpaceTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(workSpaceBox);
            clickWorkSpaceBox();
            Assert.assertEquals("Erorr","You have selected :workspacereactangularveu",actualResult());

        }
        public void officeBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(officeBox);
            clickOfficeBox();
            Assert.assertEquals("Erorr","You have selected :officepublicprivateclassifiedgeneral",actualResult());

        }

        public  void downloadBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(downloadBox);
            clickDownloadBox();
            Assert.assertEquals("Erorr","You have selected :homedesktopnotescommandsdocumentsworkspacereactangularveuofficepublicprivateclassifiedgeneraldownloadswordFileexcelFile",actualResult());

        }

        public void notesBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(notesBox);
            clickNotesBox();
            Assert.assertEquals("Erorr","You have selected :notes",actualResult());

        }
        public void commandsBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(commandsBox);
            clickCommandsBox();
            Assert.assertEquals("Erorr","You have selected :commands",actualResult());

        }
        public void reactBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(reactBox);
            clickReactBox();
            Assert.assertEquals("Erorr","You have selected :react",actualResult());

        }
        public void angularBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(angularBox);
            clickAngularBox();
            Assert.assertEquals("Erorr","You have selected :angular",actualResult());

        }
        public void veuBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(veuBox);
            clickVeuBox();
            Assert.assertEquals("Erorr","You have selected :veu",actualResult());

        }
        public void publicBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(publicBox);
            clickPublicBox();
            Assert.assertEquals("Erorr","You have selected :public",actualResult());

        }
        public void privateBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(privateBox);
            clickPrivateBox();
            Assert.assertEquals("Erorr","You have selected :homedesktopnotescommandsdocumentsworkspacereactangularveuofficepublicprivateclassifiedgeneraldownloadswordFileexcelFile",actualResult());

        }
        public void classifieldBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(classifieldBox);
            clickClassifileldBox();
            Assert.assertEquals("Erorr","You have selected :classified",actualResult());

        }
        public  void generalBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(generalBox);
            clickGeneralBox();
            Assert.assertEquals("Erorr","You have selected :general",actualResult());

        }
        public void wordBoxTest(){
            fullScreen();
            clickButtonPlus();
            waitForLoad(wordBox);
            clickWordBox();
            Assert.assertEquals("Erorr","You have selected :workspacereactangularveu",actualResult());

        }
        public void excelBoxTest(){
            fullScreen();
            clickButtonPlus();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(excelBox).click();
            clickExcelBox();
            Assert.assertEquals("Erorr","You have selected :homedesktopnotescommandsdocumentsworkspacereactangularveuofficepublicprivateclassifiedgeneraldownloadswordFileexcelFile",actualResult());

        }
}