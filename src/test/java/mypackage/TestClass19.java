package mypackage;

public class TestClass19 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Vas`ka";
        dog.name = "Nikitos";

        cat.color = "White";
        dog.color = "Blue";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat name is: " + cat.name);
        System.out.println("Dog name is: " + dog.name);

        cat.sound();
        dog.sound();
    }
}
