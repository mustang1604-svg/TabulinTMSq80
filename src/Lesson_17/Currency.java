package Lesson_17;

import java.util.Scanner;
import java.util.function.Consumer;

public class Currency {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        // Курс доллара (примерный)
        double usdRate = 0.345;
        // Consumer для конвертации и вывода результата
        Consumer<String> convertAndPrint = input -> {
            try {
                // Извлекаем числовое значение
                String[] parts = input.split(" ");
                double amount = Double.parseDouble(parts[0]);
                // Конвертируем в доллары
                double usdAmount = amount * usdRate;

                System.out.printf("%.2f BYN = %.2f USD%n", amount, usdAmount);
            } catch (Exception e) {
                System.out.println("Неверный формат ввода. Используйте: 'сумма BYN'");
            }
        };

        System.out.print("Введите сумму в BYN (например: '100 BYN'): ");
        String input = scanner.nextLine();
        // Применяем Consumer
        convertAndPrint.accept(input);
        scanner.close();
    }
}
