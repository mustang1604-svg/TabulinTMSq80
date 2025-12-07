package Lesson_17;

import java.util.Scanner;
import java.util.function.Function;

public class Converter {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        // Курс доллара (примерный)
        double usdRate = 0.345;

        // Лямбда-функция для конвертации
        Function<String, String> bynToUsd = input -> {
            try {
                // Извлекаем числовое значение
                String[] parts = input.split(" ");
                double amount = Double.parseDouble(parts[0]);
                // Конвертируем в доллары
                double usdAmount = amount * usdRate;

                return String.format("%.2f BYN = %.2f USD", amount, usdAmount);
            } catch (Exception e) {
                return "Неверный формат ввода. Используйте: 'сумма BYN'";
            }
        };

        System.out.print("Введите сумму в BYN (например: '100 BYN'): ");
        String input = scanner.nextLine();
        System.out.println(bynToUsd.apply(input));
        scanner.close();
    }
}
