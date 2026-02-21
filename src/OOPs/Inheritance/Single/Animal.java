package OOPs.Inheritance.Single;

public class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}

class Lion extends Animal{
    void roar(){
        System.out.println("Roaring...");
    }
}

class Driver1{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Lion l = new Lion();
        l.roar();
        l.eat();
    }
}
