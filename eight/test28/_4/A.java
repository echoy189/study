package eight.test28._4;

import java.lang.reflect.Method;

public class A {
    private void test() {
        System.out.println("I am A");
    }
}

class B extends A {

}

class MainTest {
    public static void main(String[] args) throws Exception {

        B b = new B();
        Method test = Class.forName("eight.test28._4.A").getDeclaredMethod("test");
        test.setAccessible(true);
        test.invoke(b);
    }
}