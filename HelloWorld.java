import javax.swing.*;
import java.awt.*;
public class HelloWorld{
    public static void main(String[] args) {
        Abc obj=new Abc();
        // JLabel l=new JLabel("Hello Shashank");
        // obj.add(l);
        // obj.setVisible(true);
        // obj.setSize(400,400);
    }
}
class Abc extends JFrame {
    public Abc(){
        setLayout(new FlowLayout());
        JLabel l= new JLabel("Hello World");
        JLabel l1=new JLabel("Welcome, Shashank");
        add(l);
        add(l1);
        setVisible(true);
        setSize(400,400); // We can write our these in methods in constructor as well as in main method also using object.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
