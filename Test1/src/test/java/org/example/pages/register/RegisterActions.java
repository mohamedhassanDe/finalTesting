package org.example.pages.register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterActions {
    RegisterPo registerPo;

    public RegisterActions() {
        registerPo = new RegisterPo();
    }

    public void navigateToRegisterationPage() {
        Hooks.driver.findElement(registerPo.RegisterationIcon).click();
    }

    public void selectCheckBox( String x){
        switch (x){
        case "Newsletter":
                Hooks.driver.findElement(registerPo.NewsletterCheckBox).click();
                break;
    }}
    public void selectRadioButton(int x) {
        if (x == 1) {
            Hooks.driver.findElement(registerPo.maleRadioButton).click();
        } else if (x == 2) {
            Hooks.driver.findElement(registerPo.femaleRadioButton).click();

        }
    }

    public void setInputField(int x, String y) {
        if (x == 1) {
            //set firstName
            Hooks.driver.findElement(registerPo.FirstNameInputFeild).sendKeys(y);
        } else if (x == 2) {
            //set lastName
            Hooks.driver.findElement(registerPo.LastNameInputFeild).sendKeys(y);
        } else if (x == 3) {
            //set Email
            Hooks.driver.findElement(registerPo.EmailInputFeild).sendKeys(y);
        } else if (x==4) {
            //set company Name
            Hooks.driver.findElement(registerPo.CompanyName).sendKeys(y);

        } else if (x==5) {
            //set password
            Hooks.driver.findElement(registerPo.password).sendKeys(y);

        } else if (x==6) {
            //set ConfirmPassword
            Hooks.driver.findElement(registerPo.ConfirmPassword).sendKeys(y);

        }
    }

    public void selectDropDownMenuItem(int x, String y) {
        if (x == 1) {
            WebElement DropDown = Hooks.driver.findElement(registerPo.DayDropDownMenu);
            Select selectElement = new Select(DropDown);
            selectElement.selectByVisibleText(y);
        } else if (x == 2) {
            WebElement DropDown = Hooks.driver.findElement(registerPo.MonthDropDownMenu);
            Select selectElement = new Select(DropDown);
            selectElement.selectByVisibleText(y);
        } else if (x == 3) {
            WebElement DropDown = Hooks.driver.findElement(registerPo.YearDropDownMenu);
            Select selectElement = new Select(DropDown);
            selectElement.selectByVisibleText(y);
        }

    }


    public void ClickOnBtn(String x) {
        switch (x){
            case "RegesterBtn":
                Hooks.driver.findElement(registerPo.RegisterButton).click();
                break;
    }}

    public String getSuccessText() {
        System.out.println("...Check Done...");
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerPo.SuccessText));
        return Hooks.driver.findElement(registerPo.SuccessText).getText();
    }

    public String getTextColor() {
        return Hooks.driver.findElement(registerPo.resultText).getCssValue("color");
    }

    public boolean IsClicked(int z) {
        if (z==1) {

            return Boolean.parseBoolean(Hooks.driver.findElement(registerPo.maleRadioButton).getAttribute("checked"));

        } else {
            return Boolean.parseBoolean(Hooks.driver.findElement(registerPo.femaleRadioButton).getAttribute("checked"));

        }

    }

    public String getInputText(int x){
        if(x==1){
            return Hooks.driver.findElement(registerPo.FirstNameInputFeild).getAttribute("value");
        }
        else if(x==2) {
            return Hooks.driver.findElement(registerPo.LastNameInputFeild).getAttribute("value");
        } else if (x==3) {
            return Hooks.driver.findElement(registerPo.EmailInputFeild).getAttribute("value");
        } else if (x==4) {
            return Hooks.driver.findElement(registerPo.CompanyName).getAttribute("value");
        } else if (x==5) {
            return Hooks.driver.findElement(registerPo.password).getAttribute("value");
        } else if (x==6) {
            return Hooks.driver.findElement(registerPo.ConfirmPassword).getAttribute("value");
        }else{return null;}
    }

    public String CheckSelectedDate(int x) {
       // String x= Hooks.driver.findElement(registerPo.DayDropDownMenu).getText();
       // System.out.println(x);
        By y= null;
        switch (x){
            case 1:
                y=registerPo.DayDropDownMenu;
                break;
            case 2:
                y=registerPo.MonthDropDownMenu;
                break;
            case 3:
                y=registerPo.YearDropDownMenu;
                break;
        }
        Select select = new Select(Hooks.driver.findElement(y));
        WebElement option = select.getFirstSelectedOption();
        String defaultItem = option.getText();
        System.out.println(defaultItem );
        return defaultItem;
    }
}
