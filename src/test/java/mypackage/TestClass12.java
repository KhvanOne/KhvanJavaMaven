package mypackage;

public class TestClass12 {
    public static void main(String[] args){
        int result;
        result = getZver(1, 10);
        System.out.println(result);
        result = getZver(5, 100, 66);
        System.out.println(result);

        sayHello("Aziz");
        sayHello("Nikitos", "Chomil");
        sayHello();

        int[] array = {1, 22, 52, 34, 16};
        int zver = getZver(array, "Sirj");
        System.out.println(zver + 100);
    }
    static int getZver(int x, int y) {
        int zver;
        zver = x + y;
        return zver;
    }
    static int getZver(int x, int y, int z) {
        int zver;
        zver = x + y + z;
        return zver;
    }
    static int getZver(int[] array, String name) {
        int zver = 0;
        for(int i = 0; i < array.length; i++){
            zver += array[i];
        }
        System.out.println();
        System.out.println("Hi " + name + "!");
        System.out.println("Your zver is: " + zver);
        return zver;
    }
    static void sayHello(String name){
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("I`m your sugar daddy!");
        System.out.println("Nice to meet u mal!");
    }
    static void sayHello(String name1, String name2){
        System.out.println();
        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("I`m your sugar daddy!");
        System.out.println("Nice to meet u mal!");
    }
    static void sayHello(){
        System.out.println();
        System.out.println("Hello!");
        System.out.println("I`m your sugar daddy!");
        System.out.println("Nice to meet u mal!");
    }
}
