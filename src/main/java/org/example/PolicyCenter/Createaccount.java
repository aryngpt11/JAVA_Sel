package org.example.PolicyCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

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
        e.sendKeys("1234567890");
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
            driver.findElement(By.cssSelector("input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-LastName']")).sendKeys("gpt");
            if (driver.findElement(By.cssSelector("input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-FirstNameExact']")).isSelected()){
                System.out.println("Already ticked");
            }
            else {
                driver.findElement(By.cssSelector("input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-FirstNameExact']")).click();
                System.out.println("Clicked successfully");
            }
            driver.findElement(By.cssSelector("#NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search")).click();
            driver.findElement(By.cssSelector("div[data-gw-shortcut='{\"id\":\"NewAccount-NewAccountScreen-NewAccountButton\",\"key\":\"A\",\"op\":\"openmenu\",\"panel\":\"C\"}']")).click();
            driver.findElement(By.cssSelector("div[aria-label='Person'] div[class='gw-label']")).click();
            driver.findElement(By.cssSelector("input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']")).sendKeys("1234567890");
            WebElement w=driver.findElement(By.cssSelector("select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-PrimaryPhone']"));
            Select s=new Select(w);
            s.selectByVisibleText("Mobile");

            WebElement x=driver.findElement(By.cssSelector("select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']"));
            Select c=new Select(x);

            c.selectByValue("US");
            driver.findElement(By.cssSelector("input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']")).sendKeys("123, street");

            WebElement y=driver.findElement(By.cssSelector("select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']"));
            Select state=new Select(y);
            state.selectByValue("HI");
            WebElement a=driver.findElement(By.cssSelector("select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressType']"));
            Select at=new Select(a);
            at.selectByValue("billing");

            driver.findElement(By.cssSelector("input[placeholder='###-##-####']")).sendKeys("123456789");

            driver.findElement(By.cssSelector("div[id='CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-Producer-SelectOrganization'] span[class='gw-icon']")).click();

            driver.findElement(By.cssSelector("input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-GlobalContactNameInputSet-Name']")).sendKeys("a");
            driver.findElement(By.id("OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search")).click();



            List<WebElement> OC=driver.findElements(By.xpath("//div[@id='OrganizationSearchPopup-OrganizationSearchPopupScreen-2']//tr[@class='gw-RowWidget gw-styleTag--ListViewWidget gw-row gw-standard-row gw-isAlternateStyle']//div[@class='gw-vw--value gw-align-h--left']/div[@class='gw-value-readonly-wrapper']"));
            for (int i =0;i< OC.size();i++){

                String name=OC.get(i).getText();

                if (name.contains("Armstrong and Company")){
                    System.out.println("Hi there");
                    driver.findElements(By.xpath("//tr[@class='gw-RowWidget gw-styleTag--ListViewWidget gw-row gw-standard-row gw-isAlternateStyle']//div[@role='button']")).get(i).click();
                    break;
                }
            }
            WebElement Pc=driver.findElement(By.cssSelector("select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-ProducerCode']"));
            Select pc=new Select(Pc);
            pc.selectByValue("ProducerCode:7");

            driver.findElement(By.cssSelector("div[data-gw-shortcut='{\"id\":\"CreateAccount-CreateAccountScreen-Update\",\"key\":\"U\",\"op\":\"fireevent\",\"panel\":\"C\"}'] div[class='gw-label']")).click();


        }

        Thread.sleep(5000);
        
        logoutfun(driver);
        driver.quit();
    }
}
