package org.example.pages.FollowUs;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class FollowUsActions {
    FollowUsPo followUsPo=new FollowUsPo();
    By element;


    public void BtnClick(String x) {
        switch(x){
            case "facebook":
                element=followUsPo.FacebookBtn;
                Hooks.driver.findElement(element).click();
                break;
            case "twitter":
                element=followUsPo.TwitterBtn;
                Hooks.driver.findElement(element).click();
                break;
            case "youtube":
                element=followUsPo.youtubeBtn;
                Hooks.driver.findElement(element).click();
                break;
            case "rrs":
                element=followUsPo.rrsBtn;
                Hooks.driver.findElement(element).click();
                break;
        }

    }

    public String getTabUrl() throws InterruptedException {
        Thread.sleep(5000);
        ArrayList<String> tabs2 = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs2.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        return Hooks.driver.getCurrentUrl();

    }
}
