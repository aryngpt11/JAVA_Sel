package org.example.Java_Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
    @Test
    public void Merge(){
        ArrayList<String> names=new ArrayList<String>();
        names.add("Aqwerty");
        names.add("asdfg");
        names.add("cvb");
        names.add("Axb");
        names.add("Ayuio");


        List<String> names1 = Arrays.asList("Avinash", "Abhinaw", "Vivek", "Riya");
        names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        Stream<String> newStream=Stream.concat(names.stream(),names1.stream());
        //newStream.sorted().forEach(s -> System.out.println(s));

        boolean flag=newStream.anyMatch(s -> s.equalsIgnoreCase("avinash"));
        System.out.println(flag);
        Assert.assertTrue(flag);

    }

    @Test
    public void StreamCollect(){
        List<String> ls=Stream.of("Avinash", "Abhinaw", "Vivek", "Riya","Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(ls.get(1));
    }
}
