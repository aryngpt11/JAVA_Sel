package org.example.PolicyCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class logout {
    public static void logoutfun(WebDriver driver){
        WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-gw-tooltip='Options']")));
        driver.findElement(By.cssSelector("div[data-gw-tooltip='Options']")).click();
        driver.findElement(By.xpath("//div[text()='Log Out Super User']")).click();
    }
}
