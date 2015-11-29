/**
 * /cn.zhukuanxin/Insertion.java
 * author: ZhuKuanxin
 * date: 2015/11/25
 * time: 20:14
 * description:
 */
package cn.zhukuanxin;

import java.util.Date;

public class Insertion {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]) ; j--) {
                exch(a, j, j-1);
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
        Insertion.sort(date);
        show(date);
        /*
        result:
            Thu Jan 01 08:13:19 CST 1970
            Thu Jan 01 08:14:59 CST 1970
            Thu Jan 01 08:16:40 CST 1970
         */
    }
}