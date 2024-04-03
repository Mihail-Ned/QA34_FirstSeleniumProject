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


public class HW4FindElementsTestsByXpath {
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
        //driver.findElement(By.cssSelector("head"));
        //driver.findElement(By.cssSelector("body"));

        // tag name = //tag
        // driver.findElement(By.tagName("h1"));
        driver.findElement(By.xpath("//head"));
        driver.findElement(By.xpath("//body"));

        //id -> #id
        //driver.findElement(By.id("#newsletter-subscribe-button"));
        //driver.findElement(By.cssSelector("#newsletter-subscribe-button"));
        //driver.findElement(By.cssSelector("#bar-notification"));
        //driver.findElement(By.cssSelector("#dialog-notifications-error"));
        //driver.findElement(By.cssSelector("#dialog-notifications-success"));

        // id -> //tag[@id='idName']
        // driver.findElement(By.id("city"));
        driver.findElement(By.xpath("//*[@id='newsletter-subscribe-button']"));
        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));

        //class name -> .className
        //driver.findElement(By.cssSelector(".header-selectors-wrapper"));
        //driver.findElement(By.cssSelector(".search-box"));
        //driver.findElement(By.cssSelector(".bar-notification"));

        //class name -> //tag[@class='className']
        // driver.findElement(By.className("input-container"));
        driver.findElement(By.xpath("//*[@class='header-selectors-wrapper']"));
        driver.findElement(By.xpath("//*[@class='search-box']"));
        driver.findElement(By.xpath("//*[@class='bar-notification']"));

        //[name = 'user']
        //driver.findElement(By.cssSelector("[value='Search']"));
        //driver.findElement(By.cssSelector("[value='Subscribe']"));

        //text
        //driver.findElement(By.xpath("//label[contains(.,'Gender:')]"));
    }//test

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}//class
