package com.cybertek.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {

        // Open browser
        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //  Open required page
        driver.get("https://practice-cybertekschool.herokuapp.com");

        //  Find "Multiple Buttons" link
        WebElement hw3Input = driver.findElement(By.linkText("Multiple Buttons"));
        Thread.sleep(2000);

        //  Click on "Multiple Buttons" link
        hw3Input.click();
        Thread.sleep(2000);

        //  Find Button 1

        WebElement hw3Button = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[1]"));
        Thread.sleep(2000);

        //  Click on "Button 1"
        hw3Button.click();
        Thread.sleep(2000);

        //  Close browser
        driver.quit();
    }
}

