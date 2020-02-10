package com.cybertek.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

    public static void main(String[] args) throws InterruptedException {

        // Open browser
        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //  Open login page
        driver.get("https://practice-cybertekschool.herokuapp.com");

        //  Find correct example link
        WebElement clickButtonInput = driver.findElement(By.linkText("Sign Up For Mailing List"));
        Thread.sleep(2000);

        //  Click on correct link
        clickButtonInput.click();
        Thread.sleep(2000);

        //  Find field to enter name
        WebElement full_nameInput = driver.findElement(By.name("full_name"));

        //  Send name to field
        full_nameInput.sendKeys("My Name");
        Thread.sleep(2000);

        //  Find field to enter email address
        WebElement email_addressInput = driver.findElement(By.name("email"));

        //  Send email address to field
        email_addressInput.sendKeys("myname@gmail.com");
        Thread.sleep(2000);

        // Find correct example link
        //WebElement loginButton = driver.findElement(By.id("_submit"));
        WebElement signupButtonInput = driver.findElement(By.name("wooden_spoon"));

        //  Click on correct link
        signupButtonInput.click();
        Thread.sleep(2000);

        //  Close browser
        driver.quit();
    }
}

