package com.iwatch.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
   /*
   1. go to vytrack login page
    https://qa2.vytrack.com/user/login
   2. enter user name
       - user23
   3. enter paswweord
       - UserUser123
   4. click login bottun
   5. verify that user in on the home page
    */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1. go to vytrack login page
        driver.get("https://qa2.vytrack.com/user/login");

        //2. enter user name

//findelement / locate element , we have 8 ways to find:
        //1. ID,  name,  tagname,  classname, linktext, partiallinkText
        //   xpath, css


        WebElement userName = driver.findElement(By.id("prependedInput"));

        //how do you enter/input value in a text box?
        userName.sendKeys("user23");

        //enter paswrod

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");

        //click login bttn
        WebElement loginBttn = driver.findElement(By.id("_submit"));
        loginBttn.click();

        //5. verify that user in on the home page

        //expectedTitle vs ActualTitle

        String expectedTitle = "Dashboard";
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
