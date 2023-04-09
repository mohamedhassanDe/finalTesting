package org.example.pages.login;


import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginActions {
    LoginPo loginPo;

    public LoginActions(){
        loginPo=new LoginPo();

    }
    public void navigateToLoginPage() {

            Hooks.driver.findElement(loginPo.LoginIcon).click();

    }

    public void loginBtnClick(){
        Hooks.driver.findElement(loginPo.LoginBtn).click();
    }
    public void setInputField(int x,String y){
    switch (x){
        case 1 :
            //Enter Email
            Hooks.driver.findElement(loginPo.EmailInputFeild).sendKeys(y);
            System.out.println("donw from 1");
            break;
        case 2:
            //Enter Password
            Hooks.driver.findElement(loginPo.password).sendKeys(y);
            System.out.println("donw from 2");
            break;
    }
    }

    public String checkSuccessfulState() {

        return Hooks.driver.getCurrentUrl();



    }

    public boolean MyAccountIsDisplayed() {
        if(Hooks.driver.findElement(loginPo.MyAccountTab).isDisplayed()){
        return true;}
        else {
            return false;
        }
    }

    public String getErrorMeassge() {
        String erroMeassage=Hooks.driver.findElement(loginPo.ErrorMeassage).getText();
        System.out.println(erroMeassage);
        return erroMeassage;
    }

    public String getColor() {
        WebElement t = Hooks.driver.findElement(loginPo.ErrorMeassage);
        String s = t.getCssValue("color");
        String c = Color.fromString(s).asHex();
        return c;
    }

    public String getInputText(int i) {
        By x=null;
        switch (i){
            case 1:
                x=loginPo.EmailInputFeild;
                break;
            case 2:
                x=loginPo.password;
                break;
        }
        String result=Hooks.driver.findElement(x).getAttribute("value");
        return result;
    }
}
