package org.example.Java_Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class ScanallPrice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        List<String> price;
        do {
            List<WebElement> vegNames = driver.findElements(By.xpath("//tr/td[1]"));
            price = vegNames.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
            price.forEach(a -> System.out.println(a));

            if (price.size() < 1) {
                driver.findElement(By.cssSelector("[aria-label='Next'")).click();
            }
        }while (price.size()<1);
        driver.quit();
    }

    private static String getPriceVeggie(WebElement s) {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }

}

