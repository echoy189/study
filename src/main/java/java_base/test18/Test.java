package java_base.test18;

public class Test {
    public int age = 18;
    public void test(){
        System.out.println("构造方法");
    }
    protected void hello() {
        System.out.println("hello");
    }
}

class test2 {
    public static void main(String[] args) {
        Test a = new Test();
        System.out.println(a.age);
    }
}


