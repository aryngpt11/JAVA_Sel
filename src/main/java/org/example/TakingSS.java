package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;
import java.io.File;

public class TakingSS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(src,new File("C://ss.png"));

        driver.quit();
    }
}
