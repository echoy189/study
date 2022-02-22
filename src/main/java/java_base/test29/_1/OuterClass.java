package java_base.test29._1;

public class OuterClass {
    A a=new A1();
    class InnerClass{
        void testInner(){
            a.test();
        }
    }
}
