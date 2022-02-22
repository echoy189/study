package java_base.test23._1;

public class MainTest {
    public static void main(String[] args) {

        A<Person> a = new A<>();

        Person p1 =new Person();
        p1.age = 19;
        Person p2 = new Person();
        a.setValue(p1,p2);

        System.out.println( a.getA().age);
        System.out.println( a.getB().age);

        Person c = a.testA(new Person());


    }
}
