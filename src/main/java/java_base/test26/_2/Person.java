package java_base.test26._2;

import java.util.HashMap;

public class Person {
    int age;

    Person(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        Person p = (Person) o;
        return this.age == p.age;


    }


    public int hashCode() {
        return 0;
    }

}


class A {
    public static void main(String[] args) {

        HashMap<Person, String> perMap = new HashMap<>();

        Person p1 = new Person(12);
        perMap.put(p1, "1");
        perMap.put(new Person(13), "2");
        perMap.put(new Person(14), "3");
        perMap.put(new Person(15), "4");
        System.out.println(perMap.get(p1));

        System.out.println(perMap.get(new Person(13)));

    }
}