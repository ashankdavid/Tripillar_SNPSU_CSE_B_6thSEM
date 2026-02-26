package OOPs.Abstraction.Interfaces.Demo;

public interface Animal {
    void sound(); // abstract method

    void run(); // abstract method
}

class Lion implements Animal{
    public void sound(){
        System.out.println("Roar");
    }

    public void run(){
        System.out.println("Running..");
    }
}

class Driver{
    public static void main(String[] args) {
        Lion l = new Lion();
        l.run();
        l.sound();
    }
}
