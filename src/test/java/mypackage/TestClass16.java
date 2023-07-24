package mypackage;

public class TestClass16 {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.color = "Black";
        car1.lenght = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);

        Car car2 = new Car();
        car2.color = "White";
        Car car3 = new Car();
        car3.color = "Red";

        car2.drive(100);
        car3.drive(150);
        System.out.println();

        System.out.println(Car.var);
        Car.var = 100;

        System.out.println(car1.var);
        System.out.println(car2.var);
        System.out.println(car3.var);

        Car.method();

        String.format("New %s string", "string");
    }
}
