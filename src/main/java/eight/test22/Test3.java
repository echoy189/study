package eight.test22;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * 写一段FileReader读取UTF-8文本文件的代码，并打印，结果符合原文件么
 */
public class Test3 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("eight/test22/aaa.txt");

        int ch;
        while((ch = fr.read()) != -1) {
            System.out.println((char)ch);
        }
        fr.close();

    }
}
