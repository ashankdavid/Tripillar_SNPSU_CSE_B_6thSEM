package Threads.WaysOfCreatingThreads.RunnableInterface.Ex1;

class MyTask implements Runnable{
    public void run(){
        System.out.println("Thread is Running");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyTask obj = new MyTask(); // task not a thread
        Thread t1 = new Thread(obj); // thread1
        Thread t2 = new Thread(obj); // thread2

        t1.start();
        t2.start();
    }
}
