package lesson20;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculatorDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(270, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel calPanel = new CalculatorPanel();
        frame.add(calPanel);
        
        frame.setVisible(true);
    }
}
