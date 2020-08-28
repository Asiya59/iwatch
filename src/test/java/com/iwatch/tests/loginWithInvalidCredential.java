package com.iwatch.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginWithInvalidCredential {

    /*
    1. go to login page
    2. enter invalid credentials
    3. click login bttn
    4. verify that user see error message
        Invalid user name or password.
     */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");

        //enter username

        //id name classname tagname

        WebElement username = driver.findElement(By.name("_username"));
        username.sendKeys("1234");

      //  driver.findElement(By.name("_username")).sendKeys("123");

         //enter password
        driver.findElement(By.name("_password")).sendKeys("123");

        driver.findElement(By.name("_submit")).click();






    }

}
