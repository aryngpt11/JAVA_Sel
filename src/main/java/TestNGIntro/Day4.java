package TestNGIntro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

    @AfterClass
    public void aftclass(){
        System.out.println("i m after class");
    }
    @Test(groups={"Smoke"})
    public void WebloginHomeLoan(){
        System.out.println("webloginHome");
    }



    @Test
    public void MobileloginHomeLoan(){
        System.out.println("mobileloginhome");

    }
    @Parameters({"URL","apikey"})
    @Test
    public void LoginAPIHomeLoan(String url, int api){
        System.out.println("APIhomelogin");
        System.out.println("mobilelogin"+url+""+api);
    }
}
