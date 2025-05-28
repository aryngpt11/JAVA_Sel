package org.example.ExampleQues;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.Iterator;
import java.util.Set;

public class CountLink {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println("Total links count"+" "+driver.findElements(By.tagName("a")).size());

        //System.out.println("Footer links count"+" "+driver.findElements(By.xpath("//div[@id='gf-BIG']//ul/li")).size());

           //OR
        WebElement FD= driver.findElement(By.id("gf-BIG"));
        System.out.println(FD.findElements(By.tagName("a")).size());


        //first column of footer section

        WebElement ColDri= FD.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(ColDri.findElements(By.tagName("a")).size());

//        for (int i =1;i<ColDri.findElements(By.tagName("a")).size();i++){
//            ColDri.findElements(By.tagName("a")).get(i).click();
//            driver.navigate().back();
//
//        }

        //OR
        String Pw=driver.getWindowHandle();

        for (int i=1;i<ColDri.findElements(By.tagName("a")).size();i++) {
            String clickon = Keys.chord(Keys.CONTROL, Keys.ENTER);
            ColDri.findElements(By.tagName("a")).get(i).sendKeys(clickon);
            Thread.sleep(5000);
        }

        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();

        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

        driver.switchTo().window(Pw);



        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
        Thread.sleep(2000);

        driver.quit();

    }
}
