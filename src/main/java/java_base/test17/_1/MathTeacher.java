package java_base.test17._1;

public class MathTeacher implements Teacher {

    double score;

    @Override
    public void gaiZuoYe(double score) {
        System.out.println("数学老师批改作业");
        this.score = score;
    }
}
