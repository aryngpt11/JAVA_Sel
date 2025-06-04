package org.example.Java_Stream;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
    @Test
    public void Sortt(){
        List<Integer> values= Arrays.asList(3,2,2,7,5,1,9);
        values.stream().distinct().forEach(s-> System.out.println(s));
        List<Integer> Li=values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(Li.get(0));
    }
}
