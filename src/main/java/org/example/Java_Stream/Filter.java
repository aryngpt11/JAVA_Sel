package org.example.Java_Stream;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Filter {

    @Test
    public void regular(){
        ArrayList<String> names= new ArrayList<String>();
        names.add("Aqwerty");
        names.add("asdfg");
        names.add("zxcvb");
        names.add("Axcb");
        names.add("Ayuio");
        int count=0;
        for (int i =0;i<names.size();i++){
            String a=names.get(i);
            if (a.toLowerCase().startsWith("a")){
                count+=1;
                System.out.println(a);

            }

        }
        System.out.println(count);

    }
    @Test
    public void StreamFilter(){
        ArrayList<String> names= new ArrayList<String>();
        names.add("Aqwerty");
        names.add("asdfg");
        names.add("cvb");
        names.add("Axb");
        names.add("Ayuio");

        long c=names.stream().filter(s -> s.toLowerCase().startsWith("a")).count();           //filter is filternig data based upon the condition.
        System.out.println(c);

        //OR

        long d=Stream.of("asdfg","qwert","zxcvb","aqwer","azxcv").filter(s ->
        {
            s.toLowerCase()
                    .startsWith("a");
            return true;


        }).count();
        System.out.println(d);
        //names.stream().filter(s -> s.length()>4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s));
    }

}
