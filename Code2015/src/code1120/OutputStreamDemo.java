/**
 * /code1120/OutputStreamDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 10:19
 * description:
 */
package code1120;

import java.io.*;

public class OutputStreamDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("." + File.separator + "test.txt");
        OutputStream out = null;
        out = new FileOutputStream(file);
        String str = "Hello World!";
        byte[] bytes = str.getBytes();
        out.write(bytes);

        out.close();
    }
}