/**
 * CodeRepository/code11_6/LastLaugh.java
 * author: ZhuKuanxin
 * date: 2015/11/6
 * time: 19:49
 */
package code11_6;

public class LastLaugh {

    public static void main(String[] args) {
        System.out.println("H" + "a");
        System.out.println('H' + 'a');

        StringBuffer sb = new StringBuffer();
        sb.append('H');
        sb.append('a');
        System.out.println(sb);

        System.out.println("2+2= " + 2 + 2);
        System.out.printf("%c%c", 'H', 'a');
    }
}
