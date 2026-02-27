package GarbageCollection.Eligibility.ReassigningReference;
//2) Reassigning Reference
public class Demo {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1 = obj2; //1st Obj is now elegible for GC
    }
}
