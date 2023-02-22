package GuiHolder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonCode implements ActionListener {
    static JButton button;
    JButtonCode(){
        ImageIcon icon = new ImageIcon("C:\\Users\\hp\\Desktop\\java\\image.png",null);
        button = new JButton();
        button.setBounds(200,100,150,50);
        button.setText("CLICK ME");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans",Font.BOLD,20));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.darkGray);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(515,535);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        JButtonCode ob = new JButtonCode();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("yeah");
//            button.setEnabled(false);
        }
    }
}
