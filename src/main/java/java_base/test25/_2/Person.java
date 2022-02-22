package java_base.test25._2;

import java.util.HashSet;

public class Person {

    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean equals(Object o) {
        Person p = (Person) o;
        return p.age == this.age;

    }


    public int hashCode() {
        return 1;
    }

}


class A {

    public static void main(String[] args) {

        Person p1 = new Person(18, "ly");
        Person p2 = new Person(19, "ly");
        Person p3 = new Person(18, "ly1");
        HashSet<Person> pSet = new HashSet<>();

        boolean b1 = pSet.add(p1);

        boolean b2 = pSet.add(p2);
        boolean b3 = pSet.add(p3);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);




    }
}