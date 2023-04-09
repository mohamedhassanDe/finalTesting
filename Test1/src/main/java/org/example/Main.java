package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        EdgeOptions options = new EdgeOptions ();
        options.addArguments ("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//Navigating to amazon.com
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();;

//        WebElement OpenTab=driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul"));
//        WebElement z= driver.findElement(By.linkText("//span[@class='wishlist-label']"));
//        int x=OpenTab.findElements(By.tagName("a")).size();
//        System.out.println("Total number of links"+OpenTab.findElements(By.tagName("a")).size());
//        for(int i=0;i<x;i++){
//            String OpenTabAgain=Keys.chord(Keys.CONTROL,Keys.ENTER);
//            OpenTab.findElements(By.tagName("a")).get(i).sendKeys(OpenTabAgain);
//            z.click();
//        }
        Thread.sleep(8000);
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nivoSlider")));

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")).click();
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")).click();


        System.out.println("mohamed");




    }
}