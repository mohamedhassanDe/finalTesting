package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.FollowUs.FollowUsActions;
import org.testng.Assert;

public class D07_FollowUsStepDef {
FollowUsActions followUsActions=new FollowUsActions();


    @Then("I Click {string} Btn")
    public void iClickBtn(String x) {
        followUsActions.BtnClick(x.toLowerCase());
    }

    @Then("Check open tab")
    public void checkOpenTab() throws InterruptedException {
        Assert.assertEquals(followUsActions.getTabUrl(),"https://www.facebook.com/nopCommercea");

    }
}
