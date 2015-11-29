/**
 * CodeRepository/code11_17/ThrowDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/17
 * time: 20:15
 * description:
 */
package code11_17;

public class ThrowDemo1 {
    public static void main(String[] args) {
        try {
            throw new Exception("自己抛出的异常");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}