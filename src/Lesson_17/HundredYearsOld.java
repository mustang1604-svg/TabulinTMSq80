package Lesson_17;

import java.time.LocalDate;
import java.util.Scanner;

public class HundredYearsOld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату рождения в формате ГГГГ-ММ-ДД: ");
        String birthDateInput = scanner.nextLine();

        // Парсим введенную дату
        LocalDate birthDate = LocalDate.parse(birthDateInput);

        // Добавляем 100 лет к дате рождения
        LocalDate hundredYearsOldDate = birthDate.plusYears(100);

        System.out.println("Вам исполнится 100 лет: " + hundredYearsOldDate);

        scanner.close();
    }
}
