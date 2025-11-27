package Lesson12;

import java.util.Scanner;

public class Lesson12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();


            String[] words = input.split("[\\s,]+");

            System.out.println("Аббревиатуры из строки:");
            for (String word : words) {
                if (isAbbreviation(word)) {
                    System.out.println(word);
                }
            }
        }

        private static boolean isAbbreviation(String word) {
            if (word.length() < 2 || word.length() > 6) {
                return false;
            }

            for (char c : word.toCharArray()) {
                if (!Character.isUpperCase(c) || Character.isDigit(c)) {
                    return false;
                }
            }

            return true;
        }
    }

