/**
 * /code1119/NumberFormatDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/19
 * time: 21:05
 * description:
 */
package code1119;

import java.text.NumberFormat;

public class NumberFormatDemo1 {

    public static void main(String[] args) {
        NumberFormat nf = null;
        nf = NumberFormat.getInstance();
        System.out.println(nf.format(100000));
        System.out.println(nf.format(1000.234));
    }
}