package ru.neoflex.task2;


import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;
import java.util.stream.Collectors;

public class ListOperation {

    public int integerSum(List<String> input) {
        // TODO: task2
        return input.stream()
                .map(s->s.replaceAll("\\D+",""))
                .peek(System.out::println)
                .map(s->s.split(" "))
                .peek(System.out::println)
                .mapToInt(s->Integer.parseInt(String.valueOf(s)))
                .peek(System.out::println)
                .sum();

//                .reduce((str1, str2)-> str1+" " + str2)
//                .orElseGet()
//                .stream()
//                .mapToInt(s->Integer.parseInt(String.valueOf(s)))


    }

}
