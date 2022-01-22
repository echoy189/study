package eight.kaoshi.test4;

public class C extends B{
    B b1=new B();
    {
        System.out.println("我是C的普通代码块");
    }
    B b2=new B();

    C(){
        System.out.println("我是C的构造函数");

    }
}
