package eight.test17._2._1;

public class Entrance {

    public static void main(String[] args) {

        Student[] st1=new Student[3];
        Student[] st2=new Student[3];
        st2[0]=st1[0];
        st2=st1;
        st1[0]=new Student();
        Student st3=st2[0];
        st2[0]=null;
        Person p=new Person();
        p.setStudent(st3);
        p.test();

    }
}
