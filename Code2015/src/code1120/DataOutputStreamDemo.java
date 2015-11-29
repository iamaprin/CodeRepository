/**
 * /code1120/DataOutputStreamDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 16:14
 * description:
 */
package code1120;

import java.io.*;

public class DataOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = null;
        //File file = new File("." + File.separator + "test.txt");
        File file = new File(".\\Code2015\\src\\code1120\\test.txt");

        dos = new DataOutputStream(new FileOutputStream(file));
        dos.writeUTF("zhukuanxin速度\n");
        dos.writeInt(3);

        /*
        String[] names = {"衬衣", "手套", "围巾"};
        float[] prices = {98.3f, 30.3f, 50.5f};
        int[] nums = {3, 2, 1};
        for (int i = 0; i < names.length; i++) {
            dos.writeChars(names[i]);
            dos.writeChar('\t');
            dos.writeFloat(prices[i]);
            dos.writeChar('\t');
            dos.writeInt(nums[i]);
            dos.writeChar('\n');
        }
        */
        dos.flush();
        dos.close();

    }
}