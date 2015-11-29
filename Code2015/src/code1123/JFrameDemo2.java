/**
 * /code1122/JFrameDemo2.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 19:57
 * description:
 */
package code1123;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo2 {

    public static void main(String[] args) {
        JFrame frame =new JFrame("Main");
        Dimension dimension = new Dimension();
        dimension.setSize(200, 300);
        frame.setSize(dimension);
        Point point = new Point(300, 200);
        frame.setLocation(point);
        frame.setVisible(true);
    }
}