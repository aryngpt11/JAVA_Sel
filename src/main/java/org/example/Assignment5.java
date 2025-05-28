package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement CK=driver.findElement(By.id("checkBoxOption3"));
        CK.click();
        String name=CK.getDomAttribute("value");
        System.out.println(name);

        WebElement dd=driver.findElement(By.id("dropdown-class-example"));
        Select s=new Select(dd);
        s.selectByValue(name);


        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);
        String text=driver.switchTo().alert().getText();


        if(text.contains(name)){
            System.out.println("Success");
        }
        else{
            System.out.println("Failed");
        }


        driver.quit();
    }
}
