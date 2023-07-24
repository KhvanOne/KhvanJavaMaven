package mypackage;

public class Car {
    public Car(){
        System.out.println("New car created!");
    }
    public Car(String color){
        this.color = color;
    }
    public Car(String color, int height, int width, int lenght){
        this.color = color;
        this.height = height;
        this.width = width;
        this.lenght = lenght;
    }
    static int var = 10;
    static void method(){
        System.out.println("Static method.");
    }
    int height;
    int width;
    int lenght;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;


    public void addWeight(int weight){
        this.weight += weight;
        System.out.println("New weight: " + this.weight);
    }
    public void drive(int speed){
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println("We r driving!");
        } else {
            System.out.println("Can`t drive!");
        }
    }
}