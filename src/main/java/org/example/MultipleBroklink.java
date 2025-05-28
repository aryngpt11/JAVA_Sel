package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MultipleBroklink {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a=new SoftAssert();

        for (WebElement link:links){
            String url=link.getDomAttribute("href");
            if (url == null || url.isEmpty() || url.startsWith("javascript") || url.equals("#")) {
                System.out.println("Skipping invalid URL: " + url);
                continue;
            }
            //System.out.println(url);
            HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respc=conn.getResponseCode();
            System.out.println(respc);
            a.assertTrue(respc<400,"The link with the text"+link.getText()+"Broken code"+ respc);

        }
        a.assertAll();


        driver.quit();
    }
}
