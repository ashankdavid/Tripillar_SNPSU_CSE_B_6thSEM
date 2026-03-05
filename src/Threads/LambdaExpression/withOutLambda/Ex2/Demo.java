package Threads.LambdaExpression.withOutLambda.Ex2;

interface Calculator{
    int add(int a, int b);
}

public class Demo{
    public static void main(String[] args) {
        // Anonymous Class
        Calculator c = new Calculator() {
            @Override
            public int add(int a, int b){
                return a+b;
            }
        };

        int result = c.add(10,20);
        System.out.println("Result: " + result);
    }
}
