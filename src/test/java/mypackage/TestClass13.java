package mypackage;
public class TestClass13 {
    public static void main(String[] args) {
        devide(10, 0);
    }
//    public static void devide(int a, int b){
//        try {
//            System.out.println("Result is: " + a / b);
//        } catch (ArithmeticException e) {
//            System.out.println("Problem!");
//        } finally {
//            System.out.println("Finish!");
//        }
//    }
    public static void devide(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("Cannot devide by zero!");
        } else {
            System.out.println("Result is: " + a / b);
        }
    }
}
