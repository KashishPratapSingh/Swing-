import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SubTwoNumber {
    public static void main(String[] args) {
        Sub s=new Sub();
        
    }
}
class Sub extends JFrame implements ActionListener{
    JTextField a;
    JTextField a1;
    JLabel j;
    Button b;
    public Sub(){
        a=new JTextField(20);
        a1=new JTextField(20);
        setLayout(new FlowLayout());
        j=new JLabel("Result");
        b=new Button("Ok");
        add(a);
        add(a1);
        add(b);
        add(j);
        b.addActionListener(this);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(a.getText());
        int num2=Integer.parseInt(a1.getText());
        int value=num1-num2;
        j.setText(value+" ");
    }
}
