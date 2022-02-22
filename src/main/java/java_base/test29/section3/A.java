package java_base.test29.section3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class A implements InvocationHandler {
    Object obj;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("java前");
        method.invoke(obj, args);
        System.out.println("java后");
        return null;
    }
}
