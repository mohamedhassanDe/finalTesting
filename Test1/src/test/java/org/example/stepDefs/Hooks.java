package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void setup(){

        EdgeOptions options = new EdgeOptions ();
        options.addArguments ("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//Navigating to amazon.com
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
    @After
    public static void tearDown() throws InterruptedException{
        Thread.sleep(1000);
        driver.quit();
    }
}
