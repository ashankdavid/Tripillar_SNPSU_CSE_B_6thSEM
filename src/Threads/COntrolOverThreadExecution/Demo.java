package Threads.COntrolOverThreadExecution;

class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Child: " + i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
