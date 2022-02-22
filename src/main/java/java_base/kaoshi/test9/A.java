package java_base.kaoshi.test9;

public class A {
    public static void main(String[] args) {


    }

    int[][] pro(double[][] towDou, int[] intArr) {
        int[][] twoArr = new int[intArr.length / 5][5];

        for (int j = 0; j < intArr.length / 5; j++) {

            for (int i = j * 5; i < intArr.length; i++) {
                int lie = 0;
                if (i % 5 == j) {
                    twoArr[j][lie] = intArr[i];
                }
                lie++;
            }

        }
        return twoArr;
    }
}
