package lesson5;
import java.util.Random;
import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 2;
        int[][] massive = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                massive[i][j] = random.nextInt(10);
                System.out.print(massive[i][j]+" "+"\t");

            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число  ");
        int userNumber = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                massive[i][j] += userNumber;
                System.out.print(massive[i][j]+" "+"\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += massive[i][j];
            }
        }
        System.out.println("Сумма всех элементов: " + sum);
        scanner.close();

           chess();

    }
    // задлание 2
    public static void chess() {
        String[][] board = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}




