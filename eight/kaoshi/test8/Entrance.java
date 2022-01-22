package eight.kaoshi.test8;

public class Entrance {
    public static void main(String[] args) {

        Child child = new Child();


        Parent parentA = new Parent() {
            @Override
            public void piPing(double score) {

            }
        };

        Parent parentB = new Parent() {
            @Override
            public void piPing(double score) {
            }
        };

        Teacher teaA = new Teacher() {

            @Override
            public void gaiZuoYe() {
                System.out.println("A老师批改作业");
            }

            @Override
            public void tongZhi(Parent p) {
                p = parentA;

            }
        };

        Teacher teaB = new Teacher() {

            @Override
            public void gaiZuoYe() {
                System.out.println("B老师批改作业");
            }

            @Override
            public void tongZhi(Parent p) {
                p = parentB;
            }
        };

        child.doWork();
        child.setTeacher(teaA);

        parentA.piPing(20);


        child.doWork();
        child.setTeacher(teaB);
        parentB.piPing(80);


    }
}
