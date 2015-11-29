/**
 * /code151120/Exercise.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 18:50
 * description: templete
 */
package code151120;

public class Exercise211 {

    public static void main(String[] args) {
        System.out.println(fun(20)); //2432902008176640000
    }

    public static long fun(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n*fun(n-1);
        }
    }
}