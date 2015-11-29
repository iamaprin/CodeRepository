/**
 * CodeRepository/code11_8/Me.java
 * author: ZhuKuanxin
 * date: 2015/11/8
 * time: 20:26
 */
package code11_8;

public class Me {

    public static void main(String[] args) {
        System.out.println(
                //Me.class.getName().replaceAll(".", "/")+".class"
                Me.class.getName().replaceAll("\\.", "/")+".class"
        );
    }
}
