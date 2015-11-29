/**
 * /code1119/ArraysDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/19
 * time: 21:22
 * description:
 */
package code1119;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] tmp = {3, 5, 7, 9, 1, 2, 6, 8};
        Arrays.sort(tmp);
        System.out.println(Arrays.toString(tmp));

        int point = Arrays.binarySearch(tmp, 3);
        System.out.println(point);

        Arrays.fill(tmp, 3);
        System.out.println(Arrays.toString(tmp));

        /*
            [1, 2, 3, 5, 6, 7, 8, 9]
            2
            [3, 3, 3, 3, 3, 3, 3, 3]
         */
    }
}