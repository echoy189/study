package eight.test24._2;

import java.util.ArrayList;
import java.util.Iterator;

public class Person {

    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return (p.age == this.age && p.name == this.name);
    }

}


class A {
    public static void main(String[] args) {

        ArrayList<Person> l1 = new ArrayList<>();
        Person p1 = new Person(20, "ly");
        Person p2 = new Person(20, "ly");
        Person p3 = new Person(21, "ly");
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        Iterator<Person> iter = l1.iterator();
        while (iter.hasNext()) {
            Person p = iter.next();
            System.out.println(p.age);
            iter.remove();
        }
        System.out.println(l1.size());
    }
}