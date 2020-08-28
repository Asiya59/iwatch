package com.iwatch.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class introWebDriver {

    public static void main(String[] args) {

       /*
       1. open the  browser
       2. go to google
       3. verify user on the right page
        */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        //i want to verify that I am in correct page

        //expected vs actual

        String expectedURL = "https//www.google.com/";

        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("Test case is pass");
        }else {
            System.out.println("Test case is fail");
            System.out.println("Expected URL IS: " + expectedURL);
            System.out.println("actual url is: " + actualURL);
        }

        driver.close();









    }
}
