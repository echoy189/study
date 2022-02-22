package java_base.kaoshi.test4;

public class A {
    static {
        System.out.println("“我是A的静态代码块”");

    }
    A() {
        System.out.println("我是A的构造函数");
    }
}
