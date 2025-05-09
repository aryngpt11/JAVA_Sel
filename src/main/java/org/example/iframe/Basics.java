//package org.example.iframe;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Basics {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.automationtesting.in/Frames.html");
//        driver.switchTo().frame(1);
//        driver.findElement(By.xpath("//div[@class='row']")).sendKeys("qwertyu");
//        Thread.sleep(5000);
//        driver.quit();
//
//    }
//}


package org.example.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");

        //driver.switchTo().frame(driver.findElement(By.id("singleframe")));
        driver.switchTo().frame("singleframe");


        WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));
        inputField.sendKeys("qwertyu");

        Thread.sleep(5000);
        driver.quit();
    }
}
