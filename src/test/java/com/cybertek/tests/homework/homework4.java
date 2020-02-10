package com.cybertek.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework4 {

    public static void main(String[] args) throws InterruptedException {

        // Open browser
        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //  Open login page
        driver.get("https://practice-cybertekschool.herokuapp.com");

        //  Find correct example link
        WebElement hw4ButtonInput = driver.findElement(By.linkText("Registration Form"));
        Thread.sleep(2000);

        //  Click on correct link
        hw4ButtonInput.click();
        Thread.sleep(2000);

        //  Find field to enter name
        WebElement firstnameInput = driver.findElement(By.name("firstname"));

        //  Send name to field
        firstnameInput.sendKeys("123");
        Thread.sleep(2000);

        // close browser
        driver.quit();
    }
}

