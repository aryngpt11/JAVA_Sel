package org.example.Java_Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class BuildCustomMthod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        List<WebElement> vegNames = driver.findElements(By.xpath("//tr/td[1]"));
//        for (int i = 0; i < L1.size(); i++) {
//            System.out.println(L1.get(i).getText());
//            if (L1.get(i).getText().equalsIgnoreCase("rice")){
//                System.out.println(driver.findElements(By.xpath("//tr/td[2]")).get(i).getText());
//            }
//        }

//        vegNames.stream()
//                .filter(veg -> veg.getText().equalsIgnoreCase("Rice"))
//                .forEach(rice -> {
//                    // Get price from sibling td[2]
//                    String price = rice.findElement(By.xpath("//tr/td[2]")).getText();
//                    //int price2 = Integer.parseInt(price)
//                    System.out.println("Price of Rice is: " + price);
//                });

        List<String> price = vegNames.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
        price.forEach(a-> System.out.println(a));
    }

    private static String getPriceVeggie(WebElement s) {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }

}