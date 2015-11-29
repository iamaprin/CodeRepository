/**
 * CodeRepository/code11_17/WrapperDemo2.java
 * author: ZhuKuanxin
 * date: 2015/11/17
 * time: 20:03
 * description:
 */
package code11_17;

public class WrapperDemo2 {

    public static void main(String[] args) {
        String str1 = "30";
        String str2 = "30.3";
        int x = Integer.parseInt(str1);
        float f = Float.parseFloat(str2);
        System.out.println(x + " " + f);
    }
}