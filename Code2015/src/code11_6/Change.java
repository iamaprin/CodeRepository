/**
 * CodeRepository/Code11_6/Change.java
 * author: ZhuKuanxin
 * date: 2015/11/6
 * time: 19:10
 */
package code11_6;

import java.math.BigDecimal;

public class Change {
    public static void main(String[] args){
        System.out.println(2.00-1.10);//0.8999999999999999

        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
        //0.90
    }
}
