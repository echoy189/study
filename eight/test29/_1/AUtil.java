package eight.test29._1;

public class AUtil implements A{
    A a;
    @Override
    public void test() {
        System.out.println("静态代理");
        a.test();
    }
}
