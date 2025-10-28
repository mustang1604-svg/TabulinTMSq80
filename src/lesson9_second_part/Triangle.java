package lesson9_second_part;

public class Triangle extends Figure{
    private double base;
    private double height;
    private double hypotenuse;

    public Triangle(double base, double height, double hypotenuse) {
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        return base + height + hypotenuse;
    }
}
