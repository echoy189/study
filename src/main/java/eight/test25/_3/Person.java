package eight.test25._3;

import java.util.TreeSet;

public class Person implements Comparable {
    int age;

    Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
//        Person p = (Person) o;
        if(this.age % 2 == 0) return -1;
        else return 1;
    }

}

class A {
    public static void main(String[] args) {

        Person p1 = new Person(10);
        Person p2 = new Person(11);
        Person p3 = new Person(12);
        Person p4 = new Person(13);
        Person p5 = new Person(14);

        TreeSet<Person> pTreeSet = new TreeSet<>();

        pTreeSet.add(p1);
        pTreeSet.add(p2);
        pTreeSet.add(p3);
        pTreeSet.add(p4);
        pTreeSet.add(p5);

        for (Person p : pTreeSet) {
            System.out.println(p.age);
        }
    }

}
