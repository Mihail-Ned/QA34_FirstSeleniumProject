package com.ait.qa34;
/*
@date 28.03.2024
@author Mihail Nedioglo
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
//        driver.get("https://www.google.com");// without history -  работает без истории
        driver.navigate().to("https://www.google.com"); // with history - с историей
        driver.navigate().back(); // назад
        driver.navigate().forward(); // вперед
        driver.navigate().refresh(); // обновление
    }
    //test - name
    @Test
    public void openGoogleTest() {
        System.out.println("Google is opened!");
    }


    //after - tearDown
    @AfterMethod(enabled = false) // disable method - отключаем авто метод
    public void tearDown() {
        driver.quit(); // close browser(all tabs) - закрывает весь браузер;
//        driver.close();// only one tab(if only one -> close browser) - закрывает тока последнюю вкладку в браузере

    }
}
