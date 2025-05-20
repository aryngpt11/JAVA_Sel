package org.example.PolicyCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.example.PolicyCenter.login.loginfun;
import static org.example.PolicyCenter.logout.logoutfun;

public class Createaccount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginfun(driver);


        driver.findElement(By.cssSelector("div[id='TabBar-AccountTab'] div[class='gw-action--expand-button']")).click();
        WebElement e= driver.findElement(By.cssSelector("input[name='TabBar-AccountTab-AccountTab_AccountNumberSearchItem']"));
        e.sendKeys("9835210700");
        e.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        String f=driver.findElement(By.cssSelector(".gw-TitleBar--title")).getText();
        String g=f.split(":")[0];
        System.out.println(g);
        if (g.equals("Account Summary")){
            System.out.println("U r on the Summary page");

        }
        else{
            System.out.println("ur account no is not exist");
            //driver.navigate().refresh();
            driver.findElement(By.cssSelector("div[id='TabBar-AccountTab'] div[class='gw-action--expand-button']")).click();
            driver.findElement(By.cssSelector("div[id='TabBar-AccountTab-AccountTab_NewAccount'] div[role='menuitem']")).click();
            driver.findElement(By.cssSelector("input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-FirstName']")).sendKeys("Aryn");
        }

        Thread.sleep(5000);
        
        logoutfun(driver);
        driver.quit();
    }
}
