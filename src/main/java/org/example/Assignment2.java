package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("abc");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();

        WebElement gender= driver.findElement(By.id("exampleFormControlSelect1"));
        Select Gen=new Select(gender);
        Gen.selectByVisibleText("Female");


        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("10-01-2000");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.quit();
    }
}
