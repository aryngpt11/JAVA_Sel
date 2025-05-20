package org.example.PolicyCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class login {
    public static void loginfun(WebDriver driver) throws InterruptedException {
        driver.get("http://localhost:8180/pc/PolicyCenter.do");
        driver.findElement(By.cssSelector("input[name='Login-LoginScreen-LoginDV-username']")).sendKeys("su");
        driver.findElement(By.cssSelector("input[name='Login-LoginScreen-LoginDV-password']")).sendKeys("gw");
        driver.findElement(By.cssSelector("div[aria-label='Log In']")).click();


    }
}
