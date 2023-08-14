package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class FacebookAutomation extends BaseClass {
    @Test
    public void takescreenshots() throws InterruptedException, IOException {
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("8295829183");
        driver.findElement(By.id("pass")).sendKeys("Tushar@12345");
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(1000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File ss = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\singh\\IdeaProjects\\Selenium\\src\\main\\resources\\ss.jpeg");
        FileHandler.copy(ss, destination);
    }

    @Test
    public void windowhandlling() throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.findElement(By.id("newWindowBtn")).click();
        String parentwindowaddress = driver.getWindowHandle();
        System.out.println("parent window address is : " + parentwindowaddress);

        Set<String> allwindow = driver.getWindowHandles();
        System.out.println("number of window opened" + allwindow.size());

        Iterator<String> window = allwindow.iterator();
        while (window.hasNext()) {
            String childwindow = window.next();
            if (!parentwindowaddress.equalsIgnoreCase(childwindow)) {
                driver.switchTo().window(childwindow);
                Thread.sleep(1000);
                String fetchedtext = driver.findElement(By.xpath("//h1[text()='Basic Controls in HTML']")).getText();
                System.out.println("childwindow text is :" + fetchedtext);
            }
        }
        driver.switchTo().window(parentwindowaddress);
        driver.findElement(By.xpath("//a[text()='Home']")).click();

    }

    @Test
    public void validation() throws InterruptedException {
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("8295829183");
        driver.findElement(By.id("pass")).sendKeys("Tushar@12345");
        driver.findElement(By.id("loginbutton")).click();
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(2000);
        if
        (driver.findElement(By.xpath("//span[text()='Automation TestData']")).isDisplayed())
            System.out.println("Username is Displayed");
        else
            System.out.println("Username is not displayed");

        if (driver.findElement(By.xpath("//span[text()='Memories']")).isEnabled())
            System.out.println("Button is Enabled");
        else
            System.out.println("Button is not Enabled");

    }

    @Test
    public void fileUploadUsingSendKeys() throws AWTException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("8295829183");
        driver.findElement(By.id("pass")).sendKeys("Tushar@12345");
        driver.findElement(By.id("loginbutton")).click();
        driver.findElement(By.xpath("//span[text()='Add Picture']")).click();
        WebElement ss = driver.findElement(By.xpath("//span[text()='Upload Photo']"));
        ss.click();
        Thread.sleep(2000);
        ss.sendKeys("C:\\Users\\singh\\Downloads\\Tushar.jpg");
        Robot robot = new Robot();
        robot.mouseWheel(5);
        driver.findElement(By.xpath("//span[text()='Save']")).click();


    }

    @Test
    public void fileUploadUsingrobotclass() throws InterruptedException, AWTException {
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("8295829183");
        driver.findElement(By.id("pass")).sendKeys("Tushar@12345");
        driver.findElement(By.id("loginbutton")).click();
        driver.findElement(By.xpath("//span[text()='Add Picture']")).click();

        StringSelection selection = new StringSelection("C:\\Users\\singh\\Downloads\\Tushar.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        Robot robot = new Robot();
        robot.mouseMove(635, 173);


        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);


        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);


        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    }

    @Test
    public void fileUploadUsingAutoIt() throws AWTException, IOException, InterruptedException {
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("8295829183");
        driver.findElement(By.id("pass")).sendKeys("Tushar@12345");
        Thread.sleep(1000);
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Add Picture']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Upload Photo']")).click();
        Thread.sleep(1000);
        Runtime.getRuntime().exec("C:\\Users\\singh\\Downloads\\AutoIt.exe");
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.mouseWheel(5);
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
