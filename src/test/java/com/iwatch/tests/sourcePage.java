package com.iwatch.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sourcePage {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book" + Keys.ENTER);

       //find an element, then we want to print value of one of the attribute of it

        WebElement textBox = driver.findElement(By.name("field-keywords"));

        String valueOfID = textBox.getAttribute("id");
        System.out.println(valueOfID);


        String pageOfSrc = driver.getPageSource();
        System.out.println(pageOfSrc);
    }

}
