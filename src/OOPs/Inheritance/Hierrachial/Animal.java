package OOPs.Inheritance.Hierrachial;

public class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}

class Lion extends Animal {
    void roarLion(){
        System.out.println("Roaring...");
    }
}

class Tiger extends Animal{
    void roarTiger(){
        System.out.println("Roaring...");
    }
}

class Driver3{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Lion l = new Lion();
        l.roarLion();
        l.eat();

        Tiger t = new Tiger();
        t.roarTiger();
        t.eat();
    }
}