/**
 * CodeRepository/code11_18/DateDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/18
 * time: 21:56
 * description:
 */
package code11_18;

import java.text.DateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        DateFormat df1 = null;
        DateFormat df2 = null;
        df1 = DateFormat.getDateInstance();
        df2 = DateFormat.getDateTimeInstance();

        System.out.println(df1.format(new Date()));
        System.out.println(df2.format(new Date()));
    }
}