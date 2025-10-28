package lesson_9;

public class MyMain_9lesson {
    public static void main(String[] args) {
        Position director = new Director();
        Position worker = new Worker();
        Position buhgalter = new Buhgalter();


        director.printPosition();
        worker.printPosition();
        buhgalter.printPosition();
    }
}
