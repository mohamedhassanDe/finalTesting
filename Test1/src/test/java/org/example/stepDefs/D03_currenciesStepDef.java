package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage.HomePageActions;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {
    HomePageActions homePageActions=new HomePageActions();;

    @When("select Euro from dropdown menu")
    public void selectEuroFromDropdownMenu() {
        homePageActions.selectDropDownMenuItem();
    }

    @Then("check Euro Icon")
    public void checkEuroIcon() {

        List x=homePageActions.getEuroIcon();
        for (Object y:x) {
            Assert.assertEquals(String.valueOf(y.toString().charAt(0)),"€");
        }
    }
}
