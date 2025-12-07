package Lesson_16;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        // Считаем количество вхождений каждой строки
        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        // Заполняем результат: true если встречается 2+ раз, иначе false
        for (String key : countMap.keySet()) {
            result.put(key, countMap.get(key) >= 2);
        }

        return result;
    }

    // Альтернативная версия без использования дополнительной карты счетчика
    public static Map<String, Boolean> wordMultipleAlternative(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();

        for (String str : strings) {
            // Если строка уже есть в карте, устанавливаем true
            // Если встречается первый раз, устанавливаем false
            result.put(str, result.containsKey(str));
        }

        return result;
    }
}
