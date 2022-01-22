package eight.kaoshi.test2;

public class MainTest {

    public static void main(String[] args) {

        Person[] p1 = new Person[3];
        Person[] p2 = new Person[3];
        p2 = p1;
        p1[0] = new Person();
        p2[0] = null;
        Person p3 = p2[0];
        p3.eat();
        p3.getStudent().study();
    }
}
