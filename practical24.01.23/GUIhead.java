import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JProgressBar;

public class GUIhead{
    public static void main(String[] args){
        GUI ob = new GUI();
    }
}
class GUI extends JFrame implements ActionListener{
    static JTextField t1,t2;
    static JLabel l,l1;
    static JButton b1 , b2;
    static JRadioButton r1,r2;
    static JCheckBox c1,c2;
    public GUI(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                int x = e.getX();
                int y = e.getY();
                System.out.println(x + " " + y);
            }
        });
        
        setLayout(new GridLayout(5,0));//FlowLayout GridLayout null
        l = new JLabel("Hello vishu");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("add");
        b2 = new JButton("minus");
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");
        c1 = new JCheckBox("Singing");
        c2 = new JCheckBox("Dancing");
        l1 = new JLabel("welcome vishu");
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        add(l);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(l1);
        
        c1.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                System.out.println("Dancing is not done");
            }
        });
        /*2ActionListener al = new ActionListener(){//Anonymous class object
            public void actionPerformed(ActionEvent ae){
                int a  = Integer.parseInt(t1.getText());
                int b  = Integer.parseInt(t2.getText());
                int sum = a + b;
                l1.setText("welcome vishu : " + sum);
                return;
            }
        };*/
        
        b1.addActionListener(this /*2al*/ /*3ae ->{
            int a  = Integer.parseInt(t1.getText());
            int b  = Integer.parseInt(t2.getText());
            int sum = a + b;
            l1.setText("welcome vishu : " + sum);
            return;
        }*/);
        b2.addActionListener(this);
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int a  = Integer.parseInt(t1.getText());
        int b  = Integer.parseInt(t2.getText());
        int sum = 0;
        String gender = "";
        String work = "";
        if (ae.getSource() == b1)
            sum = a + b;
        else
            sum = a - b;
        
        if(r1.isSelected()){
            gender = " male ";
        }else if(r2.isSelected()){
            gender = " female ";
        }
        
        if(c1.isSelected()){
            work += " Singing ";
        }
        if (c2.isSelected()){
            work += " Dancing ";
        }
        
        l1.setText("welcome vishu : " + sum + gender + work);
        return;
    }
}