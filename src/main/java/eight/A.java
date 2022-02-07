package eight;

class A{
    void test1(B b){
        System.out.println("1");
    }

    B test2(B b){
        return b;
    }

    void test3(B b){
        b=new B();
        b.age=11;
    }

    public static void main(String[] args) {
//        A a=new A();
//        a.test2(new B()).age=100;

        String  aa = null;
        System.out.println(aa.trim());
    }
}