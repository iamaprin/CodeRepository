/**
 * /code151120/Exercise.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 18:50
 * description: Ants(POJ1852)
 */
package code151120;

public class Exercise162 {

    public static void main(String[] args) {
        int l = 10;
        int n = 3;
        int[] x = {2, 6, 7};

        //最短的时间
        int minTime = 0;
        for (int i = 0; i < x.length; i++) {
            int tmp = 0;
            tmp = x[i] < l-x[i] ? x[i] : l-x[i];
            if (tmp > minTime) {
                minTime = tmp;
            }
        }
        System.out.println(minTime);

        //最长的时间
        int maxTime = 0;
        for (int i = 0; i < x.length; i++) {
            int tmp = 0;
            tmp = x[i] > l-x[i] ? x[i] : l-x[i];
            if (tmp > maxTime) {
                maxTime = tmp;
            }
        }
        System.out.println(maxTime);
    }
}