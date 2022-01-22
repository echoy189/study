package eight.test27._8;

public class Thread1 extends Thread {
    Object obj;

    void setObject(Object obj) {
        this.obj = obj;
    }

    public void run() {
        synchronized (obj) {


            for (int i = 0; i < 50; i++) {
                System.out.println("thread1 " + i);
            }
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            for (int i = 50; i < 100; i++) {
                System.out.println("thread1 " + i);
            }

        }
    }
}


class Thread2 extends Thread {
    Object obj;

    void setObject(Object obj) {
        this.obj = obj;
    }

    public void run() {
        synchronized (obj) {
            for (int i = 0; i < 50; i++) {
                System.out.println("thread2 " + i);
            }
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("sleep " + i);
        }

    }
}


class Entrance {
    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        Object obj = new Object();
        thread1.setObject(obj);
        thread2.setObject(obj);

        thread1.start();
        thread2.start();


    }
}