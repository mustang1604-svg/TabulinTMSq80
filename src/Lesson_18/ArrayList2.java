package Lesson_18;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        long result = new ArrayList<>(List.of(1, 2, 3, 2, 4, 5, 4, 6, 7, 8))
                .stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Количество уникальных четных элементов: " + result);
    }
}