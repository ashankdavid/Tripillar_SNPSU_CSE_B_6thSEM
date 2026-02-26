package OOPs.Abstraction.Interfaces.DefaultMethods.HowToAccessDefaultMethods;

public interface Vehicle {
    default void stop(){
        System.out.println("Stopped!");
    }
}

class Car implements Vehicle{
    void carFunction(){
        System.out.println("CarFunction!");
    }
}

class Bike implements Vehicle{
    public void stop(){
        System.out.println("Bike Stopped!");
    }
}

class Driver{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.stop(); // 1st way to access default method

        Vehicle v = new Car(); // upcasting
        v.stop(); // 2nd way to access default method

        Bike b = new Bike();
        b.stop(); // 3rd way to access default method
    }
}