package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    static boolean  user , comp;
    static JButton[][] arr;
    static JLabel label;
    Main(){
        user = true;
        comp = false;
        label = new JLabel();
        label.setBounds(0,0,435,102);
        label.setBackground(new Color(152,15,62));
        label.setLayout(new FlowLayout());
        label.setText("Your Turn👍👍");
        label.setOpaque(true);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Comic sans",Font.BOLD,26));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel panel = new JPanel();
        panel.setBounds(0,102,435,410);
        panel.setBackground(new Color(152,15,62));
        panel.setLayout(new GridLayout(3,3));
        arr = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = new JButton();
                panel.add(arr[i][j]);
                arr[i][j].addActionListener(this);
                arr[i][j].setFont(new Font("Comic sans",Font.BOLD,25));
            }
        }

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setTitle("TicTacToe");
        frame.setSize(450,550);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        JButton button = (JButton)ae.getSource();
            if(user == true){
                button.setText("X");
                user = false;
                comp = true;
                button.setBackground(Color.yellow);
                button.setForeground(Color.WHITE);
                button.setEnabled(false);
                label.setText("computer's Turn");
            }else if(comp == true){
                button.setText("O");
                user = true;
                comp = false;
                button.setBackground(Color.red);
                button.setForeground(Color.WHITE);
                button.setEnabled(false);
                label.setText("Your Turn");
            }
    }
    public static boolean checkWon(){
        for (int i = 0; i < 3; i++) {
            if (checkRowWin(i) || checkColumnWin(i) || checkDiagonalWin()) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkRowWin(int row) {
        return arr[row][0].getText().equals(arr[row][1].getText()) &&
                arr[row][1].getText().equals(arr[row][2].getText()) && (arr[row][2].getText().equals("X") || arr[row][2].getText().equals("O"));
    }
    public static boolean checkColumnWin(int column) {
        return arr[0][column].getText().equals(arr[1][column].getText()) &&
                arr[1][column].getText().equals(arr[2][column].getText()) && (arr[2][column].getText().equals("X") || arr[2][column].getText().equals("O"));
    }
    public static boolean checkDiagonalWin() {
        return arr[0][0].getText().equals(arr[1][1].getText()) &&
                arr[1][1].getText().equals(arr[2][2].getText()) && (arr[2][2].getText().equals("X") || arr[2][2].getText().equals("O")) ||
                arr[0][2].getText().equals(arr[1][1].getText()) &&
                        arr[1][1].getText().equals(arr[2][0].getText()) && (arr[2][0].getText().equals("X") || arr[2][0].getText().equals("O"));
    }

    public static void main(String[] args) {
        Main ob = new Main();
    }
}