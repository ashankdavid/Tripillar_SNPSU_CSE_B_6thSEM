package OOPs.ConstructoeDemo;

public class Demo {
    Demo(){
        System.out.println("Im a Constructor!");
    }
}

class Driver{
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
    }
}
