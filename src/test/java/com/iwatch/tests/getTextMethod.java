package com.iwatch.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {

    public static void main(String[] args) {


    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/checkboxes");

        //locate home

        WebElement home = driver.findElement(By.className("nav-link"));
        String textOfHome = home.getText();

    //  String textOfHome =  driver.findElement(By.className("nav-link")).getText();


        System.out.println(textOfHome);
    }

}
