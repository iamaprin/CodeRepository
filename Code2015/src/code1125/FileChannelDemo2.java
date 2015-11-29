/**
 * /code1125/FileChannelDemo2.java
 * author: ZhuKuanxin
 * date: 2015/11/25
 * time: 14:41
 * description:
 */
package code1125;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo2 {

    public static void main(String[] args) throws IOException {

        File file1 = new File(".\\Code2015\\src\\code1125\\note.txt");
        File file2 = new File(".\\Code2015\\src\\code1125\\outnote.txt");
        FileInputStream input = null;
        FileOutputStream output = null;
        input = new FileInputStream(file1);
        output = new FileOutputStream(file2);

        FileChannel fileChannel1 = null;
        FileChannel fileChannel2 = null;
        fileChannel1 = input.getChannel();
        fileChannel2 = output.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(1024);
        int temp = 0;
        while ((temp = fileChannel1.read(buf)) != -1) {
            buf.flip();
            fileChannel2.write(buf);
            buf.clear();
        }
        fileChannel1.close();
        fileChannel2.close();
        input.close();
        output.close();

    }
}