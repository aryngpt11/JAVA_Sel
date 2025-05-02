package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class DynamicDD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
        Thread.sleep(4000);

        driver.quit();
    }
}
