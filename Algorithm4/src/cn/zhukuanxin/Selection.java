/**
 * /cn.zhukuanxin/Selection.java
 * author: ZhuKuanxin
 * date: 2015/11/25
 * time: 20:14
 * description: 选择排序， 选择最小的元素与第一个元素交换，接下来再剩下来的元素中
 *              找到最小的元素，与第二个元素交换，以此类推。
 *              N次交换， N(N-1)/2次比较
 */
package cn.zhukuanxin;

import java.util.Date;

public class Selection {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
                exch(a, i, min);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Date date1 = new Date(799999);
        Date date2 = new Date(1000000);
        Date date3 = new Date(899998);
        Date[] date = {date1, date2, date3};
        Selection.sort(date);
        show(date);
        //result:
        //Thu Jan 01 08:13:19 CST 1970
        //Thu Jan 01 08:14:59 CST 1970
        //Thu Jan 01 08:16:40 CST 1970
    }
}