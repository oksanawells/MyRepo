package com.cybertek.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://google.com");
        WebElement btnl = driver.findElement(By.id("gbafbb"));
        String actualText = btnl.getAttribute("value");
        String expectedText = "I'm Feeling Lucky";

        if (actualText.equals(expectedText)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
            System.out.println("Expected text:" + expectedText);
            System.out.println("Actual text:" + actualText);
        }
        try {
           Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         driver.close();
    }

}
