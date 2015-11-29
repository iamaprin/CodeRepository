/**
 * CodeRepository/code11_8/BigDelight.java
 * author: ZhuKuanxin
 * date: 2015/11/8
 * time: 20:41
 */
package code11_8;

public class BigDelight {

    public static void main(String[] args) {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x96){
                System.out.println("Joy!");
            }
        }
    }
}
