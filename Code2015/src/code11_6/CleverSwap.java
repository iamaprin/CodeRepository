/**
 * CodeRepository/code11_6/CleverSwap.java
 * author: ZhuKuanxin
 * date: 2015/11/6
 * time: 19:40
 */
package code11_6;

public class CleverSwap {

    public static void main(String[] args) {
        int x = 1984;
        int y = 2001;
        x ^= y ^= x ^= y;
        System.out.println("x: "+x+"  y: "+y );
    }
}
