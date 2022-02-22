package java_base.test21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("java_base/test21/img.png");
        FileOutputStream fos = new FileOutputStream("java_base/test21/img_jiami.png");
        int len;
        byte[] arr = new byte[1024 * 8];
        while ((len = fis.read(arr)) != -1) {
            fos.write(arr, 0, len);
        }
        fis.close();
        fos.close();

    }
}
