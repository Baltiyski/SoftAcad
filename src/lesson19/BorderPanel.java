package lesson19;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderPanel extends JPanel{
    public BorderPanel() {
        //create components
        JPanel north  = new JPanel();
        north.add(new JButton("North"));
        JButton east   = new JButton("East");
        JButton south  = new JButton("South");
        JButton center = new JButton("Center");

        //set layout
        BorderLayout l = new BorderLayout(10, 10); 
        setLayout(l);
        

        //add the components to the panel
        add(north , BorderLayout.NORTH);
        add(east  , BorderLayout.EAST);
        add(south , BorderLayout.SOUTH);
        add(center, BorderLayout.CENTER);
    }
}
