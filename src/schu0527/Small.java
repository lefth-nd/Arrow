package schu0527;

import javax.swing.*;
import java.awt.*;

public class Small extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.blue);
        g2.drawLine(320, 50, 320, 100);

    }
}
