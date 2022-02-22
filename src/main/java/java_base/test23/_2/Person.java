package java_base.test23._2;

public class Person<T extends Person> {

    T t;

    void setT(T t) {

    }

    void test1(Person<? extends Person> o) {

    }

    void test2(Person<? super Person> a) {

    }

    public static void main(String[] args) {
        Person<Person> p = new Person<>();
        p.setT(new Person());
    }
}
