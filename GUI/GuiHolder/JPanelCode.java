package GuiHolder;

import javax.swing.*;
import java.awt.*;

public class JPanelCode {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("image.png");
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,20,20); For this set setlayout null

        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        panel.setBounds(0,0,250,250);
        panel.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.MAGENTA);
        panel1.setBounds(250,0,250,250);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.black);
        panel2.setBounds(0,250,250,250);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.orange);
        panel3.setBounds(250,250,250,250);

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(515,535);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.add(label);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }
}
