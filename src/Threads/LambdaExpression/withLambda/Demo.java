package Threads.LambdaExpression.withLambda;

interface Greeting{
    void sayHello();
}

public class Demo {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello World");
        g.sayHello();
    }

}
