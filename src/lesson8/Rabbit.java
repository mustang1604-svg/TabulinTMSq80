package lesson8;

public class Rabbit extends Animal {

    @Override
    public void voice() {
        System.out.println("Кролик делает ФР-ФР-ФР!");
    }
    public void eat(String food) {
        if ("Grass".equals(food)) {
            System.out.println("Кролик любит траву!");
        } else {
            System.out.println("Кролик не любит " + food + ".");
        }
    }
}


