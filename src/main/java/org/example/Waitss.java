package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Waitss {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Aryan");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Arya");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.quit();
    }
}
