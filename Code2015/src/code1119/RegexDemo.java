/**
 * /code1119/RegexDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/19
 * time: 22:22
 * description:
 */
package code1119;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        String str = "1234567890";

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            System.out.println("true!");
        } else {
            System.out.println("false!");
        }
    }
}