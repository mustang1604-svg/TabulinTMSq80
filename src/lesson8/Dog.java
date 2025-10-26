package lesson8;

public  class Dog extends Animal {


    public void voice() {
        System.out.println("Собака говорит гав-гав!");
    }
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Собака любит мясо!");
        }
        else {
            System.out.println("Собака не заинтересована в другой еде " + food + ".");
        }
    }
}


