package eight.test29._5;
//import net.sf.cglib.proxy.Enhancer;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;

public class Student extends Person{

    @Override
    void tes1() {
        System.out.println("student ");
    }

}

class Util implements MethodInterceptor{

}
