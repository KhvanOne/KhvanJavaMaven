package mypackage;

public class Plane implements Transport{
    @Override
    public void go() {
        System.out.println("We r flying!");
    }
    @Override
    public void stop() {
        System.out.println("We r landing!");
    }
    public void setSpeed(int speed){
        System.out.println("Our speed is: " + speed);
    }
}
