package eight.kaoshi.test5;

public class B {
    int age = 1;
    A a;
    B(A a){
        this.a = a;
    }
    void testB(){
            System.out.println(age);
            System.out.println(a.age);
    }

}
