/**
 * /code1123/IntBufferDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 20:31
 * description:
 */
package code1123;

import java.nio.IntBuffer;

public class IntBufferDemo {

    public static void main(String[] args) {
        IntBuffer buf = IntBuffer.allocate(10);
        System.out.println(buf.position() + ", "
                + buf.limit() + ", " + buf.capacity());
        int[] temp = {5, 7, 9};
        buf.put(3);
        buf.put(temp);
        System.out.println(buf.position() + ", "
                + buf.limit() + ", " + buf.capacity());

        buf.flip();
        System.out.println(buf.position() + ", "
                + buf.limit() + ", " + buf.capacity());
        while (buf.hasRemaining()) {
            int x = buf.get();
            System.out.println(x);
        }
    }
}