package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("TusharSingh");
        driver.findElement(By.name("pass")).sendKeys("Passcode");
        driver.findElement(By.name("login")).click();

        driver.navigate().back();

       driver.findElement(By.partialLinkText("Forgotten password")).click();

        driver.findElement(By.partialLinkText("Cancel")).click();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Arjun");
        driver.findElement(By.name("lastname")).sendKeys("Singh");
        driver.findElement(By.name("reg_email__" )).sendKeys("Singhtushar689@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Singhtushar689@gmail.com");
        driver.findElement(By.name("reg_passwd__" )).sendKeys("MainNahiBataunga");

    }
}
