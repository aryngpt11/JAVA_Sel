package JAVABASICS;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS1 {
    public void doThis(){
        System.out.println("i m here");
    }
    @BeforeMethod
    public void beforeRun(){
        System.out.println("Run first");
    }
    @AfterMethod
    public void afterRun(){
        System.out.println("Last run");
    }

}
