class Rthread implements Runnable{
    public void run(){
        System.out.println("this is runnable thread implementaion");
    }
}
class Mthread extends Thread{
    public void run(){
        System.out.println("this is thread class extention");
    }
}

class Dthread extends Thread {
    public Dthread(String name){
        super(name);
    }
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Check if its DaemonThread: " + Thread.currentThread().isDaemon());
    }
}


public class thread {
   public static void main(String[] args){
       Thread t1 = new Thread(new Rthread());
       Mthread f1 = new Mthread();
       Dthread d1 = new Dthread("d1");
       d1.setDaemon(true);
       d1.start();

       f1.setPriority(4);
       t1.setPriority(3);

       f1.start();
       t1.start();
   }

}
