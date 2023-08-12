package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkedIn {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/");
        Thread.sleep(1000);
        driver.navigate().refresh();
        //Provide Valid Credentials

        //create a emailId Or Mobile No.
        driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("1234567890");
        Thread.sleep(1000);
        //Create a password
        driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("Singhtushar123");
        Thread.sleep(1000);
        //perform page down page up actions
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(500);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(500);
        //Sign In
        driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        //Forgot password
        driver.findElement(By.partialLinkText("Forgot password")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='back-button-password-reset']")).click();
        Thread.sleep(2000);
        //Join Now
        driver.findElement(By.partialLinkText("Join now")).click();
        Thread.sleep(1000);
        //Email or phone number
        driver.findElement(By.name("email-or-phone")).sendKeys("Singhtushar689@gmail.com");
        //Create password
        driver.findElement(By.id("password")).sendKeys("Qwerty123");
        //Agree and Join
        driver.findElement(By.xpath("//button[@id='join-form-submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Tushar");
        driver.findElement(By.id("last-name")).sendKeys("Singh");
        driver.findElement(By.id("join-form-submit")).click();
        driver.close();
    }
}
