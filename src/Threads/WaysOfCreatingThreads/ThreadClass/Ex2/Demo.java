package Threads.WaysOfCreatingThreads.ThreadClass.Ex2;

class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("MyThread: " + i);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        for(int i=1; i<=5; i++){
            System.out.println("Main Thread: " + i);
        }
    }
}

/*
start() creates new thread
run() contains logic
Output order is unpredictable
Both threads run independently
 */
