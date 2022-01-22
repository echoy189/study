package eight.test29._3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AHandler implements InvocationHandler {
    Object object;

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(" before ");
        Object obj = method.invoke(object, objects);
        return obj;
    }
}
