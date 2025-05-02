package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturemsg {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Aryan");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Arya");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        Thread.sleep(2000);

        driver.quit();

    }
}
