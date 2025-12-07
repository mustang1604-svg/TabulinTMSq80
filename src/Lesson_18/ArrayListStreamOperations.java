package Lesson_18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamOperations {
    public static void main() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        System.out.println("Исходный список: " + numbers);
        long count = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Количество уникальных четных элементов: " + count);
        List<Integer> resultList = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Оставшиеся элементы: " + resultList);
    }
}

