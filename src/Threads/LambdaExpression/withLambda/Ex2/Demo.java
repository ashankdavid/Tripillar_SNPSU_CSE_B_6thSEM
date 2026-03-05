package Threads.LambdaExpression.withLambda.Ex2;

interface Calculator{
    int add(int a, int b);
}

public class Demo {
    public static void main(String[] args) {
        Calculator c = (a,b) -> a+b;
        System.out.println(c.add(10,20));
    }
}
