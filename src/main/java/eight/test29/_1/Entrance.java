package eight.test29._1;

public class Entrance {
    public static void main(String[] args){
        OuterClass.InnerClass innerClass=new OuterClass().new InnerClass();
        //TODO

        //        innerClass.testInner();
        A1 a1 = new A1();
        AUtil aUtil = new AUtil();
        aUtil.a = a1;
        aUtil.test();


    }
}
