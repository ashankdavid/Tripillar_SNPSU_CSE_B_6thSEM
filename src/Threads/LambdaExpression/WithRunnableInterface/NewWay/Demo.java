package Threads.LambdaExpression.WithRunnableInterface.NewWay;

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> System.out.println("MyTask1 is running"));
        Thread t2 = new Thread(()-> {
            for(int i=0; i<10; i++){
                System.out.println("MyTask2 is Running: " + i);
            }
        });
        t1.start();
        t2.start();
    }
}
