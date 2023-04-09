package org.example.pages.Searching;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SearchingActions {
    SearchingPo searchingPo=new SearchingPo();

    public void SetInputField(String x){
        WebElement Searching= Hooks.driver.findElement(searchingPo.SearchInputField);
        Searching.click();
        Searching.sendKeys(x);
    }

    public void ClickSubmitBtn() {
        Hooks.driver.findElement(searchingPo.SubmitBtn).click();
    }

    public int getNumberOfResult() {
        WebElement container=Hooks.driver.findElement(searchingPo.Container);
        List<WebElement> items=container.findElements(searchingPo.Item);

        System.out.println(items.size());
        return items.size();
    }


    public boolean checkThatContains(String x) {
        System.out.println(x);
        WebElement container=Hooks.driver.findElement(searchingPo.Container);
        List<WebElement> items=container.findElements(searchingPo.Item);
        List check=new ArrayList();
        boolean flag=true;
        boolean test=true;
        for (WebElement item:items) {
            test=item.findElement(searchingPo.title).getText().toString().toLowerCase().contains(x.toLowerCase());
            System.out.println(item.findElement(searchingPo.title).getText().toString().toLowerCase());
            System.out.println(test);
           check.add(test );
        }
        for (Object y:check) {
            boolean di = ((Boolean) y).booleanValue();

            if(di==false){
                flag=false;
            }
        }
        System.out.println("here"+flag);

return flag;
    }

    public boolean getCurrentUrl(String x) {
        return Hooks.driver.getCurrentUrl().toLowerCase().contains(x);
    }

    public String getInputText() {
        return Hooks.driver.findElement(searchingPo.SearchKeyWord).getAttribute("value").toLowerCase();
//        return Hooks.driver.findElement(searchingPo.SearchInputField).getText();
    }
}
