package eight.test22;

import java.io.*;

/**
 * 写一段文本文件(UTF-8)编码，利用java字符流读取并且输出成gbk编码的文件
 */
public class Test4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("eight/test22/aaa.txt"),"UTF-8"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("eight/test22/GBK.txt"),"GBK"));

        int ch ;
        while ((ch = br.read())!=-1){
            bw.write(ch);
        }
        br.close();
        bw.close();

    }
}
