package lesson18;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EncrypyExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Encrypt/Decrypt Code");
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JOptionPane panel = new JOptionPane();
		panel.showInputDialog(null, "Pealse enter value between 1 and 10", "Input", JOptionPane.OK_CANCEL_OPTION);
		
		
		
		
		frame.setVisible(true);
	}
}
