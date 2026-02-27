package GarbageCollection.Eligibility.IslandOfIsolation;
// Island of Isolation
public class Demo {
    Demo ref;
}

class Driver{
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2  = new Demo();

        obj1.ref = obj2;
        obj2.ref = obj1;

        obj1 = null;
        obj2 = null;
    }
}
