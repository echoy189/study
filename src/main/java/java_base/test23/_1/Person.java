package java_base.test23._1;

public class Person {

    int age = 18;
    void test1() {

    }
}

class Student extends Person {
    void test2() {

    }
}

class A<T extends Person> {
    T a;
    T b;

    T testA(T a){
        return a;
    }

    void setValue(T a, T b) {

        this.a = a;
        this.b = b;
    }

    T getA(){
        return a;
    }
    T getB(){
        return b;
    }
}