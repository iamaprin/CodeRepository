/**
 * /code1125/FileChannelDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/25
 * time: 14:35
 * description:
 */
package code1125;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {

    public static void main(String[] args) throws IOException {
        String[] info = {"A", "b", "C", "d"};
        File file = new File(".\\Code2015\\src\\code1125\\out.txt");
        FileOutputStream output = null;
        output = new FileOutputStream(file);
        FileChannel fileChannel = null;
        fileChannel = output.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(1024);
        for (int i = 0; i < info.length; i++) {
            buf.put(info[i].getBytes());
        }
        buf.flip();
        fileChannel.write(buf);
        fileChannel.close();
        output.close();
    }
}