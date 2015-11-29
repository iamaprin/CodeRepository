/**
 * /code1120/RandomAccessFileDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 9:57
 * description: RandomAccess类
 */
package code1120;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {

    public static void main(String[] args) throws IOException {
        File file = new File("." + File.separator + "test.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");

        String name = null;
        int age = 0;
        name = "zhangsan";
        age = 22;
        raf.writeBytes(name);
        raf.writeInt(age);
        name = "lisi";
        age = 24;
        raf.writeBytes(name);
        raf.writeInt(age);
        name = "wangwu";
        age = 26;
        raf.writeBytes(name);
        raf.writeInt(age);
        raf.close();
    }
}