package eight.test27._10;

public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("thread1 " + i);
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("thread2 " + i);
        }
    }
}

class Entrance {
    public static void main(String[] args) throws Exception {

        Thread1 t1 = new Thread1();

        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        for (int i = 0; i < 50; i++) {
            System.out.println("main " + i);
        }


    }
}