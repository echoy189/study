package eight.test29._2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Entrance {
    public static void main(String[] args) {
        A1 a1 = new A1();
        Util util = new Util();
        util.object = a1;

        A a = (A) Proxy.newProxyInstance(a1.getClass().getClassLoader(),
                a1.getClass().getInterfaces(), util);
        a.test1();
        a.test2();
        a.test3();
    }
}


class Util implements InvocationHandler {
    Object object;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("A1 " + method.getName() + " Before");
        method.invoke(object, args);
        System.out.println("A1 " + method.getName() + " After");
        return null;
    }

}