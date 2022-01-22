package eight.kaoshi.test4;

public class B extends A{

    static {
        System.out.println("我是B的静态代码块");
    }


    B(){
        System.out.println("我是B的构造函数");

    }
}
