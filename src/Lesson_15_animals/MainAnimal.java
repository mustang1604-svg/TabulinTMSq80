package Lesson_15_animals;

public class MainAnimal {
    public static void main(String[] args) {
        AnimalCollection collection = new AnimalCollection();

        // Добавляем животных (в начало)
        collection.addAnimal("Собака");
        collection.addAnimal("Лев");
        collection.addAnimal("Тигр"); // Теперь: [Тигр, Лев, Слон]

        collection.printCollection();

        // Удаляем из конца
        collection.removeAnimal(); // Удалит "Слон", теперь: [Тигр, Лев]
        collection.removeAnimal(); // Удалит "Лев", теперь: [Тигр]

        collection.printCollection();

        // Добавляем еще одно
        collection.addAnimal("Обезьяна"); // Теперь: [Обезьяна, Тигр]

        collection.printCollection();
    }
}
