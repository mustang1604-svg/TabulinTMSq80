package special;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SpecialTask {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] args = new String[5];
        System.out.println("Введите 5 параметров :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Параметр " + (i + 1) + ": ");
            args[i] = scanner.nextLine();
        }

        List<String> paramList = Arrays.asList(args);
        scanner.close();

        Terminal terminal = new Terminal(paramList);

        String fileName = "C:\\Users\\User\\Desktop\\ОБУЧЕНИЕ\\terminal_data.txt.txt";

        try {
           // FileWriter writer = new FileWriter(fileName);
           // writer.write(terminal.toString());
           // writer.close();
            FileOutputStream fileOutputStream=new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(terminal.parameters);
            System.out.println("Объект Terminal сохранен в текстовый файл '" + fileName + "'.");

        } catch (IOException e) {
            System.out.println("Ошибка при сохранении: " + e.getMessage());
        }
    }

    }


