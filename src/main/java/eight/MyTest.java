package eight;

public class MyTest {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            String s = "";
            for (int j = 0; j < 6; j++) {
                if(i==1 && j ==4) break;
                if(i==3 && j ==3) break;
                if(i==6 && j ==4) break;
                s = s + String.valueOf(j);
            }
            System.out.println(i+s);
        }
    }
}
