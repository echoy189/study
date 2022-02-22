package java_base;


public class Test9 {
    int age = 18;

    int getN() {
        return 2;
    }

    int getAge(int num) {
        return num + this.age + this.getN();
    }

    public static void main(String[] args) {
        //9.2
        Test9 t1 = new Test9();
        System.out.println(t1.getAge(3));

        //9.3 方法的参数 与 成员变量的名字重叠，在方法内部想改变成员变量的值，需要使用this
    }

}
