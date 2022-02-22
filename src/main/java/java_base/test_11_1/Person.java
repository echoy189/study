package java_base.test_11_1;

public class Person {
    int age = 18;

    Person(int age) {
        this.age = age;
    }

    Person() {

    }

    public static void main(String[] args) {
        Person[] a = new Person[3];
        Person[] b = new Person[3];
        b[0] = new Person(19);
        b[0] = a[0];
        a[0] = new Person();
        System.out.println(a[0].age);
        System.out.println(b[0].age);
    }
    //1.报错

}
