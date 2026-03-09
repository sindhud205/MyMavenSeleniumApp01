package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000); // wait 2 seconds

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        Thread.sleep(2000); // wait 2 seconds

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        Thread.sleep(2000); // wait 2 seconds

        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000); // wait 3 seconds before closing
    }
}
