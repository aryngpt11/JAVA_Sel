package TestNGIntro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ReegExpree {
    @Test
    public void WebloginCarLoan(){
        System.out.println("weblogincar");
    }

    @Test
    public void MobileloginCarLoan(){
        System.out.println("mobilelogincar");
    }

    @BeforeSuite
    public void BFsuite(){
        System.out.println("I m beforesuite");
    }
    @AfterMethod
    public void AFmtd(){
        System.out.println("I m after method");
    }

    @Test
    public void MobileSigninCarLoan(){
        System.out.println("mobilesignincar");
    }
    @Test
    public void MobileSignoutCarLoan(){
        System.out.println("mobilesignoutcar");
    }

    @Test
    public void LoginAPICarLoan(){
        System.out.println("APIcarlogin");
    }
}
