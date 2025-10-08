package main3;

import java.util.Scanner;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyles.index;

public class lesson3 {
    static void main(String[] args) {
        System.out.println("Операторы управления");
        programSum();
    }
//Напишите программу, которая будет принимать входное число из консоли и на выходе
//будет выведено сообщение четное число или нет. Для определения четности чисел
//Получение остатка от деления
    public static void evenOdd() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число нечетное.");
        }


    }
    //Для введенного числа t (температуры на улице) вывести: Если t>–5, вывести «Теплый».
    //Если –5>= т > –20, вывести «Нормальный». Если –20>= t, вывести «Холод».
    public static void temperatureMeasuary(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int t = input.nextInt();
        if (t >-5 ){
            System.out.println("Температура на улице Теплая " +t);
        } else if (-5>= t && t >=-20 ){
            System.out.println("Температура на улице Нормальная "+t);
        } else if (-20 > t){
            System.out.println("Дико холодно, сидите дома "+t);
        }
    }
    //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 последовател
    public static void sqares() {
        for (int i = 10; i <= 20; i++){
            int sq = i * i;
        System.out.println("Квадрат числа " + i + " равен " + sq);
        }

    }
    //Необходимо, чтобы программа вывела на экран такую последовательность:
    //7 14 21 28 35 42 49 56 63 70 77 84 91 98
    public static void Schitalka(){
        int a = 7;
        while (a <= 98) {
            System.out.print (a+" ");
            a+=7;}
    }
    public static void programSum(){
        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
        System.out.print("Введите любое целое положительное число: ");
        while (!validInput) {
            //Является ли целым числом
            if (input.hasNextInt()) {
                number = input.nextInt();
                // Является ли число положительным
                if (number > 0) {
                    validInput = true;
                } else {
                    System.out.println("Ошибка: число должно быть положительным. Попробуйте еще раз:");
                }
            } else {
                System.out.println("Ошибка: введено некорректное значение. Пожалуйста, введите целое число:");
                input.next();
            }
        }
                long sum = 0; // Используем long на случай очень больших сумм
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                System.out.println("Сумма всех чисел от 1 до " + number + " равна: " + sum);
                input.close();
            }
        }






