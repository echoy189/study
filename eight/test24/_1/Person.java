package eight.test24._1;

import java.util.ArrayList;

public class Person {

    int age = 18;

}


class A {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();


        Person p1 = new Person();

        persons.add(p1);
        persons.add(p1);

        persons.contains(p1);
        for(Person p:persons) {
            System.out.println(p);
        }

    }
}
