package GuiHolder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelCode {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("image.png");
        Border border = BorderFactory.createLineBorder(Color.BLACK,3);

        JLabel l = new JLabel();
        l.setText("Hello");
        l.setIcon(image);
        l.setForeground(new Color(152,15,62));
        l.setHorizontalTextPosition(JLabel.CENTER);
        l.setVerticalTextPosition(JLabel.CENTER);
        l.setFont(new Font("MV Boli",Font.PLAIN,20));
        l.setBackground(Color.cyan);
        l.setOpaque(true);
        l.setBorder(border);
        l.setVerticalAlignment(JLabel.CENTER);
        l.setHorizontalAlignment(JLabel.CENTER);
        //l.setBounds(0,0,250,250);


        frame.add(l);
        frame.setIconImage(image.getImage());
        //frame.setLayout(null);
        //frame.setSize(500,500);
        frame.setTitle("vishu");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(152,15,62));
        frame.pack();
        frame.setVisible(true);
    }
}
