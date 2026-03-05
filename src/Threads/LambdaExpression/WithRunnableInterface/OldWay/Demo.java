package Threads.LambdaExpression.WithRunnableInterface.OldWay;

//class MyTask1 implements Runnable{
//    public void run(){
//        System.out.println("Task1 is Running");
//    }
//}
//class MyTask2 implements Runnable{
//    public void run(){
//        System.out.println("Task2 is Running");
//    }
//}

public class Demo {
    public static void main(String[] args) {
//        MyTask1 obj1 = new MyTask1(); // task not a thread
//        MyTask2 obj2 = new MyTask2(); // task not a thread
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                System.out.println("MyTask1 is running");
            }
        }); // thread1
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                System.out.println("MyTask2 is Running");
            }
        }); // thread2

        t1.start();
        t2.start();
    }
}
