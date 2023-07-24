package mypackage;

public class Animal {
    String name;
    String color;

    protected int var;

    public void walk(String place){
        System.out.println("We r walking here: " + place);
        var = 10;
    }
    public void sleep(){
        System.out.println("Zzz");
    }
    public void sound(){
        System.out.println("Hello mthrfckr!");
    }
}
