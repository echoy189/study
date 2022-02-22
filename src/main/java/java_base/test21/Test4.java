package java_base.test21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Test4 {
    private static final String key0 = "FECOI()*&<MNCXZPKL";
    private static final Charset charset = StandardCharsets.UTF_8;
    private static byte[] keyBytes = "a".getBytes(charset);

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("java_base/test21/img_jia_mi1.png");
        FileOutputStream fos = new FileOutputStream("java_base/test21/img_jia_mi2.png");

        int len;
        byte[] arr = new byte[1024 * 8];

        while ((len = fis.read(arr)) != -1) {

            arr = encode(arr);//加密
            arr = decode(arr); //解密
            fos.write(arr, 0, len);
        }

        fis.close();

    }

    public static byte[] encode(byte[] arr) {
        for (int i = 0, size = arr.length; i < size; i++) {
            for (byte keyBytes0 : keyBytes) {
                arr[i] = (byte) (arr[i] ^ keyBytes0);
            }
        }
        return arr;
    }

    public static byte[] decode(byte[] e) {

        byte[] dee = e;
        for (int i = 0, size = e.length; i < size; i++) {
            for (byte keyBytes0 : keyBytes) {
                e[i] = (byte) (dee[i] ^ keyBytes0);
            }
        }
        return e;
    }
}
