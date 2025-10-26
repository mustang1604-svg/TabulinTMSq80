package lesson8;


public class MyMain_lession8 {

    public static void main(String[] args) {

        createNestedAnimals();
    }

    public static void createNestedAnimals() {
            Animal dog = new Dog();
            Animal tiger = new Tiger();
            Animal rabbit = new Rabbit();

            // Тестируем голоса
            dog.voice();
            tiger.voice();
            rabbit.voice();

            // Тестируем еду
            rabbit.eat("Grass");
            dog.eat("Meat");
            tiger.eat("Carrot");


    }



}


