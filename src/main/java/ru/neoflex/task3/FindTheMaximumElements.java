package ru.neoflex.task3;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheMaximumElements {

    public List<BigDecimal> getThreeMaximum(List<String> input) {
        // TODO: task3
        return Optional.ofNullable(input)
                .map(Collection::stream)
                .orElseGet(Stream::empty)
                .filter(Objects::nonNull)
                .map(Float::parseFloat)
                .map(BigDecimal::new)
                .sorted(Collections.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
    }

}
