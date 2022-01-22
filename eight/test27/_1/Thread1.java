package eight.test27._1;

public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("thread1" + i);
        }
    }
}




class B {
    public static void main(String[] args) {

        //继承的方式
        Thread1 thread1 = new Thread1();
        thread1.start();
        //实现MyRunnable接口
        MyRunnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main thread" + i);
        }




    }
}



class MyRunnable implements Runnable {

    @Override
    public void run() {
      for (int i =0;i<100;i++){
          System.out.println("MyRunnable "+i);
      }
    }
}