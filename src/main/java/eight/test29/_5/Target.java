package eight.test29._5;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Target {


    void execute() {
        System.out.println("student ");
    }

}

class MyMethodInterceptor implements MethodInterceptor {


    public Object intercept(Object object, Method method, Object[] args,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println(">>>MethodInterceptor start...");
        Object result = methodProxy.invokeSuper(object, args);
        System.out.println(">>>MethodInterceptor ending...");
        return null;
    }


}

class TestCglibProxy {

    public static void main(String[] args) {

        Target target = new Target();
        TestCglibProxy test = new TestCglibProxy();
        Target proxyTarget = (Target) test.createProxy(Target.class);
        proxyTarget.execute();


    }

    public Object createProxy(Class targetClass) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }
}