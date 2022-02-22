package java_base.test19._1;

public class MainTest {
    public static void main(String[] args) {
        A a = new A();
        a.test();
        A.B b = a.new B();
        b.testB();

    }
}
