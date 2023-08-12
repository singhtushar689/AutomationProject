package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        driver.findElement(By.xpath("//*[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("8295829183");

    }
}
//*[@id="loginForm"]/div/div[1]/div/label/input