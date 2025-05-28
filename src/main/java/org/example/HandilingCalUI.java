package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class HandilingCalUI {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String monthnum="6";
        String date="10";
        String year="2027";

        String[] expected={monthnum,date,year};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText--from")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText--from")).click();
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthnum)-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
        List<WebElement> actualL=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for (int i=0;i<actualL.size();i++){
            System.out.println(actualL.get(i).getDomAttribute("value"));
            Assert.assertEquals(actualL.get(i).getDomAttribute("value"),expected[i]);
        }

        driver.quit();
    }
}
