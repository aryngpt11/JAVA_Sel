package TestNGIntro;

import org.testng.annotations.*;

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
    @Parameters({"URL"})
    @Test
    public void Params(String urlname){
        System.out.println(" i am the example of the Parameterized concept in TestNG");
        System.out.println(urlname);
    }

    @Test(enabled = false)
    public void Skiip(){
        System.out.println("i m the method which we are use to skip any testcase");
    }
    @Test(dataProvider = "getData")
    public void newWebloginCarLoann(String username,String Pwd){
        System.out.println("Newweblogincarrrr");
        System.out.println(username);
        System.out.println(Pwd);
    }


    @DataProvider
    public Object[][] getData(){
        Object[][]data=new Object[3][2];
        data[0][0] = "firstset";
        data[0][1] = "password1";

        data[1][0] = "secondset";
        data[1][1] = "password2";

        data[2][0] = "thirdset";
        data[2][1] = "password3";

        return data;

    }
}
