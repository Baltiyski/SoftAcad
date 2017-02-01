package lesson18;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HappyBirthdayPanelTest {
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("Birthday application");	
		mainFrame.setSize(600, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BirthdayPanel panel = new BirthdayPanel();
		mainFrame.add(panel);
		
		
		
		
		
		
		
		mainFrame.setVisible(true);
	}
}
