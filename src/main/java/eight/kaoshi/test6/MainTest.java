package eight.kaoshi.test6;

public class MainTest {

    public static void main(String[] args) {

//        A a=new C();
//        C c=(C)a;
//        c.age=-1;
//        System.out.println(c.age);
//        System.out.println(a.age);

        A a = new A();

        a.test();
        a.specialA();

        B  b = (B) a;
        b.test();
        b.specialA();
        b.specialB();

        }

        void test(A a){


        }
    }

