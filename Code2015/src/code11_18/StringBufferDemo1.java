/**
 * CodeRepository/code11_18/StringBufferDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/18
 * time: 20:08
 * description:
 */
package code11_18;

public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello ");
        buf.append("World").append("!!!");
        buf.append("\n");
        buf.append("数字 = ").append(1).append("\n");
        buf.append("字符 = ").append('C').append("\n");
        buf.append("布尔 = ").append(true);
        System.out.println(buf);
    }
}