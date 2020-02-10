package com.cybertek.tests.VyTrack;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *  VERIFY LOGIN FUNCTIONALITY VyTrack
 *  Open browser
 *  Go to : http://qa2.vytrack.com/user/login
 *  Enter valid credential: user name: storemanager73; password: UserUser123;
 *  Click login button
 *  Verify that the user is on  VyTrack home page: https://qa2.vytrack.com/
 *
 */
public class Login {
    public static void main(String[] args) {

        // Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // Open login page
        driver.get("http://qa2.vytrack.com/user/login");

        // Find user name input field
        WebElement userNameInput = driver.findElement(By.name("_username"));

        // enter username
        userNameInput.sendKeys("storemanager73");

        // Find password input field
        WebElement passwordInput = driver.findElement(By.name("_password"));

        // enter password
        passwordInput.sendKeys("UserUser123");

        //find login button
        WebElement loginButton = driver.findElement(By.id("_submit"));

        //Click login button
        loginButton.click();

        //get UrL of the page
        String actualUrL = driver.getCurrentUrl();

        //verify the user is on the expected page
        String expectedUrL = "https://qa2.vytrack.com/";

        if (actualUrL.equals(expectedUrL))
            System.out.println("Pass");
        else
            System.out.println("Fail");

        //close browser
        driver.quit();



    }
}

