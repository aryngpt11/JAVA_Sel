package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DisableEnable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("Style"));

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("Style"));

        if(driver.findElement(By.id("Div1")).getDomAttribute("Style").contains("0.5")){
            System.out.println("Its Enabled");
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }

        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        driver.quit();

    }
}
