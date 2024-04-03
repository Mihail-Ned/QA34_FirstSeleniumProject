package com.ait.qa34.homeWork;
/*
@date 30.03.2024
@author Mihail Nedioglo
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class HW3FindElementsTestsByCssSelector {
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        //maximize browser to windows
        driver.manage().window().maximize();
        // wait for elements on the site to load before starting the test
        driver.manage().timeouts(). implicitlyWait(Duration.ofSeconds(10));
    }

    //css selector
    @Test
    public void findElementByCssSelector() {
        //tage name = tag name
        //driver.findElement(By.tagName("head"));
        driver.findElement(By.cssSelector("head"));
        driver.findElement(By.cssSelector("body"));

        //id -> #id
        //driver.findElement(By.id("#newsletter-subscribe-button"));
        driver.findElement(By.cssSelector("#newsletter-subscribe-button"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("#dialog-notifications-success"));

        //class name -> .className
        driver.findElement(By.cssSelector(".header-selectors-wrapper"));
        driver.findElement(By.cssSelector(".search-box"));
        driver.findElement(By.cssSelector(".bar-notification"));

        //[name = 'user']
        driver.findElement(By.cssSelector("[value='Search']"));
        driver.findElement(By.cssSelector("[value='Subscribe']"));
    }//test

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}//class
