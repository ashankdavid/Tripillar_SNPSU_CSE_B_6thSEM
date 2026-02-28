package Threads.WaysOfCreatingThreads.ThreadClass.Ex1;

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is Running");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Main Thread is Running");
    }
}
