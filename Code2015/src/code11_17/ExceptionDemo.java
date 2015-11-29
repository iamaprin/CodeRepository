/**
 * CodeRepository/code11_17/ExceptionDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/17
 * time: 20:08
 * description:
 */
package code11_17;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("****计算开始****");
        int i = 10;
        int j = 0;
        try {
            int tmp = i / j;
            System.out.println("两个数字相处结果: " + tmp);
            System.out.println("--------");
        } catch (ArithmeticException e) {
            System.out.println("出现异常了: " + e);
        }
        System.out.println("****计算结束****");
    }
}