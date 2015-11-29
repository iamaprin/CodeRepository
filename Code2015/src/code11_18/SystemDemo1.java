/**
 * CodeRepository/code11_18/SystemDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/18
 * time: 21:48
 * description:
 */
package code11_18;

public class SystemDemo1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int sum = 0;
        for (int i = 0; i < 30000; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime -startTime);
    }
}