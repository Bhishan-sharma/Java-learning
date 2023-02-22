import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class GUIcaller
{
    public static void main(String[] args){
        xyz ob = new xyz();
    } 
}
class xyz extends JFrame implements ActionListener{
    static JButton b;
    static JProgressBar p;
    static Timer t;
    static int i;
    public xyz(){
        b = new JButton("add form");
        p = new JProgressBar(0,20);
        t = new Timer(250,this);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t.start();
            }
        });
        
        add(b);
        add(p);
        setLayout(new FlowLayout());
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if (i == 20){//after every 250 millisec this function runs and check i 
            new GUI();
            dispose();
        }
        i++;
        p.setValue(i);
    }
}