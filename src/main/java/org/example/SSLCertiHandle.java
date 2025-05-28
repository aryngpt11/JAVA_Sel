package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertiHandle {
    public static void main(String[] args) {
        ChromeOptions opt=new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
        WebDriver driver=new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
