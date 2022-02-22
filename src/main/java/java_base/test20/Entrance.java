package java_base.test20;

import java.io.IOException;

public class Entrance {
    static void test(int age) throws IOException {
        if (age < 0) {
            throw new IOException();
        } else System.out.println("hello");
    }

    public static void main(String[] args) {
        try {
            test(10);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally ");
        }

    }


}
