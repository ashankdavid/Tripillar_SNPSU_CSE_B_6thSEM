package OOPs.Abstraction.Interfaces.DefaultMethods.Upcasting;

public interface Vehicle {
    void start();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Car Started!");
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike Started!");
    }
}

class Driver{
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();

        Vehicle v2 = new Bike();
        v2.start();
    }
}
