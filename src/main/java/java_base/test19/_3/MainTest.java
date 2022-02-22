package java_base.test19._3;

public class MainTest {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        InnerClass in = new InnerClass();
        in.test(out);
    }
}
