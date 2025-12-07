package Lesson_17_5;

import java.util.Scanner;
import java.util.function.Supplier;

public class ReverseStringSupplier {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // Supplier для ввода строки и ее переворота
        Supplier<String> reverseInput = () -> {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            // Переворачиваем строку
            return new StringBuilder(input).reverse().toString();
        };
        // Получаем перевернутую строку
        String reversed = reverseInput.get();
        System.out.println("Перевернутая строка: " + reversed);
        scanner.close();
    }
}

/* public static void main() {
    Scanner scanner = new Scanner(System.in);
    // Supplier для ввода строки и ее переворота
    Supplier<String> reverseInput = () -> {
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        // Переворачиваем строку
        return new StringBuilder(input).reverse().toString();
    };
    // Получаем перевернутую строку
    String reversed = reverseInput.get();
    System.out.println("Перевернутая строка: " + reversed);

    scanner.close();
}
*/
