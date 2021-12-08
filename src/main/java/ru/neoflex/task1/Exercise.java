package ru.neoflex.task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integerList, int numberOfDuplicates) {
        // TODO: task1

        return Optional.ofNullable(integerList)
                .map(Collection::stream)
                .orElseGet(Stream::empty)
                .filter(integer -> Collections.frequency(integerList, integer) == numberOfDuplicates && integer != null)
                .distinct()
                .collect(Collectors.toList());
    }

}
