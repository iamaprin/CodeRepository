/**
 * CodeRepository/code11_6/LongDivision.java
 * author: ZhuKuanxin
 * date: 2015/11/6
 * time: 19:21
 */
package code11_6;

public class LongDivision2 {

    public static void main(String[] args){
        final long MICROS_PER_DAY = 24L*60*60*1000*1000;
        final long MILLIS_PER_DAY = 24L*60*60*1000;

        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);//1000
    }
}
