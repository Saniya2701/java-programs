import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class factdemo1 extends JFrame implements ActionListener{

    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;

    public factdemo1() {

        setTitle("Factorial");
        l1=new JLabel("Enter the Number");
        l2=new JLabel("Factorial");
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("click");

        setSize(400,400);
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
public void actionPerformed(ActionEvent e){
    int num=Integer.parseInt(t1.getText());
    if(e.getSource()==b1)
	{
	int fact=1,i;
	for(i=num;i>=1;i--)
	fact=fact*i;
	
	t2.setText(String.valueOf(fact));
	}
 }
 public static  void main(String args[]){
    factdemo1 f = new factdemo1();
 }

}

