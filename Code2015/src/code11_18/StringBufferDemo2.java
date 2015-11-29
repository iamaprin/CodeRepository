/**
 * CodeRepository/code11_18/StringBufferDemo2.java
 * author: ZhuKuanxin
 * date: 2015/11/18
 * time: 20:13
 * description:
 */
package code11_18;

public class StringBufferDemo2 {

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello ");
        fun(buf);
        System.out.println(buf);

        String str = "AAAA";
        fun2(str);
        System.out.println(str);
    }

    public static void fun(StringBuffer s) {
        s.append("MLDN ").append("LiXingHua");
    }

    public static void fun2(String s) {
        s = s + "Just";
    }
}