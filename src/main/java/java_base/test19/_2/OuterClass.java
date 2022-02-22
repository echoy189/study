package java_base.test19._2;

public class OuterClass {
    static int a = 0;

    static void outTest() {
        System.out.println("外部类方法");
    }

    static class InnerClass {
        int b = 1;

        void test() {
            b = a;
            outTest();
        }

    }
}
