import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Add a=new Add();
    }
    
}

class Add extends JFrame implements ActionListener{
    JTextField t;
    JTextField t1;
    JButton b;
    JLabel l;
    public Add(){
        t=new JTextField(20);
        t1=new JTextField(20);
        
        b=new JButton("OK");
        l=new JLabel("Result");
        add(t);
        add(t1);
        add(b);
        add(l);
        b.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(t.getText());
        int num2=Integer.parseInt(t1.getText());
        int value=num1+num2;
        l.setText(value + " ");
    }
} 
