package lesson9_second_part;


public class MyMain9seconds {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(5.0);
        figures[1] = new Rectangle(4.0, 6.0);
        figures[2] = new Triangle(3.0, 4.0, 5.0);
        figures[3] = new Circle(3.0);
        figures[4] = new Rectangle(2.0, 8.0);

        // Выводим периметр всех фигур в массиве
        System.out.println("Периметры фигур:");
        for (int i = 0; i < figures.length; i++) {
            System.out.printf("Фигура %d: %.2f%n", (i + 1), figures[i].perimeter());
        }
    }
}
