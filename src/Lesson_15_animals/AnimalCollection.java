package Lesson_15_animals;

import java.util.ArrayDeque;
import java.util.Deque;

public class AnimalCollection {
    private Deque<String> animals = new ArrayDeque<>(); // Deque для добавления/удаления с концов

    // Добавление животного в начало коллекции
    public void addAnimal(String animal) {
        animals.addFirst(animal);
        System.out.println("Добавлено в начало: " + animal);
    }

    // Удаление животного из конца коллекции
    public String removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста, ничего удалять нечего.");
            return null;
        }
        String removed = animals.removeLast();
        System.out.println("Удалено из конца: " + removed);
        return removed;
    }

    // Метод для вывода всей коллекции (для демонстрации)
    public void printCollection() {
        System.out.println("Текущая коллекция (с начала к концу): " + animals);
    }
}
