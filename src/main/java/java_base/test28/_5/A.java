package java_base.test28._5;

import java.lang.reflect.Field;

public class A {

    int age = 19;

    class InnerClass {
        int b = 1;

        void test(String fieldName) throws Exception {
            Field field = A.this.getClass().getDeclaredField(fieldName);
            System.out.println(field.get(A.this));


        }
    }
}


class MainTest {
    public static void main(String[] args) throws Exception {

        A a = new A();
        A.InnerClass inner = a.new InnerClass();
        inner.test("age");


    }
}