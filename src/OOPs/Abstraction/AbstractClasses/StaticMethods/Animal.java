package OOPs.Abstraction.AbstractClasses.StaticMethods;

// A abstract class can have static methods
abstract class Animal {
    static void info(){  // static method
        System.out.println("Animals are Living Beings");
    }
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Driver{
    public static void main(String[] args) {
        Animal.info();
        Dog d = new Dog();
        d.sound();
    }
}