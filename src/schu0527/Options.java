package schu0527;

import javax.swing.*;
import java.awt.*;

public class Options {

    JSlider slide = new JSlider();
    public void option(){
        JFrame frame_options = new JFrame();
        JLabel title = new JLabel();

        title.setText("Options");
        slide.setSize(200, 20);

        frame_options.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_options.setSize(800, 600);

        frame_options.add(title);
        frame_options.add(slide);
        frame_options.setLayout(new FlowLayout());

        frame_options.setVisible(true);

    }

    public int squareSize(){
        return slide.getValue();
    }

}
