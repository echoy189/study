package java_base.test14;

public class Entrance {
    static int age = 18;
    public static void main(String[] args) {
        Entrance e1 = new Entrance();
        e1.age = 19;

        Entrance e2 = new Entrance();
        System.out.println(e2.age);
    }
}
