package org.example.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

        //driver.findElement(By.id("draggable")).click();
        WebElement drag= driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));
        Actions a=new Actions(driver);
        a.dragAndDrop(drag,drop).build().perform();
        Thread.sleep(2000);
        a.dragAndDrop(drop,drag).build().perform();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        driver.quit();
    }
}
