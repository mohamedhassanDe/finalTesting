package org.example.pages.WishList;

import org.openqa.selenium.By;

public class WishListPo {
    public By HeartBtn=By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/button[3]");
    public By WishListIcon=By.className("ico-wishlist");
    public By NotificationBar=By.className("bar-notification-container");
    public By Content=By.className("content");
    public By Item=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr");
}
