package java_base.test27._2;

public class MyThread extends Thread{

    public void run(){
        for (int i =0;i<20;i++){
            System.out.println("MyThread "+ i);
        }
    }

}

class Entrance{

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
//        myThread.start();
        myThread.run();
        for(int i=0;i<20;i++){
            System.out.println("main thread " + i);
        }
    }
}