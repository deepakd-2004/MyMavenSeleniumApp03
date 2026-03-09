package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/products");
        driver.manage().window().maximize();
        
        driver.findElement(By.cssSelector("[data-product-id='2']")).click();
        driver.get("https://automationexercise.com/view_cart");
        driver.navigate().refresh();
   
    }
}
