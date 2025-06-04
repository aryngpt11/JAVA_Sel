package org.example.Java_Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class CheckingWebtableisSorted {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector("th[aria-label='Veg/fruit name: activate to sort column ascending']")).click();
        Thread.sleep(4000);
        List<WebElement> L1=driver.findElements(By.xpath("//tr/td[1]"));
//        for (int i=0;i<L1.size();i++){
//            System.out.println(L1.get(i).getText());
//        }
        List<String> dataa=L1.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> L2=dataa.stream().sorted().collect(Collectors.toList());
        System.out.println(dataa);
        System.out.println(L2);

        Assert.assertTrue(dataa.equals(L2));
        driver.quit();
    }
}
