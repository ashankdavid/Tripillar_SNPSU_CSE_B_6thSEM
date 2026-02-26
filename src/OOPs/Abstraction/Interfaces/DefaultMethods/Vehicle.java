package OOPs.Abstraction.Interfaces.DefaultMethods;

public interface Vehicle {
    void start(); // abstract method

    default void stop(){
        System.out.println("Engine Stopped!");
    }
}

class Audi implements Vehicle{
    public void start(){
        System.out.println("Audi has started!");
    }
}
class BMW implements Vehicle{
    public void start(){
        System.out.println("BMW has started!");
    }
}
class RolceRoyce implements Vehicle{
    public void start(){
        System.out.println("RolceRoyce has started!");
    }
}

class Driver{
    public static void main(String[] args) {
        Audi c1 = new Audi();
        c1.start();
        c1.stop();
    }
}
