/**
 * /code151120/Exercise.java
 * author: ZhuKuanxin
 * date: 2015/11/20
 * time: 18:50
 * description: n根棍子，从中取出三根组成周长最大的三角形
 *              输入最大的周长，不能输出0
 */
package code151120;

import java.util.Arrays;

public class Exercise161 {

    public static void main(String[] args) {
        /*
        int n = 5;
        int[] a = {3, 2, 4, 5, 10};//sum = 12
        */
        
        int n = 4;
        int[] a = {4, 5, 10, 20};//sum = 0

        Arrays.sort(a);
        int len = a.length;
        int min;
        int sum = 0;
        boolean flag = false;
        for (int i = len - 1; i >= 0 && !flag; i--) {
            for (int j = i - 1; j >= 0 && !flag; j--) {
                min = a[i] - a[j];
                for (int k = j -1 ; k >= 0 && !flag; k--) {
                    if (a[k] > min) {
                        sum = a[i] + a[j] + a[k];
                        flag = true;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}