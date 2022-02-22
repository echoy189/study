package java_base.test23._3;

public class A {

    <E extends B> E test(E e1, E e2) {
        return e1;
    }
}

class B {

    void testB(){

    }

}

class C extends B {

}

class D {

}

class MainTest {
    public static void main(String[] args) {


        A a = new A();

        B b1 = new B();

        C c = new C();

//        B b2 = a.test(b1,a );

    }
}