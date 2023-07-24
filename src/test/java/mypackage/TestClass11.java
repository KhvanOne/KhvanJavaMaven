package mypackage;

public class TestClass11 {
    public static void main(String[] args){
        int a = 13;
        int b = 3;
        int zver;

        zver = getZver(a , b);
        System.out.println(zver);
        zver = getZver(10, 150);
        System.out.println(zver);
        System.out.println(getZver(2, 11));

        showZver(10, 51, 77);
        showZver(5, 12, 14);

        saySmth();
        sayHello("Aziz");
        String name = "Nikitos";
        sayHello(name);

        showZverToPerson("Nikitos",69,96,69);

        boolean result = showZver(1, 22, 333);
        System.out.println(result);
    }
    static int getZver(int x, int y){
        int zver;
        zver = x + y;
        return zver;
    }
    static boolean showZver(int x, int y, int z){
        int zver = x + y + z;
        System.out.println("Zver is: " + zver);
        return true;
    }

    static void saySmth(){
        System.out.println();
        System.out.println("Hello!");
        System.out.println("I`m Vova Zver");
        System.out.println("U see me!");
        System.out.println("I fuck all of u especialy Nikitos");
        System.out.println("And Aziz slavbiy mal");
    }
    static void sayHello(String name){
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("I`m your sugar daddy!");
        System.out.println("Nice to meet u mal!");
    }
    static void  showZverToPerson(String name,int a, int b, int c){
        System.out.println();
        System.out.println("Start of program");
        sayHello(name);
        showZver(a, b, c);
        System.out.println("End of program");
    }
}
