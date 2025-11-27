package lesson14;
import java.io.*;
import java.util.*;
public class MyMain14 {


        public static void main(String[] args) {
            String inputFile = "C:\\Users\\User\\Desktop\\ОБУЧЕНИЕ\\Romeo_and_Juliet.txt.txt";
            String outputFile = "C:\\Users\\User\\Desktop\\ОБУЧЕНИЕ\\longest_word.txt.txt";

            try {
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                StringBuilder text = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    text.append(line).append(" ");
                }
                reader.close();

                String[] words = text.toString().split("\\s+");
                String longestWord = "";


                for (String word : words) {
                    String cleanWord = word.replaceAll("[^a-zA-Z]", "");
                    if (cleanWord.length() > longestWord.length()) {
                        longestWord = cleanWord;
                    }
                }


                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
                writer.write("Самое длинное слово: " + longestWord);
                writer.close();

                System.out.println("Анализ завершен. Самое длинное слово записано в файл '" + outputFile + "': "
                        + longestWord);

            } catch (FileNotFoundException e) {
                System.out.println("Файл '" + inputFile + "' не найден. Убедитесь, что файл приложен и имеет " +
                        "правильное имя.");
            } catch (IOException e) {
                System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
            }
        }
    }

