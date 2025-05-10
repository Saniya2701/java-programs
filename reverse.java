import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class reverse extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1;

    public reverse() {

        setTitle("Reverse Number");
        l1 = new JLabel("Enter the Number");
        l2 = new JLabel("Reverse");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Click");

        setSize(400, 400);
        setLayout(new FlowLayout());

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);

        b1.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t1.getText());
        if (e.getSource() == b1) {
            int rev = 0;
            while (num != 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }
            t2.setText(String.valueOf(rev));
        }
    }

    public static void main(String args[]) {
        reverse r = new reverse();
    }
}



