package lesson11;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lesson11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Ввести 3 строки, найти самую короткую и самую длинную
        System.out.println("Задача 1: Введите 3 строки:");
        String[] strings1 = new String[3];
        for (int i = 0; i < 3; i++) {
            strings1[i] = scanner.nextLine();
        }

        String shortest = strings1[0];
        String longest = strings1[0];
        for (String str : strings1) {
            if (str.length() <= shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        System.out.println("Самая короткая строка: \"" + shortest + "\" (длина: " + shortest.length() + ")");
        System.out.println("Самая длинная строка: \"" + longest + "\" (длина: " + longest.length() + ")");

        // Задача 2: Ввести 3 строки, упорядочить по длине в порядке возрастания
        System.out.println("\nЗадача 2: Введите 3 строки:");
        String[] strings2 = new String[3];
        for (int i = 0; i < 3; i++) {
            strings2[i] = scanner.nextLine();
        }

        Arrays.sort(strings2, (a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println("Строки в порядке возрастания длины:");
        for (String str : strings2) {
            System.out.println("\"" + str + "\" (длина: " + str.length() + ")");
        }

        // Задача 3: Ввести 3 строки, вывести те, длина которых меньше средней
        System.out.println("\nЗадача 3: Введите 3 строки:");
        String[] strings3 = new String[3];
        int totalLength = 0;
        for (int i = 0; i < 3; i++) {
            strings3[i] = scanner.nextLine();
            totalLength += strings3[i].length();
        }

        double averageLength = (double) totalLength / 3;
        System.out.println("Средняя длина: " + averageLength);

        System.out.println("Строки с длиной меньше средней:");
        for (String str : strings3) {
            if (str.length() < averageLength) {
                System.out.println("\"" + str + "\" (длина: " + str.length() + ")");
            }
        }

        // Задача 4: Ввести 3 строки, найти слово, состоящее только из различных символов (первое)
        System.out.println("\nЗадача 4: Введите 3 строки:");
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        String allText = line1 + " " + line2 + " " + line3;

        String[] words = allText.split("\\s+");
        String uniqueWord = null;
        for (String word : words) {
            if (isAllUniqueChars(word)) {
                uniqueWord = word;
                break;
            }
        }

        if (uniqueWord != null) {
            System.out.println("Первое слово с уникальными символами: \"" + uniqueWord + "\"");
        } else {
            System.out.println("Слов с уникальными символами не найдено.");
        }

        // Задача 5: Ввести строку, дублировать каждую букву
        System.out.println("\nЗадача 5: Введите строку:");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c).append(c);
            } else {
                result.append(c);
            }
        }
        System.out.println("Результат: \"" + result.toString() + "\"");

        scanner.close();
    }

    //все ли символы в слове уникальны
    private static boolean isAllUniqueChars(String word) {
        Set<Character> charSet = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}
