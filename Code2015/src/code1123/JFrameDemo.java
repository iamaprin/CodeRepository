/**
 * /code1122/JFrameDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 19:53
 * description:
 */
package code1123;

import javax.swing.*;
import java.awt.Color;

public class JFrameDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        frame.setSize(200, 300);
        frame.setBackground(Color.WHITE);
        frame.setLocation(300, 300);
        frame.setVisible(true);
    }
}