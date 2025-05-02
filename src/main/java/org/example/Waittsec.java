package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Waittsec {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("qwertyuiop");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("asdfgh");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/a")).click();
        Thread.sleep(5);
        driver.findElement(By.xpath("//div/form/input[@placeholder='Name']")).sendKeys("asdfgh");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc@aaa.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456789");
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        Thread.sleep(5000);//something to get on stable state
        System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();

        //Chechk box
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3000);

        driver.close();
    }
}
