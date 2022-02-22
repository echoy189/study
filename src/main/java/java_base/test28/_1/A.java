package java_base.test28._1;


//反射
public class A {
    private int age = 18;
    int weight = 120;
    public String name = "ly";

    private A() {

    }

    public A(int age) {
        this.age = age;
    }

    private void test1() {
        System.out.println(" test 1 : private");
    }

    void test2() {
        System.out.println("test 2 : ");
    }

    public void test3() {
        System.out.println("test 3 public");
    }


    public static void test4() {
        System.out.println("static test4");
    }
}


