package GarbageCollection.Eligibility.ObjectCreatedInsideMethod;
// 3) Object is created inside method()
public class Demo {
    static void createObject(){
        Demo obj = new Demo(); // after the method execution is over this object in the heap will get eligible foe GC
    }

    public static void main(String[] args) {
        createObject();
    }
}

