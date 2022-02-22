package java_base;
//10.1
public class Test10 {
    String name;
    int age = 10;
    int height = 180;
    int weight = 190;

    Test10() {
        System.out.println("0个参数");
    }

    Test10(int a) {
        this(1, 2);
        System.out.println("1个参数");
        this.age = a;
    }

    Test10(int a, int b) {
        System.out.println("2个参数");
        this.age = a;
        this.height = b;
    }

    Test10(int a, int b, int c) {
        System.out.println("3个参数");
        this.age = a;
        this.height = b;
        this.weight = c;
    }

    public static void main(String[] args) {
//        10.2
        Test10 test = new Test10(1);
        System.out.println(test.age);
        System.out.println(test.height);
        System.out.println(test.weight);
        System.out.println(test.name.charAt(0));
        //10.3  person 三个构造方法，包括无参构造方法 一个构造方法，
        //10.4 null无法转换成字符类型，报空指针异常
    }


}
