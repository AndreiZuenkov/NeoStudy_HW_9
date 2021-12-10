package ru.neoflex.task4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenAndOddFinder {

    Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {
        // TODO: task4
        return Optional.ofNullable(input)
                .map(Collection::stream)
                .orElseGet(Stream::empty)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .filter(Objects::nonNull)
                .filter(s->s.length()!=0)
                .distinct()
                .collect(Collectors.groupingBy(s -> ((s.length() % 2 == 0) ? CharacterType.EVEN : CharacterType.ODD), Collectors.toSet()));
    }

}
