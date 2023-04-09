package org.example.pages.login;

import org.openqa.selenium.By;

public class LoginPo {
public By LoginIcon= By.className("ico-login");
public By LoginBtn=By.xpath("//button[normalize-space()='Log in']");
public By rememberMeCheckBox=By.xpath("//input[@id='RememberMe']");

public By EmailInputFeild=By.id("Email");
    public By password=By.id("Password");
    public By MyAccountTab=By.className("ico-account");
    public By ErrorMeassage=By.xpath("//div[@class='message-error validation-summary-errors']");
}
