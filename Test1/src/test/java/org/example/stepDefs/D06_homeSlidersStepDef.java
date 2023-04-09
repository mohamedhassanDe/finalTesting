package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage.HomePageActions;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    HomePageActions homePageActions=new HomePageActions();
    @When("Click on first slider IPhone Slider")
    public void ClickIphone(int x) throws InterruptedException {
        homePageActions.ClickIphone(1);
        Assert.assertEquals(homePageActions.getCurrentUrl(),"https://demo.nopcommerce.com/Iphone_14_pro");
    }



    @When("Click on Second slider SAmsung Slider")
    public void clickOnSecondSliderSAmsungSlider() throws InterruptedException {
        homePageActions.ClickIphone(2);
        Assert.assertEquals(homePageActions.getCurrentUrl(),"https://demo.nopcommerce.com/samsungUltra22");
    }


}
