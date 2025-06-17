package TestNGIntro;
import org.testng.annotations.*;
public class Basics {

    @AfterTest
    public void lastExecution(){
        System.out.println("I am executing in the last");
    }

    @AfterSuite
    public void AFsuite(){
        System.out.println("I m aftersuite");
    }

    @Test
    public void Demo(){
        System.out.println("hello");
    }

    @Test
    public void SecondTest(){
        System.out.println("Byee");
    }
    @BeforeTest
    public void Prerequisites(){
        System.out.println("I m the first");
    }
}
