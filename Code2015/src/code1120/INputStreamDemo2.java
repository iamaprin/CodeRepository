/**
 * /code1120/INputStreamDemo2.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 10:33
 * description:
 */
package code1120;

import java.io.*;

public class INputStreamDemo2 {

    public static void main(String[] args) throws IOException {
        File file = new File("." + File.separator + "test.txt");
        InputStream in = null;
        in = new FileInputStream(file);

        int tmp = 0;
        while ((tmp = in.read()) != -1) {
            System.out.print((char) tmp); //Hello World!//æ±å­ 乱码
        }

        in.close();
    }
}