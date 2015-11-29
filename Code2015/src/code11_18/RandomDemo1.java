/**
 * /code11_18/RandomDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/18
 * time: 22:15
 * description:
 */
package code11_18;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(100) + "\t");
        }
    }
}