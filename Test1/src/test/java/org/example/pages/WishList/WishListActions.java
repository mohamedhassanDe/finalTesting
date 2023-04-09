package org.example.pages.WishList;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import java.util.ArrayList;

public class WishListActions {
    WishListPo wishListPo=new WishListPo();
    public void HeartIconClick() {
        Hooks.driver.findElement(wishListPo.HeartBtn).click();
        System.out.println("heartIcon clicked");
    }

    public void WishListClick() {
        System.out.println("from wishList");
        WebElement OpenTab= Hooks.driver.findElement(wishListPo.WishListIcon);
        String OpenTabAgain=Keys.chord(Keys.CONTROL,Keys.ENTER);
        OpenTab.sendKeys(OpenTabAgain);
    }

    public boolean isDisplayed() {

        return Hooks.driver.findElement(wishListPo.NotificationBar).isDisplayed();
    }

    public String getSuccessMessageText() {
        WebElement Notification=Hooks.driver.findElement(wishListPo.NotificationBar);
        WebElement NotificationText=Notification.findElement(wishListPo.Content);
        System.out.println(NotificationText.getText().toLowerCase());
        return NotificationText.getText().toLowerCase();
    }

    public String getColor() {
        WebElement t = Hooks.driver.findElement(By.xpath("//div[@class='bar-notification success']"));
        String s = t.getCssValue("background-color");
        String c = Color.fromString(s).asHex();
        System.out.println(c);
        return c;
    }

    public boolean getItemDisplay() {
        ArrayList<String> tabs2 = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs2.get(1));
        return Hooks.driver.findElement(wishListPo.Item).isDisplayed();
    }
}
