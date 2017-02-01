package lesson17;

import javax.swing.JFrame;

public class DrawingTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DrawingPanel p = new DrawingPanel();
		frame.add(p);
		frame.setVisible(true);
	}

}
