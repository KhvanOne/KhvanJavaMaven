package mypackage;

public class TestClass21 {
    public static void main (String[] args){
        Car2 car2 = new Car2();
        Plane plane = new Plane();

        car2.go();
        car2.stop();
        car2.method1();
        car2.method2();

        plane.go();
        plane.stop();
        plane.setSpeed(500);
    }
}
