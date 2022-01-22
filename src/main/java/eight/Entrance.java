package eight;

public class Entrance {
    public static void main(String[] args) {
        Person p = new Person();
        p.test();
        p.age = 19;
        p.map.put("k","v");
        p.s = new Student(19);
        p.hello();
        p.getAge();
        p.getName("ly");
    }
}
