/**
 * /code1122/GetAllFonts.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 20:05
 * description:
 */
package code1123;

import java.awt.*;

public class GetAllFonts {

    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontName = ge.getAvailableFontFamilyNames();
        for (String name : fontName) {
            System.out.println(name);
        }
    }
}