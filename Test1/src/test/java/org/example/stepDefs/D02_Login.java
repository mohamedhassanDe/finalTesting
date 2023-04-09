package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.login.LoginActions;
import org.example.pages.register.RegisterActions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D02_Login {
    LoginActions loginActions= new LoginActions();
    @Given("I navigate to Login Page")
    public void navigateToRegisterPage(){
        loginActions.navigateToLoginPage();
        //throw new PendingException();
    }


    @Then("I  Click Btn Login")
    public void iClickBtn() {
        loginActions.loginBtnClick();
    }



    @Then("I Enter Input {string} {string}")
    public void iEnterInput(String x, String y) {
        switch (x){
            case"Email":
                loginActions.setInputField(1,y);
                break;
            case"Password":
                loginActions.setInputField(2,y);
        }
    }

    @Then("check Successful state")
    public void checkSuccessfulState() throws InterruptedException {
        Thread.sleep(5000);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(loginActions.checkSuccessfulState(),"https://demo.nopcommerce.com/");
//        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ico-account")));
        softAssert.assertEquals(loginActions.MyAccountIsDisplayed(),true);
        softAssert.assertAll();



    }

    @Then("Check Failure State")
    public void checkFailureState() throws InterruptedException {
        Thread.sleep(5000);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(loginActions.getErrorMeassge(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
        softAssert.assertEquals(loginActions.getColor(),"#e4434b");
        softAssert.assertAll();
    }

    @Then("Check Inputt")
    public void checkInputt() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(loginActions.getInputText(1),"moohassan22@gmail.com");
        softAssert.assertEquals(loginActions.getInputText(2),"mohamedhassan1");
        softAssert.assertAll();
    }
}
