package lesson8;

public class Tiger extends Animal{

    @Override
    public void voice() {
        System.out.println("Тигр-Рычит!");
            }
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Тигр любит мясо!");
        } else {
            System.out.println("Тигр не любит " + food + ".");
        }
    }
}

