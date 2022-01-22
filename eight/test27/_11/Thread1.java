package eight.test27._11;

public class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("thread 1 " + i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        Thread1 thread1 = new Thread1();
        thread1.start();
        try {
            thread1.join();
        } catch (Exception e) {

        }

        for (int i = 0; i <100; i++) {
            System.out.println("thread 2 " + i);
        }


    }
}


class Entrance {
    public static void main(String[] args) throws Exception {

        Thread2 thread2 = new Thread2();
        thread2.start();
        thread2.join();
        for (int i = 0; i < 100; i++) {
            System.out.println("main " + i);
        }

    }
}