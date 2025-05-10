package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Listofitems2 {
    public static void main(String[] args)  {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String[] veggies={"Cucumber","Brocolli","Beetroot"};
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        addItems(driver,veggies);
        //Listofitems2 l=new Listofitems2();
        //l.addItems(driver,veggies);





    }
    public static void addItems(WebDriver driver, String[] veggies) {
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        int j=0;
        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName=name[0].trim();
            List itemsneeded= Arrays.asList(veggies);

            if (itemsneeded.contains(formattedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                if (j==itemsneeded.size()){
                    break;
                }

            }
        }


        driver.findElement(By.cssSelector(".cart-icon")).click();

        driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();

        driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();

        driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();

        WebElement elem=driver.findElement(By.cssSelector("div[class='wrapperTwo'] div select"));
        Select cont=new Select(elem);
        cont.selectByValue("India");

        driver.findElement(By.cssSelector("input[type='checkbox']")).click();


        driver.quit();
    }
}
