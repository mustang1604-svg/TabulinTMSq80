package Lesson_15_students;

import java.util.Iterator;
import java.util.List;

public class StudentProcessor {
    // Метод: удаляет студентов с avg < 3, переводит остальных на следующий курс
    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator(); // Используем Iterator для безопасного удаления
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double avg = student.getAverageGrade();
            if (avg < 3.0) {
                System.out.println("Удален студент: " + student.getName() + " (средний балл " + avg + ")");
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
                System.out.println("Переведен на следующий курс: " + student.getName() + " (средний балл " + avg + ")");
            }
        }
    }

    // Метод: печатает имена студентов на указанном курсе
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет студентов на этом курсе.");
        }
    }
}
