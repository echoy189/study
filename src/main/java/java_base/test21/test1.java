package java_base.test21;

import java.io.FileOutputStream;
import java.io.IOException;

public class test1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("java_base/test21/1.txt");

        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.close();
    }

}
