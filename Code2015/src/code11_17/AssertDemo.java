/**
 * CodeRepository/code11_17/AssertDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/17
 * time: 20:18
 * description:
 */
package code11_17;

public class AssertDemo {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        assert x.length ==0 : "数组长度不为0";
    }
}