/**
 * CodeRepository/code11_8/Rhymes2.java
 * author: ZhuKuanxin
 * date: 2015/11/8
 * time: 20:39
 */
package code11_8;

import java.util.Random;

public class Rhymes2 {

    private static Random rnd = new Random();

    public static void main(String[] args) {
        System.out.println("PGM".charAt(rnd.nextInt(3)) + "ain");
    }
}
