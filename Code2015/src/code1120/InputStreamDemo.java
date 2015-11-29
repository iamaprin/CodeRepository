/**
 * /code1120/InputStreamDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 10:26
 * description:
 */
package code1120;

import java.io.*;

public class InputStreamDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("." + File.separator + "test.txt");
        InputStream in = null;
        in = new FileInputStream(file);

        byte[] bytes = new byte[(int)file.length()];
        in.read(bytes);

        in.close();
        System.out.println(new String(bytes));
    }
}