package java_base.test29.section1;

public class Utils {
    A a;

    void abc() {
        System.out.println("JAVA");
        a.test();
    }
}

class Entrance {
    public static void main(String[] args) {
        B b = new B();
        Utils utils = new Utils();
        utils.a = b;
        utils.abc();

    }
}