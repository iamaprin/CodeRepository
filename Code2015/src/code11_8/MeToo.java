/**
 * CodeRepository/code11_8/MeToo.java
 * author: ZhuKuanxin
 * date: 2015/11/8
 * time: 20:30
 */
package code11_8;

import java.io.File;

public class MeToo {

    public static void main(String[] args) {
        System.out.println(
                MeToo.class.getName().replace("\\.", File.separator) +
                        ".class"
        );
    }
}
