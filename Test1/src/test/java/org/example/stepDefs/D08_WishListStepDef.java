package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.WishList.WishListActions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishListStepDef {
    WishListActions wishListActions=new WishListActions();
    @Given("I Go to homePage Url")
    public void HomepageUrl(){
        System.out.println("Urlllllllllll");
    }

    @Then("I Click heartbtn from Item")
    public void iClickHeartbtnFromItem() {
        wishListActions.HeartIconClick();
    }

    @Then("I Click on WishList Btn")
    public void iClickOnWishListBtn() {
        wishListActions.WishListClick();
    }

    @Then("Check Success Message")
    public void checkSuccessMessage() throws InterruptedException {
        Thread.sleep(1000);
        String x="The product has been added to your wishlist";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(wishListActions.isDisplayed(),true);
        softAssert.assertEquals(wishListActions.getSuccessMessageText(),x.toLowerCase());
        softAssert.assertEquals(wishListActions.getColor(),"#4bb07a");
        softAssert.assertAll();


    }

    @Then("Check item list")
    public void checkItemList() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(wishListActions.getItemDisplay(),true);
    }
}
