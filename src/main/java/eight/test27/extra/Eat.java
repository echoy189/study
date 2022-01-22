package eight.test27.extra;

public class Eat extends Thread {
    Test test;

    void setTest(Test test) {
        this.test = test;
    }

    @Override
    public void run() {
        test.eat();
    }
}


class JianFei extends Thread {

    Test test;

    void setTest(Test test) {
        this.test = test;
    }

    @Override
    public void run() {
        try {
            test.jianFei();
        } catch (Exception e) {

        }

    }
}

class Test {
    private Object obj;
    int weight = 140;

    Test(Object obj) {
        this.obj = obj;
    }

    void eat() {
        synchronized (obj) {
            while (weight < 135) {
                weight++;
            }
            System.out.println("eat done " + weight);
            obj.notifyAll();
        }
    }

    void jianFei() throws Exception {
        synchronized (obj) {
            weight--;
            while (weight < 135) {
                System.out.println("weight to small "+weight);
                obj.wait();
                for (int i = 0; i < 20; i++) {
                    System.out.println("weight not small, fuhuo " + i);
                }
            }
        }

    }
}

class Entrance {
    public static void main(String[] args) throws Exception{

        Object obj = new Object();
        Test test = new Test(obj);

        JianFei[] jianFeis = new JianFei[10];
        for (int i = 0; i < 10; i++) {
            jianFeis[i] = new JianFei();
            jianFeis[i].setTest(test);
        }

        for (int i = 0; i < 10; i++) {
            jianFeis[i].start();
        }

        Thread.sleep(10);

        Eat eat = new Eat();
        eat.setTest(test);
        eat.start();

    }
}


