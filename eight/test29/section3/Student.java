package eight.test29.section3;

import java.lang.reflect.Proxy;

public class Student implements Person {

    @Override
    public void test() {

        System.out.println("student ");
    }
}


class Entrance {
    public static void main(String[] args) {
        Student student = new Student();
        A a = new A();
        a.obj = student;

        Person person = (Person) Proxy.newProxyInstance(student.getClass().getClassLoader(),
                student.getClass().getInterfaces(), a);

        person.test();

    }
}