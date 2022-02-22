package java_base.test27._7;

public class Thread1 extends Thread {
    Object obj;

    void setObj(Object obj) {

        this.obj = obj;
    }

    public void run(){
        synchronized (obj){
            for (int i =0 ;i<20;i++){
                System.out.println("thread1 "+ i);
            }
        }
    }


}

class Thread2 extends Thread {
    Object obj;

    void setObj(Object obj) {
        this.obj = obj;
    }

    public void run(){
        for (int i =0 ;i<20;i++){
            System.out.println("thread2 out synchronized "+ i);
        }

        synchronized (obj){
            for (int i =0 ;i<20;i++){
                System.out.println("thread2 "+ i);
            }
        }
    }
}

class Entrance{
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.setObj(obj1);
        thread2.setObj(obj1);
        thread1.start();
        thread2.start();

    }
}