package org.example.stepDefs;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.example.pages.register.RegisterActions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    RegisterActions registerActions= new RegisterActions();

@Given("I navigate to register page")
    public void navigateToRegisterPage(){
    registerActions.navigateToRegisterationPage();
    //throw new PendingException();
}



    @Then("I select Gender {string}")
    public void iSelectGender(String gender) {
        SoftAssert softAssert=new SoftAssert();
        switch(gender){
            case "Male":
                registerActions.selectRadioButton(1);
//                Assert.assertTrue(registerActions.IsGender("Male"));
                softAssert.assertEquals(registerActions.IsClicked(1),true);
                break;
            case "Female":
                registerActions.selectRadioButton(2);
                softAssert.assertEquals(registerActions.IsClicked(2),true);
                break;
        }
        softAssert.assertAll();
    }


    @Then("I Enter {string} {string}")
    public void iEnter(String x, String y) {

    switch (x){
        case "FirstName":
            registerActions.setInputField(1,y);

            break;
        case"LastName":
            registerActions.setInputField(2,y);
            //
            break;
        case"Email":
            registerActions.setInputField(3,y);
           //
            break;
        case"CompanyName":
            registerActions.setInputField(4,y);
           //
            break;
        case"Password":
            registerActions.setInputField(5,y);
           //
            break;
        case"ConfirmPassword":
            registerActions.setInputField(6,y);
           //
    }

    //softAssert.assertAll();
    }

    @Then("select checkbox {string}")
    public void selectCheckbox(String x) {
        registerActions.selectCheckBox(x);
    }

    @Then("I Click Btn {string}")
    public void iClickBtn(String x) throws InterruptedException {
    Thread.sleep(5000);
    registerActions.ClickOnBtn(x);
    }

    @Then("I select from dropdown menu{string} {string}")
    public void iSelectFromDropdownMenu(String x, String y) {
    switch (x){
        case "Day":
            registerActions.selectDropDownMenuItem(1,y);
            break;
        case "Month":
            registerActions.selectDropDownMenuItem(2,y);
            break;
        case "Year":
            registerActions.selectDropDownMenuItem(3,y);
    }
    }

    @Then("Check the result")
    public void checkTheResult() {
        System.out.println("......check here.....");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(registerActions.getTextColor(),"rgba(76, 177, 124, 1)");
        softAssert.assertEquals(registerActions.getSuccessText(),"Your registration completed");
        softAssert.assertAll();
    }

    @Then("Check Input")
    public void checkInput() {
        SoftAssert softAssert=new SoftAssert();
        //firstName
        softAssert.assertEquals(registerActions.getInputText(1),"hassan");
        //LastName
        softAssert.assertEquals(registerActions.getInputText(2),"Hassan");
        //Email
        softAssert.assertEquals(registerActions.getInputText(3),"moohassan22@gmail.com");
        //CompanyName
        softAssert.assertEquals(registerActions.getInputText(4),"Amit");
        //Password
        softAssert.assertEquals(registerActions.getInputText(5),"mohamedhassan1");
        //ConfirmPassword
        softAssert.assertEquals(registerActions.getInputText(6),"mohamedhassan1");
        softAssert.assertAll();

    }

    @Then("Check selected Date")
    public void checkSelectedDate() {
    Assert.assertEquals(registerActions.CheckSelectedDate(1),"3");
    Assert.assertEquals(registerActions.CheckSelectedDate(2),"December");
    Assert.assertEquals(registerActions.CheckSelectedDate(3),"2000");
}
}
