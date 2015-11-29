/**
 * /code1120/FileDemo3.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 9:50
 * description:
 */
package code1120;

import java.io.File;

public class FileDemo3 {

    public static void main(String[] args) {
        File file = new File("e:" + File.separator);
        String[] fileList = file.list();
        for (int i = 0; i < fileList.length; i++) {
            System.out.println(fileList[i]);
        }
    }
}