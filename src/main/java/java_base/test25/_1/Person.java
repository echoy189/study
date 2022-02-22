package java_base.test25._1;

import java.util.HashSet;

public class Person {

    int age = 18;

    public boolean equals(Object obj) {
        Person o = (Person) obj;
        return (this.age == o.age);
    }

}

class A {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        HashSet<Person> pSet = new HashSet<>();
        boolean a = pSet.add(p1);
        boolean b = pSet.add(p2);
        boolean c = pSet.add(p1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
