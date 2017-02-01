package lesson19;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Layout tests");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new BorderPanelAdvanced();
		
		frame.add(panel);
		frame.setVisible(true);
	}
}
