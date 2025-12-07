package Lesson_16_1;

import java.util.HashMap;
import java.util.Map;

public class StringPairs {
    public static Map<String, String> pairsAlternative(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            if (str != null && !str.isEmpty()) {
                String firstChar = String.valueOf(str.charAt(0));
                String lastChar = String.valueOf(str.charAt(str.length() - 1));

                result.put(firstChar, lastChar);
            }
        }

        return result;
    }

}
