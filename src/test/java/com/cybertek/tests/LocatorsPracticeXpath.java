package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPracticeXpath {
    public static void main(String[] args) throws Exception {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        WebElement dropDownLink = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[11]/a"));
        System.out.println(dropDownLink.getText());
        dropDownLink.click();
        Thread.sleep(2000);
        driver.close();
    }
}
