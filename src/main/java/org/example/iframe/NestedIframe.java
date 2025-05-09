package org.example.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");

        //driver.findElement(By.xpath("//li[@class='active']/a[@class='analystic']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));

        WebElement ip=driver.findElement(By.xpath("//input[@type='text']"));
        ip.sendKeys("asdfghj");

        Thread.sleep(3000);
        driver.quit();
    }
}
