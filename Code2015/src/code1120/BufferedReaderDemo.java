/**
 * /code1120/BufferedReaderDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 16:04
 * description:
 */
package code1120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) {
        BufferedReader buf = null;
        buf = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        try {
            str = buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(str);
    }
}