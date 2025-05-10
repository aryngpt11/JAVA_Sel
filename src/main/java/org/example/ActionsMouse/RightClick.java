package org.example.ActionsMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.navigate().refresh();
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']/a"))).contextClick().build().perform();

    }
}
