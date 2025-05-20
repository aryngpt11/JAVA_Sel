package org.example.ActionsMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleConcepts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it =windows.iterator();
        String PID=it.next();
        String CID=it.next();
        driver.switchTo().window(CID);
        System.out.println(driver.findElement(By.cssSelector("div[class='inner-box'] h1")).getText());
        System.out.println(driver.findElement(By.cssSelector("p[class='im-para red'] strong a")).getText());

        String email=driver.findElement(By.cssSelector("p[class='im-para red'] strong a")).getText();
        driver.switchTo().window(PID);
        driver.findElement(By.cssSelector("#username")).sendKeys(email);
        driver.quit();
    }
}
