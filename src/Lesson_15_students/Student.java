package Lesson_15_students;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades; // Оценки по предметам

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades); // Копируем список
    }

    // Геттеры
    public String getName() { return name; }
    public String getGroup() { return group; }
    public int getCourse() { return course; }
    public List<Integer> getGrades() { return grades; }

    // Сеттер для курса
    public void setCourse(int course) { this.course = course; }

    // Вычисление среднего балла
    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group='" + group + "', course=" + course +
                ", averageGrade=" + String.format("%.2f", getAverageGrade()) + "}";
    }
}
