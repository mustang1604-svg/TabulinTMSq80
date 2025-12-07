package Lesson_15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lesson_15 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите набор чисел (пример: '1, 2, 3, 4, 4, 5'): ");
    String input = scanner.nextLine().trim();

    // Разделяем строку по запятым, удаляем пробелы и преобразуем в Integer
    String[] parts = input.split(",");
    Set<Integer> uniqueNumbers = new HashSet<>(); // Set для автоматического удаления дубликатов

    for (String part : parts) {
        String trimmed = part.trim();
        if (!trimmed.isEmpty()) {
            try {
                int number = Integer.parseInt(trimmed);
                uniqueNumbers.add(number); // Добавляем в Set (дубликаты игнорируются)
            } catch (NumberFormatException e) {
                System.out.println("Предупреждение: '" + trimmed + "' не является числом, пропускаем.");
            }
        }
    }

    // Выводим результат
    System.out.println("Уникальные числа: " + uniqueNumbers);
    scanner.close();
}
}
