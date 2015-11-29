/**
 * CodeRepository/code11_8/Rhymes.java
 * author: ZhuKuanxin
 * date: 2015/11/8
 * time: 20:35
 */
package code11_8;

import java.util.Random;

public class Rhymes {

    private static Random rnd = new Random();
    public static void main(String[] args) {
        StringBuffer word = null;
        switch (rnd.nextInt(2)){
            case 1 : word = new StringBuffer('P');
            case 2 : word = new StringBuffer('G');
            default : word = new StringBuffer('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }
}
