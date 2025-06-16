package org.example.ActionsMouse;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;


public class InvokingMultipleWindows {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it= handles.iterator();
        String PID= it.next();
        String CID= it.next();
        driver.switchTo().window(CID);
        driver.get("https://rahulshettyacademy.com/#/index");

        String Coursename=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        driver.switchTo().window(PID);
        WebElement namee=driver.findElement(By.cssSelector("[name='name']"));
        namee.sendKeys(Coursename);
        //Taking the ScreenShot

        File file=namee.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("logo.png"));

        //Height and width
        System.out.println(namee.getRect().getDimension().getHeight());
        System.out.println(namee.getRect().getDimension().getWidth());
        Thread.sleep(2000);

        driver.quit();
    }
}
