package collections;

import collections.service.CollectionService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionService service = new CollectionService();
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Обрабатываемый список: " + nums);
        System.out.println("Не четные: " + service.findOdd(nums));
        System.out.println("Уникальные четные: " + service.findUniqEven(nums));

        List<String> words = new ArrayList<>(List.of("должен", "код", "любой" , "должен", "работать", "любой"));
        System.out.println("Обрабатываемый список слов: " + words);
        System.out.println("Уникальный список слов: " + service.findUnisStirs(words));
        System.out.println("Кол-во повторов слов: " + service.getCalcRepetitions(words));
    }
}
