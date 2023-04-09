package org.example.pages.HomePage;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePageActions {
    HomePagePo homePagePo=new HomePagePo();
    public void selectDropDownMenuItem() {
            WebElement DropDown = Hooks.driver.findElement(homePagePo.currencyDropdownMenu);
            DropDown.click();
            Select selectElement = new Select(DropDown);
            selectElement.selectByVisibleText("Euro");
            System.out.println("okkkkkkkkkkkkkkkk");
    }
    public List getEuroIcon(){
        List<WebElement> elements=Hooks.driver.findElements(homePagePo.priceElement);
        List result=new ArrayList<>();
        for(WebElement element: elements){
            result.add(element.getText());
        }
        return result;

    }

    public void hoverOnCategory() {
        WebElement mainMenu = Hooks.driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));

//Instantiating Actions class
        Actions actions = new Actions(Hooks.driver);

//Hovering on main menu
        actions.moveToElement(mainMenu).build().perform();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Desktops")));
    }

    public void clickOnDesktopOption() {
        Actions actions = new Actions(Hooks.driver);
        // Locating the element from Sub Menu
        WebElement subMenu =Hooks. driver.findElement(By.linkText("Desktops"));

//To mouseover on sub menu
        actions.moveToElement(subMenu);

//build()- used to compile all the actions into a single step
        actions.click().build().perform();

    }

    public String getPageTitle() {
        System.out.println(Hooks.driver.findElement(homePagePo.pageTitle).getText().toLowerCase());
        return Hooks.driver.findElement(homePagePo.pageTitle).getText().toLowerCase();
    }

    public void ClickIphone(int x) throws InterruptedException {
        Thread.sleep(3000);
        switch (x){
            case 1: Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")).click();
                break;
            case 2: Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")).click();
                break;
        }

    }

    public String getCurrentUrl() {
        return Hooks.driver.getCurrentUrl();
    }
}
