package com.iwatch.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextintro {
    /*
    1. go to amazon
    2. click best sellers
    3. verify user in best seller page
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");

       // click best sellers

        //cus it is a link, we locate by linkText

        driver.findElement(By.linkText("Best Sellers")).click();

        //or locate with partialLinkText
        driver.findElement(By.partialLinkText("st Sel")).click();

        //verify titke
        String expectedTitle = "Best Sellers";
        String actualTitle = driver.getTitle();

        //Amazon.com Best Sellers: The most popular items on Amazon
        if(actualTitle.contains(expectedTitle)){
            System.out.println("pass");
        }else {
            System.out.println("fail");

        }

    }
}
