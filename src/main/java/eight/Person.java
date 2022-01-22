package eight;

import java.util.HashMap;
import java.util.Map;

public class Person {
    int age = 18;
    Student s;
    Map<String, String> map;

    Person() {
        s = new Student();
    }

    String getName(String name) {
        int num = 1;
        System.out.println(name);
        System.out.println(this.age);
        System.out.println(num);
        return name;
    }

    void getAge() {
        s.hello();
    }

    void hello() {
        getAge();
    }

    void test() {
        map = new HashMap<>();
    }
}
