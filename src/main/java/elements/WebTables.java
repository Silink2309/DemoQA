package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTables {
    WebDriver driver;
    public WebTables (WebDriver driver){
        this.driver=driver;
    }

    // Локаторы регистрации
    private final By addUserButton = By.xpath("//button[@class='btn btn-primary']");
             private final By firstNameFiledRegister = By.xpath("(//input[@class=' mr-sm-2 form-control'])[1]");
             private final By lastNameFiledRegister = By.xpath("(//input[@class=' mr-sm-2 form-control'])[2]");
             private final By emailFiledRegister = By.xpath("");
             private final By ageFiledRegister = By.xpath("");
             private final By salaryFiledRegister = By.xpath("");
             private final By departmentFiledRegister = By.xpath("");
             private final By submitButtonRegister = By.xpath("");
    private final By pageFiled =By.xpath("//input[@type='number']");
    private final By fieldSearch = By.className("form-control");

    //Локаторы Изменения уже созданных записей
    private final By editButton = By.xpath("(//span[@class='mr-2'])[3]");
            private final By firstNameFiledEdit = By.xpath("(//input[@class=' mr-sm-2 form-control'])[1]");
            private final By lastNameFiledEdit = By.xpath("(//input[@class=' mr-sm-2 form-control'])[2]");
            private final By emailFiledEdit = By.xpath("");
            private final By ageFiledEdit = By.xpath("");
            private final By salaryFiledEdit = By.xpath("");
            private final By departmentFiledEdit = By.xpath("");
            private final By submitButtonEdit = By.xpath("");


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
    public void clickSubmitButton(){driver.findElement(submitButtonRegister).click();}

    //Заполнение полей регистрации
        public void fillFirstNameRegister(String firstName){driver.findElement(firstNameFiledRegister).sendKeys(firstName);}
        public void fillLastNameFiledRegister(String lastName){driver.findElement(lastNameFiledRegister).sendKeys(lastName);}
        public void fillEmailFiledRegister(String email){driver.findElement(emailFiledRegister).sendKeys();}
        public void fillAgeFiledRegister(String age){driver.findElement(emailFiledRegister).sendKeys();}
        public void fillSalaryFiledRegister(String salary){driver.findElement(salaryFiledRegister).sendKeys();}
        public void fillDepartmentFiledRegister(String department){driver.findElement(departmentFiledRegister).sendKeys();}
}
