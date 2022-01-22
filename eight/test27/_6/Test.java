package eight.test27._6;

public class Test {

    void test(){
        for (int i =0;i<50;i++){
            System.out.println(i);
        }
    }
}

class MyThread extends Thread{
    private Test t;
    void setTest(Test t){
        this.t = t;
    }

    public void run(){
        t.test();
    }


}

class Entrance{
    public static void main(String[] args) {

        Test t1 = new Test();
//        Test t2 = new Test();

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.setTest(t1);
        myThread2.setTest(t1);

        myThread1.start();
        myThread2.start();
    }
}