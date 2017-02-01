package lesson19;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BoxPanel extends JPanel{
    public BoxPanel(){
        BoxLayout l = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(l);
        
        add(new JButton("Button 1"));
        add(new JButton("This is button 2"));
        add(new JButton("Button 3"));
        
    }
}
