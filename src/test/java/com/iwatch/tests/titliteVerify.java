package com.iwatch.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titliteVerify {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");

        //titile

        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle = driver.getTitle();


        if(expectedTitle.equals(actualTitle)){
            System.out.println("Test case is pass");
        }else {
            System.out.println("Test case is fail");
            System.out.println("Expected title IS: " + expectedTitle);
            System.out.println("actual title is: " + actualTitle);
        }

        driver.close();


    }
}
