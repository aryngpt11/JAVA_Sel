package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googee {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        // Send text + Enter key
        searchBox.sendKeys("akshay anand", Keys.ENTER);

        Thread.sleep(1000);
        driver.quit();
    }
}
