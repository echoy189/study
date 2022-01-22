package eight.test27._5;

public class Entrance {
    public static void main(String[] args) {

        Thread myThread = new MyThread();
        myThread.start();


        for (int i = 0; i < 100; i++) {
            System.out.println("main thread " + i);
        }

    }


}


class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("thread " + i);
        }
    }
}
