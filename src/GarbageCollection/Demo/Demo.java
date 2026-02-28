package GarbageCollection.Demo;

public class Demo {
    public void finalize(){
        System.out.println("Garbage Collected!");
    }

    public static void main(String[] args) {
        for(int i=0; i<10000; i++){
            Demo obj = new Demo();
            obj = null;
        }
        System.gc();
    }
}
