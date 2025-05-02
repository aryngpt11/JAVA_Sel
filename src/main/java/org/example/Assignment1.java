package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("input[id*='Option1']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='Option1']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='Option1']")).isSelected());

        System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.close();

    }
}
