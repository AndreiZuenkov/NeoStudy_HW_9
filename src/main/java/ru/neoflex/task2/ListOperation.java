package ru.neoflex.task2;


import java.util.*;
import java.util.stream.Stream;

public class ListOperation {

    public int integerSum(List<String> input) {
        // TODO: task2
        return Arrays.stream(Optional.ofNullable(input)
                .map(Collection::stream)
                .orElseGet(Stream::empty)
                .filter(Objects::nonNull)
                .map(s -> s.replaceAll("[^0-9-]", " "))
                .reduce("", (v1, v2) -> v1 +" "+ v2)
                .split(" "))
                .filter(s -> s.matches("-?\\d+"))
                .map(Integer::parseInt)
                .reduce(0,Integer::sum);


    }

}
