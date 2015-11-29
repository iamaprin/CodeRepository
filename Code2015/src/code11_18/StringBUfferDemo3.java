/**
 * CodeRepository/code11_18/StringBUfferDemo3.java
 * author: ZhuKuanxin
 * date: 2015/11/18
 * time: 20:19
 * description:
 */
package code11_18;

public class StringBUfferDemo3 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("World!!");
        buf.insert(0, "Hello ");
        //1
        //String str = buf.reverse().toString();
        //System.out.println(str);    //!!dlroW olleH
        //2
        //System.out.println(buf);    //!!dlroW olleH


        StringBuffer buf2 = buf.reverse();
        System.out.println(buf2);   //!!dlroW olleH
        System.out.println(buf);    //!!dlroW olleH
    }
}