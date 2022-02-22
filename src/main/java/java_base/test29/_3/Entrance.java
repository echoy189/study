package java_base.test29._3;

import java.lang.reflect.Proxy;

public class Entrance {
    public static void main(String[] args){

        A1 a1 = new A1();
        AHandler aHandler = new AHandler();
        aHandler.object = a1;
        A a = (A)Proxy.newProxyInstance(a1.getClass().getClassLoader(),a1.getClass().getInterfaces(),aHandler);
        System.out.println(a.test());
    }
}
