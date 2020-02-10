package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {
    public static void main(String[] args) {
        // option+enter MAC
        // alt+enter WIN
      //we Have TO enter this line every time we want to open
      //without it we get exception
    WebDriverManager.chromedriver().setup();
     //this part is selenium
     // WebDriver--> represent browser
     // new ChromeDriver() --> this line opens chrome browser
    WebDriver driver = new ChromeDriver();

    }


}
