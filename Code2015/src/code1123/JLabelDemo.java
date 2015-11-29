/**
 * /code1122/JLabelDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 20:00
 * description:
 */
package code1123;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        JLabel label = new JLabel();
        label.setText("label");
        frame.add(label);
        /*
        Container cont = frame.getContentPane();
        cont.add(label);
        */
        frame.setSize(new Dimension(300, 400));//test
        frame.setLocation(new Point(300, 300));//test

        frame.setVisible(true);
    }
}