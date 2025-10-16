package Lession4;

import java.util.Random;

import java.util.Scanner;
//Для всех задач исходные условия следующие: пользователь с клавиатурой вводит размер
//массива (просто подразумевает число). После того, как задан размер массива, заполните его
//одним из двух способов: с помощью Math.random(), или каждый элемент массива вводится
//вручную.
public class Lession4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();
        System.out.println("Массив, заполненный случайными числами:");

        for (int i = 0; i < size; i++) {
            // Генерируем случайное число
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        //Пройдите по массиву, выведите все элементы в прямом и обратном порядке
        System.out.println();
        System.out.print("Прямой порядок: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Обратный порядок: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //найти создание-максимальное количество элементов и вывод
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        //Найти индексы минимального и максимального элементов
        int minIndex = (0);
        int maxIndex = (0);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Индекс минимального элемента: " + minIndex);
        System.out.println("Индекс максимального элемента: " + maxIndex);
        //Найти и вывести количество нулевых элементов
        int zeroCount = 0;
        for (int number : array) {
            if (number == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 0) {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        } else {
            System.out.println("Нулевых элементов в массиве нет.");
        }
        // Пройти по массиву и поменять местами элементы первый и последний, второй и
        // предпоследний и т.д
        int legth = array.length;
        for (int i = 0; i < array.length / 2; i++) {

            int temp = array[i];
            array[i] = array[legth - 1 - i];
            array[legth - 1 - i] = temp;
        }
        for (int i = 0; i < legth; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i - 1] >= array[i]) {
                    System.out.println("Последовательность не возрастающая");
                    break;
                }
            }
            if (i == array.length - 1)
                System.out.println("Последовательность возрастающая");
        }
        star();
    }

    public static void star(){

    }

}










