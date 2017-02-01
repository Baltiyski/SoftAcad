package projeckt;

import javax.swing.JFrame;

public class TestTextEditor {
	public static void main(String[] args) {
		JFrame f = new JFrame("Text Editor");
		
		f.setSize(800,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		TextEditor textEditor = new TextEditor();
		f.add(textEditor);
		
		f.setVisible(true);
	}
}
