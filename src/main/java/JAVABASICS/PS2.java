package JAVABASICS;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PS2 extends PS1 {
//    public static void main(String[] args) {
//        PS1 p=new PS2();
//        p.doThis();
//    }


    @Test
    public void testrun(){
        int a=3;
        doThis();
        PS3 p=new PS3(3);
        System.out.println(p.increment());
        System.out.println(p.decrement());


        System.out.println(p.MultiplyTwo());
        System.out.println(p.MultiplyThree());
    }
}
