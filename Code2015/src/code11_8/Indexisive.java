/**
 * CodeRepository/code11_8/Indexisive.java
 * author: ZhuKuanxin
 * date: 2015/11/8
 * time: 20:58
 */
package code11_8;

public class Indexisive {

    public static void main(String[] args) {
        System.out.println(decision());
    }

    static boolean decision(){
        try {
            return true;
        } finally {
            return false;
        }//false
    }
}
