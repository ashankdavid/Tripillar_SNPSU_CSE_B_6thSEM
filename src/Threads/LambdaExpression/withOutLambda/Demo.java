package Threads.LambdaExpression.withOutLambda;

interface Greeting{
    void sayHello();
}

public class Demo {
    public static void main(String[] args) {
        Greeting g = new Greeting(){
            @Override
            public void sayHello(){
                System.out.println("Hello World");
            }
        };
        g.sayHello();
    }
}
