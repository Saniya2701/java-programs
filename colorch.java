import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class colorch extends JFrame implements ActionListener {

    JButton b1,b2,b3;
   
    public colorch(){

    setTitle("color");
    b1 = new JButton("Red");
    b2 = new JButton("Blue");
    b3 = new JButton("Green");

    setLayout(new FlowLayout());

    add(b1);
    add(b2);
    add(b3);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    setSize(300,300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
  public void actionPerformed(ActionEvent e){
    if (e.getSource()==b1){
     getContentPane().setBackground(Color.RED);
  }
  else if(e.getSource()==b2){
    getContentPane().setBackground(Color.BLUE);
  }
  else{
    getContentPane().setBackground(Color.GREEN);
  }

}
public static void main(String args[]){
    colorch c =new colorch();
}
}

