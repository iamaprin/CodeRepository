/**
 * /code1120/SystemDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 10:45
 * description:
 */
package code1120;

import java.io.IOException;
import java.io.OutputStream;

public class SystemDemo {

    public static void main(String[] args) {
        OutputStream out = System.out;

        try {
            out.write("Hello World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}