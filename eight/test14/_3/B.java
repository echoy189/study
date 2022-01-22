package eight.test14._3;

public class B extends A{
    A a1 = new A();

    {
        System.out.println("普通代码块b");
    }
    A a2 = new A();

    B(){
        System.out.println("B的构造函数");
    }

}
