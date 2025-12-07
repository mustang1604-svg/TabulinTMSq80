package Lesson_16;

import static Lesson_16.WordMultiple.wordMultiple;
import static Lesson_16.WordMultiple.wordMultipleAlternative;

public class CollectoinPro {
    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"а", "б", "а", "в", "б"}));
        // → {"а": true, "б": true, "в": false}

        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        // → {"a": false, "b": false, "c": false}

        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
        // → {"c": true}

        // Тестируем альтернативную версию
        System.out.println("Альтернативный метод:");
        System.out.println(wordMultipleAlternative(new String[]{"а", "б", "а", "в", "б"}));
    }
}
