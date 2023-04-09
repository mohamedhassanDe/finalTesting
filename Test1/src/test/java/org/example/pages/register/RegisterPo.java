package org.example.pages.register;

import org.openqa.selenium.By;

public class RegisterPo {
public By RegisterationIcon=By.xpath("//a[@class='ico-register']");

public By maleRadioButton=By.id("gender-male");

public By femaleRadioButton=By.xpath("//input[@id='gender-female']");

public By coputerIcon=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");


    public By FirstNameInputFeild=By.id("FirstName");
    public By LastNameInputFeild=By.id("LastName");

    public By EmailInputFeild=By.id("Email");

    public By DayDropDownMenu=By.xpath("//select[@name='DateOfBirthDay']");

    public By MonthDropDownMenu=By.xpath("//select[@name='DateOfBirthMonth']");

    public By CompanyName=By.id("Company");
    public By password=By.id("Password");
    public By ConfirmPassword=By.id("ConfirmPassword");

    public By NewsletterCheckBox=By.id("Newsletter");

    public By RegisterButton=By.id("register-button");
    public By YearDropDownMenu=By.xpath("//select[@name='DateOfBirthYear']");
    public By SuccessText=By.xpath("//div[@class='result']");
    public By resultText=By.className("result");
}
