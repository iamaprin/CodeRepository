/**
 * CodeRepository/code11_8/Increment.java
 * author: ZhuKuanxin
 * date: 2015/11/8
 * time: 20:44
 */
package code11_8;

public class Increment {

    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j = j++;
        }
        System.out.println(j);
    }
}
