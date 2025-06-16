package org.example.ActionsMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class InvokingMultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it= handles.iterator();
        String PID= it.next();
        String CID= it.next();
        driver.switchTo().window(CID);
        driver.get("https://rahulshettyacademy.com/#/index");

        String Coursename=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        driver.switchTo().window(PID);
        driver.findElement(By.cssSelector("[name='name'")).sendKeys(Coursename);
        Thread.sleep(2000);

        driver.quit();
    }
}
