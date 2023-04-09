package org.example.pages.Searching;

import org.openqa.selenium.By;

public class SearchingPo {
    public By SearchInputField=By.xpath("//input[@id='small-searchterms']");
    public By SubmitBtn =By.xpath("//button[normalize-space()='Search']");
    public By Container=By.className("item-grid");
    public By Item=By.className("item-box");
    public By title= By.className("product-title");
    public By SearchKeyWord=By.xpath("//input[@id='q']");
}
