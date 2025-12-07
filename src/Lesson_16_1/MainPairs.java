package Lesson_16_1;

import static Lesson_16_1.StringPairs.pairsAlternative;

public class MainPairs {
    public static void main() {
        System.out.println(pairsAlternative(new String[]{"code", "bug"}));


        System.out.println(pairsAlternative(new String[]{"man", "moon", "main"}));


        System.out.println(pairsAlternative(new String[]{"man", "moon", "good", "night"}));



        System.out.println(pairsAlternative(new String[]{"hello", "", "world"}));

    }
}
