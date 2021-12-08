package ru.neoflex.task2;


import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperation {

    public int integerSum(List<String> input) {
        // TODO: task2
        return Arrays.stream(input.stream()
//                .map(s -> s.replaceAll("\\D+", ""))
                .map(s->s.replaceAll("[^0-9-]+",""))
                .reduce("", (v1, v2) -> v1 + v2)
                .split(""))
                .map(i->Integer.parseInt(i))
                .reduce(0, Integer::sum);



    }

}
