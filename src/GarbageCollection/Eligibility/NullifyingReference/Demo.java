package GarbageCollection.Eligibility.NullifyingReference;

// 1) Nullifying Reference
public class Demo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj = null; // This obj is now elegible for GC
    }
}
