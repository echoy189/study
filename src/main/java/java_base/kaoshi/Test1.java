package java_base.kaoshi;

public class Test1 {

    public static void main(String[] args) {

        Person[][] perArray = new Person[4][];
        for (int i = 0; i < 4; i++) {
            if (i < 3) {
                perArray[i] = new Person[i+4];
                for (int j = 0;j<i+4;j++){
                    perArray[i][j] = new Person();
                }
            } else {
                perArray[i]= new Person[i+2];
                perArray[i][0]= new Person();
                for (int j = 1;j<i+2;j++){
                    perArray[i][j] =  perArray[i][0] ;
                }
            }
        }
        for (Person[] item : perArray) {
            for (Person p : item) {
                System.out.println(p.age);
            }
        }


    }
}
