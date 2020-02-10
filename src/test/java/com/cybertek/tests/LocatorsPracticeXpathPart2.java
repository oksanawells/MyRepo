package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPracticeXpathPart2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        WebElement headerText = driver.findElement(By.xpath("//span[@class='h1y']"));
        System.out.println(headerText.getText());
        driver.close();
    }
}
