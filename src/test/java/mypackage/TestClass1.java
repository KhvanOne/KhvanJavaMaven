package mypackage;

public class TestClass1 {
    public static void main(String[] args) {
        byte a = 5; // -128 127
        short b = -100; // -32768 32767
        int c;
        c = 1000000000;
        long d = -1122335544;
        System.out.println(a);
        System.out.println("short b:" + b);
        System.out.println("int c:" + c);
        System.out.println("long d:" + d);

        double double1 = 133.155;
        System.out.println();
        System.out.println("double double1:" + double1);
        float float1 = 150.32f;
        System.out.println(float1);

        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println();
        System.out.println(boolean3);
        System.out.println(boolean4);

        String str = "Hello";
        String str2 = "World!";
        String str3 = str + " " + str2;
        System.out.println();
        System.out.println(str3);

        char char1 = 'q';
        System.out.println(char1);

        String personName;
        int age;
    }
}
