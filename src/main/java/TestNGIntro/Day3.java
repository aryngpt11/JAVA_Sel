package TestNGIntro;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 {

    @Test
    public void WebloginCarLoan(){
        System.out.println("weblogincar");
    }

    @Test
    public void MobileloginCarLoan(){
        System.out.println("mobilelogincar");
    }
    @BeforeMethod
    public void BFmtd(){
        System.out.println(" i m beforemethod");
    }

    @Test
    public void LoginAPICarLoan(){
        System.out.println("APIcarlogin");
    }
}
