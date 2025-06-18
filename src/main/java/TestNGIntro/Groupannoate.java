package TestNGIntro;


import org.testng.annotations.Test;

public class Groupannoate {

    @Test(groups={"Smoke"})
    public void WebloginCarLoan(){
        System.out.println("weblogincar");
    }

    @Test
    public void MobileloginCarLoan(){
        System.out.println("mobilelogincar");
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
