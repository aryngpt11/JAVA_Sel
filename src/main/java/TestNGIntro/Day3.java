package TestNGIntro;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 {
    @BeforeClass
    public void befoclass(){
        System.out.println("it is executing before the methods of the class");
    }

    @Test(timeOut=4000)
    public void WebloginCarLoan(){
        System.out.println("weblogincar");
    }

    @Test(groups={"Smoke"})
    public void MobileloginCarLoan(){
        System.out.println("mobilelogincar");
    }
    @BeforeMethod
    public void BFmtd(){
        System.out.println(" i m beforemethod");
    }

    @Test(dependsOnMethods = {"WebloginCarLoan"})
    public void APICarLoan(){
        System.out.println("APIcarlogin");


    }
    @Test(enabled = false)
    public void Skiip(){
        System.out.println("i m the method which we are use to skip any testcase");
    }
}
