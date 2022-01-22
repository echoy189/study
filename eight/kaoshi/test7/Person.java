package eight.kaoshi.test7;

public class Person {

    String name="xiaoming";

    void eat(){
        System.out.println("“Person is eating”");
    }

    void test1(){

        Student stu = new Student() {
            @Override
            void study() {
                System.out.println("");
            }
        };

        stu.study();

    }


    static void test2(){
        Student stu = new Student() {
            @Override
            void study() {
                System.out.println("test 2");
            }
        };
    }

    class A{
        int age = 17;
        void a(){
            System.out.println(age);
            System.out.println(name);
        }
//
//        static void b(){
//
//        }
    }


}
