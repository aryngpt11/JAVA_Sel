package org.example.Java_Stream;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Maps {
    @Test
    public void StreamMap(){
        Stream.of("asdfg","qwert","zxcvb","aqwera","azxcva").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        List<String> names = Arrays.asList("Avinash", "Abhinaw", "Vivek", "Riya");
        names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

    }
}
