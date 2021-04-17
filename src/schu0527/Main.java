package schu0527;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class Main {

    public static void main(String[] args) {


        JFrame frame = new JFrame();
        Arrow a = new Arrow();
        Mouse m = new Mouse();


        a.setBackground(Color.black);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.addMouseListener(m);


        frame.add(a);






    }

}
