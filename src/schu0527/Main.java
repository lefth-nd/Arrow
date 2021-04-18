package schu0527;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.security.Key;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {


        JFrame frame = new JFrame();
        Arrow a = new Arrow();
        File audioFile = new File("src/schu0527/audio.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        AudioFormat format = audioStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        Clip audioClip = (Clip) AudioSystem.getLine(info);
        audioClip.open(audioStream);
        audioClip.start();


        a.setBackground(Color.black);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(a.draw){
                    a.put = true;
                    a.placed = false;
                }
                if(!a.draw){
                    a.put = false;
                    a.placed = true;
                }

                a.size = true;
                //reset position
                a.n = 0;
                a.x1 = a.a;
                a.y1 = a.b;


            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if(key == KeyEvent.VK_ENTER){
                    if(a.draw){
                        a.draw = false;
                    }else if(!a.draw){
                        a.draw = true;
                    }
                }
                if(key == KeyEvent.VK_SPACE){
                    a.n = a.n + (a.n - (a.n-1));


                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(a);

        frame.setVisible(true);





    }

}
