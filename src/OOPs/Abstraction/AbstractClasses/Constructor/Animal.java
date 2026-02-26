package OOPs.Abstraction.AbstractClasses.Constructor;

abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor");
    }
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Driver{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

/*
Why does Abstract class have COnstructor?
-> COnstructors are used for initializing common data!
-> When a child class object is created, the Parent class
    Constructor runs first
-> Parent Constructor is getting executed becuase of inheritance
Not because of Object creation!
 */