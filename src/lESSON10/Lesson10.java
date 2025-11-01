package lESSON10;

public class Lesson10 {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Archil", "Archil@mail.ru");
        Person person2 = new Person(2, "Viktory", "Viktory@ebay.com");
        Person person3 = new Person(3, "Nikita", "mustang1604@gmail.com");
        Person person4 = new Person(3, "Nikita", "mustang1604@gmail.com");


        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("person3: " + person3);
        System.out.println("person4: " + person4);

        // Сравниваем с помощью equals
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));
        System.out.println("person2.equals(person3): " + person2.equals(person3));
        System.out.println("person3.equals(person4): " + person3.equals(person4));

        // Проверяем hashCode
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());
        System.out.println("person4.hashCode(): " + person4.hashCode());
    }
}
