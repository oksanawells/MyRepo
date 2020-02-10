package com.cybertek.tests.VyTrack;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *  VERIFY LOGIN FUNCTIONALITY VyTrack
 *  Open browser
 *  Go to : http://qa2.vytrack.com/user/login
 *  Enter invalid credential: user name: InvalidUser; password: InvalidPassword;
 *  Click login button
 *
 *  If negative test PASSES the login fails and an error message displays.
 *        The URL won't change. Program will stay on the login page:
 *              http://qa2.vytrack.com/user/login
 *        This becomes the expected URL if the Login fails (Negative test passes)
 *        It is normal that user tries again using correct credentials
 *
 *  If negative test FAILS then login will will occur and URL will become the VyTrack home page:
 *              https://qa2.vytrack.com/
 *        This is the expected URL if login succeeds (Negative test fails)
 *
 */
public class VyTrack_Negative {
    public static void main(String[] args) throws InterruptedException {

        // Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // Open login page
        driver.get("http://qa2.vytrack.com/user/login");

        // Find user name input field
        WebElement userNameInput = driver.findElement(By.name("_username"));

        // enter invalid username for negative test
        userNameInput.sendKeys("InvalidUser");
        Thread.sleep(4000);

        // Find password input field
        WebElement passwordInput = driver.findElement(By.name("_password"));

        // enter invalid password for negative test
        passwordInput.sendKeys("InvalidPassword");

        Thread.sleep(4000);

        //find login button
        WebElement loginButton = driver.findElement(By.id("_submit"));

        //Click login button
        loginButton.click();

        Thread.sleep(4000);

        //get UrL of the page
        String actualUrL = driver.getCurrentUrl();

// If User enters invalid username or password the program will stay on login page
// so the expected URL will be the login page and NOT the home page

        String expectedUrL = "https://qa2.vytrack.com/user/login";

        if (actualUrL.equals(expectedUrL))
            System.out.println("Invalid Password or UserName entered - Negative Test Passed");
        else
            System.out.println("Negative Test Failed");

        //close browser
        driver.quit();



    }
}

