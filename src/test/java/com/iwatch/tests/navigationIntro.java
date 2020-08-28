package com.iwatch.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationIntro {

    /*
    navigate to - back - forward - refrash
    1. go to google
    2. go to amazon
    3. back to to google
    4. refresh the page

    5. verify that you back to google
        //verify by titile
        //verify by url

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
      //or
        driver.navigate().to("https://amazon.com");

        driver.getTitle();

        driver.navigate().back();

        driver.navigate().refresh();

        driver.getTitle();

        driver.close(); // --> only one tab

        driver.quit(); //close the whole browser






    }


}
