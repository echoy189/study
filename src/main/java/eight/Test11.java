package eight;

public class Test11 {

    public static void main(String[] args) {
        //第一题
        int[][] intArray = new int[5][];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = new int[i + 3];
        }
        for (int[] item : intArray) {
            for (int unit : item) {
                System.out.println(unit);
            }
        }

        //第二题
        int n = 0;
        while (n < intArray.length) {
            int i = 0;
            while (i < (intArray[i].length - 2)) {
                System.out.println(intArray[n][i]);
                i++;
            }
            n++;
        }




    }
}
