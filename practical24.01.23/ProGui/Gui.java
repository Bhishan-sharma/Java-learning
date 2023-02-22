package ProGui;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;

public class Gui
{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        
        
        
        ImageIcon image = new ImageIcon("website.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(123,15,62));
        
        JLabel label = new JLabel();
        label.setText("Hello, Bro");
        label.setIcon(image);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Vishu");
        frame.setSize(420,420);
        frame.setResizable(false);
        frame.add(label);
        frame.setVisible(true);
    }
}