package com.ait.qa34.homeWork.homeWork_05;
/*
@date 07.04.2024
@author Mihail Nedioglo
*/

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTest extends TestBase{

    @Test(enabled = true)
    public void CreateNewAccountPositiveTest() {

        //click on Register Link
        click(By.cssSelector("[href='/register']"));
        //enter first name
        type(By.cssSelector("#FirstName"), "Vasya");
        //enter last name
        type(By.cssSelector("#LastName"), "Pupkin");
        //enter email
        Random random = new Random();
        int i = random.nextInt(1000)+1000;
        type(By.cssSelector("#Email"), "qwerty007$" + i + "@gmail.com");
//!!!       type(By.cssSelector("#Email"), "qwerty007$@gmail.com");
        //enter password
        type(By.cssSelector("#Password"), "Qwerty007$");
        //enter confirm password
        type(By.cssSelector("#ConfirmPassword"), "Qwerty007$");
        //click on Register button
        click(By.cssSelector("[name='register-button']"));
        //click on continue button
        click(By.cssSelector("[value='Continue']"));
        //assert qwerty007$@gmail.com link is present
        Assert.assertTrue(isElementPresent(By.xpath("//a[.='qwerty007$@gmail.com']")));

    }//test
}
