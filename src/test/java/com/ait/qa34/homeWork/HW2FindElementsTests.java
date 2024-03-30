package com.ait.qa34.homeWork;
/*
@date 29.03.2024
@author Mihail Nedioglo
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HW2FindElementsTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        //maximize browser to windows
        driver.manage().window().maximize();
        // wait for elements on the site to load before starting the test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @Test
    public void findElementByTagName() {

        //find element by tag name
        WebElement element = driver.findElement(By.tagName("h2")); // 7-element
        System.out.println(element.getText());

        //find list of elements by tag name
        List<WebElement> elements = driver.findElements(By.tagName("h2"));
        System.out.println(elements.size());


        // h3
        WebElement element1 = driver.findElement(By.tagName("h3")); // 4-element
        System.out.println(element1.getText());

        List<WebElement> elements1 = driver.findElements(By.tagName("h3"));
        System.out.println(elements1.size());

        // input
        WebElement element2 = driver.findElement(By.tagName("input")); // 15-element
        System.out.println(element2.getText());
        List<WebElement> elements2 = driver.findElements(By.tagName("input"));
        System.out.println(elements2.size());

        // img
        WebElement element3 = driver.findElement(By.tagName("img")); //10-elements - GhroPath- 27
        System.out.println(element3.getText());

        List<WebElement> elements3 = driver.findElements(By.tagName("img"));
        System.out.println(elements3.size());

        // a
        WebElement element4 = driver.findElement(By.tagName("a")); //95-elements - GhroPath-99
        System.out.println(element4.getText());

        List<WebElement> elements4 = driver.findElements(By.tagName("a"));
        System.out.println(elements4.size());

        //span
        WebElement element5 = driver.findElement(By.tagName("span")); //23-elements - GhroPath-23
        System.out.println(element5.getText());

        List<WebElement> elements5 = driver.findElements(By.tagName("span"));
        System.out.println(elements5.size());

        //div
        WebElement element6 = driver.findElement(By.tagName("div")); //150-elements - GhroPath-187
        System.out.println(element6.getText());

        List<WebElement> elements6 = driver.findElements(By.tagName("div"));
        System.out.println(elements6.size());

        //ul
        WebElement element7 = driver.findElement(By.tagName("ul")); //16-elements - GhroPath-17
        System.out.println(element7.getText());

        List<WebElement> elements7 = driver.findElements(By.tagName("ul"));
        System.out.println(elements7.size());

        //li
        WebElement element8 = driver.findElement(By.tagName("li")); //77-elements - GhroPath-79
        System.out.println(element8.getText());

        List<WebElement> elements8 = driver.findElements(By.tagName("li"));
        System.out.println("tagName(\"li\"): " + elements8.size() + " elements");

        // p
        WebElement element9 = driver.findElement(By.tagName("p")); //2-elements
        System.out.println(element9.getText());

        List<WebElement> elements9 = driver.findElements(By.tagName("p"));
        System.out.println("tagName(\"p\"): " + elements9.size() + " elements");

        //form
        WebElement element10 = driver.findElement(By.tagName("form")); //1-element
        System.out.println(element10.getText());

        List<WebElement> elements10 = driver.findElements(By.tagName("form"));
        System.out.println("tagName(\"form\"): " + elements10.size() + " element");

        //script
        WebElement element11 = driver.findElement(By.tagName("script")); //19-elements - GhroPath-19
        System.out.println(element11.getText());

        List<WebElement> elements11 = driver.findElements(By.tagName("script"));
        System.out.println("tagName(\"script\"): " + elements11.size() + " elements");

        //link
        WebElement element12 = driver.findElement(By.tagName("link")); //6-elements - GhroPath-6
        System.out.println(element12.getText());

        List<WebElement> elements12 = driver.findElements(By.tagName("link"));
        System.out.println("tagName(\"link\"): " + elements12.size() + " elements");

        //meta
        WebElement element13 = driver.findElement(By.tagName("meta")); //5-elements - GhroPath-5
        System.out.println(element13.getText());

        List<WebElement> elements13 = driver.findElements(By.tagName("meta"));
        System.out.println("tagName(\"meta\"): " + elements13.size() + " elements");

    }//test


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}//class
