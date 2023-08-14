package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(500);
        driver.findElement(By.name("email")).sendKeys("Singhtushar689@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Tushar@12345");
        driver.findElement(By.name("login")).click();
        Thread.sleep(500);

        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(500);
        driver.switchTo().alert().dismiss();
        if
        (driver.findElement(By.xpath("//span[text()='Automation TestData']")).isDisplayed()) ;
        else
            System.out.println("Username is not displayed");

        if (driver.findElement(By.xpath("//span[text()='Memories'")).isEnabled())
            System.out.println("Button is enabled");
        else
            System.out.println("Button is not enabled");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[name()='g'] and contains(@mask,'url(#:r6km')]//*[name()='image'and contains(@x,'0')]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
        driver.findElement(By.xpath("//a[@id='u_0_0_lG']")).click();

        WebElement btnSelect = driver.findElement(By.xpath("//input[@id='u_9_5_ww'"));
        btnSelect.click();
        Thread.sleep(2000);
        if(btnSelect.isSelected())
            System.out.println("Button is selected");
        else
            System.out.println("Button is not selected");
    }
}
