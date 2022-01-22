package eight.test17._1;

public class EngTeacher implements Teacher {

    double score;

    @Override
    public void gaiZuoYe(double score) {
        System.out.println("英语老师批改作业");
        this.score = score;
    }

}
