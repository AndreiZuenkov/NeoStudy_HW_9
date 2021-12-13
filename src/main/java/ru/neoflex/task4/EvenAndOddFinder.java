package ru.neoflex.task4;

import java.util.*;
import java.util.stream.Collectors;

public class EvenAndOddFinder {

    Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {
        // TODO: task4
        return Optional.ofNullable(input)
                .map(s -> s.stream()
                        .filter(Objects::nonNull)
                        .flatMap(Collection::stream)
                        .filter(Objects::nonNull)
                        .filter(v -> v.length() != 0)
                        .distinct()
                        .collect(Collectors.groupingBy(o -> ((o.length() % 2 == 0) ? CharacterType.EVEN : CharacterType.ODD), Collectors.toSet())))
                .orElseGet(()->new HashMap<CharacterType,Set<String>>() {{
                    put(CharacterType.EVEN, new HashSet<>());
                    put(CharacterType.ODD, new HashSet<>());
                }});
    }

}
