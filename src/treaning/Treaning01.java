package treaning;

import javax.swing.JFrame;

public class Treaning01 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Text Editor");
		
		f.setSize(800,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Treaning02 textEditor = new Treaning02();
		f.add(textEditor);
		
		f.setVisible(true);
	}
}
