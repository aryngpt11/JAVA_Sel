package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class HandelBrokenLink {
    public static void main(String[] args) throws MalformedURLException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getDomAttribute("href");
        System.out.println(url);
        HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int respc=conn.getResponseCode();
        System.out.println(respc);
        driver.quit();
    }
}
