/**
 * /code1119/BigIntegerDemo01.java
 * author: ZhuKuanxin
 * date: 2015/11/19
 * time: 21:09
 * description:
 */
package code1119;

import java.math.BigInteger;

public class BigIntegerDemo01 {

    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("123456789");
        BigInteger bi2 = new BigInteger("987654321");

        System.out.println(bi2.add(bi1));
        System.out.println(bi2.subtract(bi1));
        System.out.println(bi2.multiply(bi1));
        System.out.println(bi2.divide(bi1));
        BigInteger[] result = bi2.divideAndRemainder(bi1);
        System.out.println(result[0] + " + " + result[1]);
     }
}