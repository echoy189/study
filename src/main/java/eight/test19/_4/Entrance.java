package eight.test19._4;

public class Entrance {
    int a = 18;

    public static void main(String[] args) {

    }

    void test(){
        Person p = new Person() {
            void test() {
                System.out.println("2->");
                System.out.println(b);
                System.out.println(a);
            }
        };
    }
}
