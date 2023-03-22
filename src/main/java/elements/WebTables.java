package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebTables {
    WebDriver driver;
    public WebTables (WebDriver driver){
        this.driver=driver;
    }

    // Локаторы регистрации
    private final By addUserButton = By.xpath("//button[@class='btn btn-primary']");
             private final By firstNameFiled = By.id("firstName");
             private final By lastNameFiled = By.id("lastName");
             private final By emailFiled = By.id("userEmail");
             private final By ageFiled = By.id("age");
             private final By salaryFiled = By.id("salary");
             private final By departmentFiled = By.id("department");
             private final By submitButton = By.id("submit");
    private final By pageFiled =By.xpath("//input[@type='number']");
    private final By fieldSearch = By.className("form-control");

    //Локаторы Изменения уже созданных записей
    private final By editButton = By.xpath("(//span[@class='mr-2'])[3]");
    private final By deleteButton = By.xpath("(//span[@title='Delete'])[3]");

    //Локаторы колличества отображений строк в таблице
    private  final By rowsButton = By.xpath("//span[@class='select-wrap -pageSizeOptions']//select[1]");
            private final By buttonRowsFive = By.xpath("");
            private final By buttonRowsTen = By.xpath("");
            private final By buttonRowsTwenty = By.xpath("");
            private final By buttonRowsTwentyFive = By.xpath("");
            private final By buttonRowsFifty = By.xpath("");
            private final By buttonRowsHundred =By.xpath("");


   //Клики
    public void clickAddUserButton(){driver.findElement(addUserButton).click();}
    public void clickEditButton(){driver.findElement(editButton).click();}
    public void clickDeleteButton(){driver.findElement(deleteButton).click();}
    public void clickRowsButton(){driver.findElement(rowsButton).click();}
    public void clickSubmitButton(){driver.findElement(submitButton).click();}

    //Заполнение полей регистрации
        public void fillFirstNameRegister(String firstName){driver.findElement(firstNameFiled).sendKeys(firstName);}
        public void fillLastNameFiledRegister(String lastName){driver.findElement(lastNameFiled).sendKeys(lastName);}
        public void fillEmailFiledRegister(String email){driver.findElement(emailFiled).sendKeys(email);}
        public void fillAgeFiledRegister(String age){driver.findElement(ageFiled).sendKeys(age);}
        public void fillSalaryFiledRegister(String salary){driver.findElement(salaryFiled).sendKeys(salary);}
        public void fillDepartmentFiledRegister(String department){driver.findElement(departmentFiled).sendKeys(department);}


    public void waitForLoad(By selector) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(selector));
    }

    public void deleteFiled(By selector){
        WebElement changesDelete = driver.findElement(selector);
        changesDelete.clear();
    }
//Добавление пользователя
public void addTest(String firstName,String lastName,String email,String age,String salary,String department){
    waitForLoad(addUserButton);
    clickAddUserButton();
    waitForLoad(firstNameFiled);
    fillFirstNameRegister(firstName);
    fillLastNameFiledRegister(lastName);
    fillEmailFiledRegister(email);
    fillAgeFiledRegister(age);
    fillSalaryFiledRegister(salary);
    fillDepartmentFiledRegister(department);
    clickSubmitButton();
}

//Изменение уже созданного пользователя
    public void editTest(String firstName,String lastName,String email,String age,String salary,String department){
        waitForLoad(editButton);
        clickEditButton();
        waitForLoad(firstNameFiled);
        deleteFiled(firstNameFiled);
        fillFirstNameRegister(firstName);
        deleteFiled(lastNameFiled);
        fillLastNameFiledRegister(lastName);
        deleteFiled(emailFiled);
        fillEmailFiledRegister(email);
        deleteFiled(ageFiled);
        fillAgeFiledRegister(age);
        deleteFiled(salaryFiled);
        fillSalaryFiledRegister(salary);
        deleteFiled(departmentFiled);
        fillDepartmentFiledRegister(department);
        clickSubmitButton();
    }



}
