package mypackage;

public class Car2 implements Transport, InterfaceTest{
    @Override
    public void go() {
        System.out.println("We r driving!");
    }
    @Override
    public void stop() {
        System.out.println("We r driving slower!");
    }

    @Override
    public void method1() {
        System.out.println("test1");
    }
    @Override
    public void method2() {
        System.out.println("test2");
    }
}
