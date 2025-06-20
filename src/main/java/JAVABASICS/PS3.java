package JAVABASICS;

public class PS3 extends PS4 {
    int a; //class variable

    public PS3(int a) {//instance variable
        super(a); //parent class constructor is invokee
        this.a=a;   //this keyword refers to the current class variable
    }

    public int increment(){
        a=a+1;
        return a;
    }
    public int decrement(){
        a=a-1;
        return a;
    }
}
