/**
 * /cn.zhukuanxin/BinarySearch.java
 * author: ZhuKuanxin
 * date: 2015/11/25
 * time: 19:49
 * description: 二分查找
 */
package cn.zhukuanxin;

import java.util.Arrays;

public class BinarySearch {

    public static int rank(int key, int[] a) {
        //数组a必须是有序的
        int low = 0;
        int high = a.length - 1;            //二分查找法, O(log2n)
        int mid = 0;                        //
        while (low <= high) {               //
            mid = low + (high - low) / 2;   //
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 23, 1, 34, 65};
        Arrays.sort(a);
        System.out.println(a);
        System.out.println(rank(23, a));
    }
}