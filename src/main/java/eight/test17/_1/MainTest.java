package eight.test17._1;

public class MainTest {
    public static void main(String[] args) {

        Child child = new Child();
        EngTeacher engTeacher = new EngTeacher();
        MathTeacher mathTeacher  = new MathTeacher();
        Parent parent = new Parent();

        child.doWork();
        child.setTeacher(engTeacher,80);
        parent.piPing(engTeacher.score);


        child.doWork();
        child.setTeacher(mathTeacher,50);
        parent.piPing(mathTeacher.score);


    }
}
