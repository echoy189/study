package eight.test28._1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainTest {

    public static void main(String[] args) throws Exception {
        //获取类
        Class p1 = A.class;
        Class p2 = Class.forName("eight.test28._1.A");
        A aInstance = new A(12);
        Class p3 = aInstance.getClass();


        //通过默认构造方法
        Constructor con = p1.getDeclaredConstructor();
        con.setAccessible(true);
        A a1 = (A) con.newInstance();


        //通过指定构造方法生成对象
        Class[] classes = {int.class};
        Constructor con2 = p1.getDeclaredConstructor(classes);
        A a2 = (A) con2.newInstance(19);


        //通过反射打印3中任意一个对象的三个成员变量的值
        Field fieldAge = p1.getDeclaredField("age");
        fieldAge.setAccessible(true);
        System.out.println(fieldAge.get(a1));

        Field fieldName = p1.getDeclaredField("name");
        Field fieldWeight = p1.getDeclaredField("weight");

        System.out.println(fieldAge.get(a1));
        System.out.println(fieldName.get(a1));
        System.out.println(fieldWeight.get(a1));

        //通过反射调用3中任意一个对象的三个成员方法

        Method methodTest1 = p1.getDeclaredMethod("test1");
        methodTest1.setAccessible(true);
        methodTest1.invoke(a1);

        Method methodTest2 = p1.getDeclaredMethod("test2");
        methodTest2.invoke(a1);

        Method methodTest3 = p1.getDeclaredMethod("test3");
        methodTest3.invoke(a1);

        //6 通过反射更改3中任意一个对象的三个成员变量的值
        fieldAge.set(a1, 22);
        System.out.println(fieldAge.get(a1));
        fieldName.set(a1,"xiaoming");
        fieldWeight.set(a1,130);
        System.out.println(a1.weight);
        System.out.println(a1.name);


        //调用静态方法
        Method methodStatic = p1.getDeclaredMethod("test4");

        methodStatic.invoke(null);
        methodStatic.invoke(a1);
    }
}
