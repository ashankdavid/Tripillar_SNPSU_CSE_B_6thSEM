package Threads.ThreadJoin.Ex2;

class MyThread extends Thread{
        Thread other;
        MyThread(Thread other){
            this.other = other;
        }

        public void run(){
            try{
                if(other!=null){
                    other.join();
                }
            }catch (Exception e){}

            System.out.println(Thread.currentThread().getName() + " Finished");
        }
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(null);
        MyThread t2 = new MyThread(t1);
        t1.start();
        t2.start();
    }
}
