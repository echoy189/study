package java_base.test17._1;

public class Child {
    Teacher teacher;

    void setTeacher(Teacher teacher,double score){
        this.teacher = teacher;
        teacher.gaiZuoYe(score);
    }

    void doWork(){
        System.out.println("写完作业");
    }
}
