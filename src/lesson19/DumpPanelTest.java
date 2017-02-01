package lesson19;

import javax.swing.JFrame;

public class DumpPanelTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DumpPanel p = new DumpPanel();
		f.add(p);
		
		f.setVisible(true);
	}

}
