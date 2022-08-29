package collections.service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionService {
    public List<Integer> findOdd(List<Integer> numList) {
        return numList.stream()
            .filter(el -> el % 2 != 0)
            .collect(Collectors.toList())
        ;
    }

    public List<Integer> findUniqEven(List<Integer> numList) {
        return numList.stream()
            .distinct()
            .filter(el -> el % 2 == 0)
            .collect(Collectors.toList())
        ;
    }

    public List<String> findUnisStirs(List<String> words) {
        return words.stream()
            .distinct()
            .collect(Collectors.toList())
        ;
    }

    public HashMap<String, Integer> getCalcRepetitions(List<String> words) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (!result.containsKey(word)) {
                result.put(word, 1);
            } else {
                result.put(word, result.get(word) + 1);
            }
        }

        return result;
    }
}
