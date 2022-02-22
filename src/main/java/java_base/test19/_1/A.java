package java_base.test19._1;

public class A {
    int age = 18;

    void testA() {
        System.out.println("外部类");
    }
    void test(){
        A.B b = this.new B();
        b.testC();
    }

    class B {
        int age = 19;

        void testB() {
            System.out.println("成员内部类");
            testC();
            System.out.println(age);
            System.out.println(A.this.age);
            A.this.testA();

        }

        void testC() {
            System.out.println("c 内部类");

        }
    }
}
