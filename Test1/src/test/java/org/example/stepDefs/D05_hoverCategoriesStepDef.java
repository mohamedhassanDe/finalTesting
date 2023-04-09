package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage.HomePageActions;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    HomePageActions homePageActions=new HomePageActions();
@When("I hover on first category")
public void hoverOnCategory(){
    homePageActions.hoverOnCategory();
}


    @Then("I Click on Desktops option")
    public void iClickOnDesktopsOption() {
    homePageActions.clickOnDesktopOption();
    }

    @Then("check page Title")
    public void checkPageTitle() {
        Assert.assertEquals(homePageActions.getPageTitle(),"desktops");
    }
}
