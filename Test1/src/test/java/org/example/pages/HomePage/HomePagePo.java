package org.example.pages.HomePage;

import org.openqa.selenium.By;

public class HomePagePo {
    public By currencyDropdownMenu=By.id("customerCurrency");
    public By priceElement=By.cssSelector("body > div > div > div > div > div > div > div > div > div > div > div > div > div > span");

    public By firstCategory=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    public By pageTitle=By.className("page-title");
}
