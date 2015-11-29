/**
 * /code1120/FileDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 9:35
 * description:
 */
package code1120;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

    public static void main(String[] args) {
       File file = new File(".\\test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}