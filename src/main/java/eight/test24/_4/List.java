package eight.test24._4;

import java.util.ArrayList;

class A{

    public static void main(String[] args) {

        ArrayList l = new ArrayList();

        l.add("1");
        l.add(11);
        l.add(new Person());

        for (int i =0;i<l.size();i++){
            System.out.println(l.toArray()[i]);
        }
    }
}

class Person{

}