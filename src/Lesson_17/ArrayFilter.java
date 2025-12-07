package Lesson_17;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayFilter {
    public static void main(String[] args) {
        Object[] mixedArray = {
                "строка",
                new int[]{1, 2, 3},
                42,
                new String[]{"a", "b", "c"},
                new double[]{1.1, 2.2}
        };

        // Предикат для проверки, является ли объект массивом
        Predicate<Object> isArray = obj -> obj.getClass().isArray();

        // Фильтруем и выводим только массивы
        Arrays.stream(mixedArray)
                .filter(isArray)
                .forEach(array -> {
                    if (array instanceof int[]) {
                        System.out.println("int array: " + Arrays.toString((int[]) array));
                    } else if (array instanceof String[]) {
                        System.out.println("String array: " + Arrays.toString((String[]) array));
                    } else if (array instanceof double[]) {
                        System.out.println("double array: " + Arrays.toString((double[]) array));
                    }
                });
    }
}
