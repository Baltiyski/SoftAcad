package lesson17;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Treanning {
	public static void main(String[] args) {
		String heightString;
		String wdtjString;
		String sideString;
		
		wdtjString = JOptionPane.showInputDialog(null, "Enter widht", "Enter widht hear", JOptionPane.OK_OPTION);
		int width = Integer.parseInt(wdtjString);
		
		heightString = JOptionPane.showInputDialog(null, "Enter height", "Enter hright hear", JOptionPane.OK_OPTION);
		int height = Integer.parseInt(heightString);
		
		sideString = JOptionPane.showInputDialog(null, "Enter triangle side", JOptionPane.OK_OPTION);
		int side = Integer.parseInt(sideString);
		
		
		JFrame f = new JFrame();
		f.setSize(width,height);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TrianglePanel p = new TrianglePanel();
		f.add(p);
		
		
		f.setVisible(true);
	}

}
