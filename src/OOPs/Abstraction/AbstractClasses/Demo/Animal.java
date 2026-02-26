package OOPs.Abstraction.AbstractClasses.Demo;

abstract class Animal {

    abstract void sound();

    static void run()
    {
        System.out.println("Running..");
    }
}

class Lion extends Animal{

    void sound(){
        System.out.println("Roars");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}

class Driver{
    public static void main(String[] args) {
        Lion l = new Lion();
        l.sound();
        Animal.run();

        Cat c = new Cat();
        c.sound();
        Animal.run();
    }
}