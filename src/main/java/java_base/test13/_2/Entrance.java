package java_base.test13._2;

public class Entrance {
    public static void main(String[] args) {

//        E e = new E();
//        A a = e;
//
//        B b = (B)a;
        /*
         *  A-->B
         *  A-->C 编译不报错，运行报类型转换 错误
         *
         */

//        B b = new B();
//
//        C zz = (C)b;
//
//        System.out.println(zz.height);


        D d = new D();

        d.exam(d);

    }

    static void test(A a) {


    }
}
