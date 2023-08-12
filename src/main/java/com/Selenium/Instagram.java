package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.time.Duration;

public class Instagram {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(1000);

        // Providing Valid Credentials
        // Valid Username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("testingtestdata");
        Thread.sleep(1000);
        // Valid Password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("testingtestdatablz");
        Thread.sleep(1000);
        // Login
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
        Thread.sleep(2000);

        //choosing option Not Now For Notifications
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Not Now\"]")));
        driver.findElement(By.xpath("//button[text()=\"Not Now\"]")).click();

        //More
        driver.findElement(By.xpath("//span[text()='More']")).click();
        Thread.sleep(1000);

        //Log Out
        driver.findElement(By.xpath("//html/body[1]")).click();
        Thread.sleep(1000);

        // Providing Invalid Credentials for login
        // Invalid Username
        // driver.findElement(By.xpath("//input[@name='username']")).sendKeys("testingnotestdata");
        // Thread.sleep(1000);
        // Invalid password
        // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("testingnotestdatablz");
        // Thread.sleep(500);
        // Log In
        // driver.findElement(By.xpath("//div[text()='Log in']")).click();
        // Thread.sleep(1000);

        // login with Facebook
        // driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
        // driver.navigate().back();
        // Thread.sleep(2000);//*[type()="emailorPhone"]

        // Forgot password
        // driver.findElement(By.partialLinkText("password")).click();
        // Thread.sleep(1000);

        // Create New Account
        // driver.findElement(By.partialLinkText("Create")).click();
        // Thread.sleep(1000);

        // Mobile Or EmailId
        // driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("8295829183");
        // Thread.sleep(1000);
        // Full Name
        // driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("Narender Singh");
        // UserName
        // driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("narendersingh9009");
        // Password
        // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tushar@689");
        // Sign Up
        // driver.findElement(By.xpath("//*[@type = \"submit\"]")).click();
    }
}
