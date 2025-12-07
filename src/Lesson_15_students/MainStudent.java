package Lesson_15_students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        // Создаем коллекцию студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Даша", "A1", 1, Arrays.asList(2, 3, 4)));
        students.add(new Student("Андрей", "A1", 1, Arrays.asList(1, 2, 2)));
        students.add(new Student("Никита", "B2", 2, Arrays.asList(4, 5, 3)));
        students.add(new Student("Егор", "A1", 1, Arrays.asList(5, 4, 5)));

        System.out.println("Исходная коллекция:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Обрабатываем студентов
        StudentProcessor.processStudents(students);

        System.out.println("\nПосле обработки:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Печатаем студентов на курсе 1
        StudentProcessor.printStudents(students, 1);
        // Печатаем на курсе 2
        StudentProcessor.printStudents(students, 2);
    }
}


