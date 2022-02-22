package java_base.test19._3;

public class InnerClass {
    int age = 18;
    void test(OuterClass out) {
        System.out.println(age);
        out.test();
    }
}
