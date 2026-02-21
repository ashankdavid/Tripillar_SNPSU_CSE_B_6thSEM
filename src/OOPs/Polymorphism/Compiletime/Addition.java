package OOPs.Polymorphism.Compiletime;

// 2 same functions in same class - overloading
public class Addition {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
class Driver{
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(1,2);
        obj.add(1,2,3);
    }
}
