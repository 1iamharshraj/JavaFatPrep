
class Test{
    synchronized void func() throws InterruptedException {
        System.out.println("This is Synchornized method");
        wait();
        for(int i = 0 ; i <5 ;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("ends methods");
    }
    void func1(){
        synchronized (this){
            System.out.println("this is Synchornized block");
            for(int i = 0 ; i <5 ;i++) {
                System.out.println(i);
            }
            System.out.println("ends block");
            notify();
        }
    }
}

public class Synchornization_IPC {
    public static void main(String[] args){
        final Test obj = new Test();

        Thread a = new Thread(){
            public void run(){
                try {
                    obj.func();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread b = new Thread(){
            public void run(){obj.func1();}
        };
        a.start();
        b.start();

    }
}
