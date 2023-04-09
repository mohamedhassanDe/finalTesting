package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Searching.SearchingActions;
import org.example.pages.Searching.SearchingPo;
import org.testng.asserts.SoftAssert;

public class D04_SearchStepDef {
    SearchingActions searchingActions=new SearchingActions();
    SearchingPo searchingPo=new SearchingPo();
    @When("I Enter Search Input {string}")
    public void iEnterSearchInput(String x) {
    searchingActions.SetInputField(x);
    }

    @Then("I Click Submit Btn")
    public void iClickSubmitBtn() {
        searchingActions.ClickSubmitBtn();
    }





    @Then("Check Results {string}")
    public void checkResultsY(String y) {
        System.out.println(y);
        int expectedSize=0;
        switch (y){
            case "first":
                expectedSize=6;

                break;
            case "second":
                expectedSize=1;
                break;
        }
        System.out.println(expectedSize);
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(searchingActions.getCurrentUrl("https://demo.nopcommerce.com/search?q="),true);
        softAssert.assertEquals(searchingActions.getNumberOfResult(),expectedSize);
        softAssert.assertEquals(searchingActions.getInputText(),"book");

        softAssert.assertEquals(searchingActions.checkThatContains(searchingActions.getInputText()),false);
        softAssert.assertAll();
    }
}
