/**
 * CodeRepository/code11_8/InTheLoop.java
 * author: ZhuKuanxin
 * date: 2015/11/8
 * time: 20:45
 */
package code11_8;

public class InTheLoop {

    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;

    public static void main(String[] args) {
        int count = 0;
        for (int i = START; i < END; i++) {
            count++;
        }
        System.out.println(count);
    }
}
