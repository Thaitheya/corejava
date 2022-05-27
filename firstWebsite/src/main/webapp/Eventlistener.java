import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.swing.JFrame;
import java.swing.JTextField;
import java.swing.JPasswordField;
import java.swing.JOptionPane;

public class EventListener extends JFrame {
  
     private JTextField item1;
     private JTextField item2;
     private JTextField item3;
     private JPasswordField passwordField;


    public EventListener(){
        super("Event Listener");
        setLayout(new FlowLayout());
        item1 = new JTextField(10);
        add(item1);
        item2 = new JTextField("Enter text here");
        add(item2);
        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);
        add(item3);
        passwordField = new JPasswordField("mypass");
        add(passwordField);
    }
}