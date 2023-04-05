package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox {
    private WebDriver driver;
    public TextBox(WebDriver driver){
        this.driver=driver;
    }
//Локаторы полей
    private final By fullName = By.xpath("//input[@id='userName']");

    private final By fieldEmail = By.xpath("//input[@id='userEmail']");

    private  final By currentAddress = By.xpath("//*[@id='currentAddress']");

    private final By permanentAddress = By.xpath("//*[@id='permanentAddress']");
//Локатор кнопки отправить
    private final By toSend = By.xpath("//*[@id='submit']");


//Заполнение полей
        public void fillName (String name){ driver.findElement(fullName).sendKeys(name);}
        public void fillEmail (String email){ driver.findElement(fieldEmail).sendKeys(email);}
        public void fillCurrentAddress(String addressCurrent ){driver.findElement(currentAddress).sendKeys(addressCurrent);}
        public void fillPermanentAddress(String addressPermanent){driver.findElement(permanentAddress).sendKeys(addressPermanent);}

//Отправить
public void clickToSend (){driver.findElement(toSend).click();}
//Заполнение всей формы
    public void fillForm(String name ,String email,String addressCurrent,String addressPermanent){
            fillName(name);
            fillEmail(email);
            fillCurrentAddress(addressCurrent);
            fillPermanentAddress(addressPermanent);
            clickToSend();
    }

}
