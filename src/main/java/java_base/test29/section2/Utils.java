package java_base.test29.section2;



public class Utils implements A {
    A a;

    @Override
    public void test() {
        System.out.println("JAVA");
        a.test();
    }
}



//utils 叫做代理类Utils的一个代理对象
//c其实叫做被代理对象
class Entrance {
    public static void main(String[] args) {
        C c = new C();

        Utils utils = new Utils();
        utils.a = c;

        X x = new X();
        x.specialX(utils);

    }
}