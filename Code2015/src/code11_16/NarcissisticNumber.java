/**
 * CodeRepository/code11_16/NarcissisticNumber.java
 * author: ZhuKuanxin
 * date: 2015/11/16
 * time: 22:45
 * description:
 */
package code11_16;

public class NarcissisticNumber {
    public static void main(String[] args) {
        method1();
        /*
        float num = -3.5f;
        System.out.println(Math.floor(num));
        System.out.println(Math.round(num));
        System.out.println(Math.ceil(num));
        */
    }

    public static void method1() {

        int i1;
        int i2;
        int i3;
        for (int i = 100; i <= 999; i++) {
            i1 = i / 100;
            i2 = i % 100 / 10;
            i3 = i % 10;
            //System.out.println(Math.pow(i1, 3) + Math.pow(i2, 3) + Math.pow(i3, 3));
            int sum = (int)(Math.pow(i1, 3) + Math.pow(i2, 3) + Math.pow(i3, 3));
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}