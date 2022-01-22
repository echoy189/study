package eight.kaoshi.test8;

public class Child {
    Teacher teacher;

    void setTeacher(Teacher teacher){
        this.teacher = teacher;
        teacher.gaiZuoYe();
    }

    void doWork(){
        System.out.println("写完作业");
    }

}
