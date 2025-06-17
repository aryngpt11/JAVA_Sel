package TestNGIntro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Day4 {
    @Test
    public void WebloginHomeLoan(){
        System.out.println("webloginHome");
    }



    @Test
    public void MobileloginHomeLoan(){
        System.out.println("mobileloginhome");
    }

    @Test
    public void LoginAPIHomeLoan(){
        System.out.println("APIhomelogin");
    }
}
