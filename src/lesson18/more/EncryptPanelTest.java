package lesson18.more;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EncryptPanelTest {

	public static void main(String[] args) {
		String numberStr = JOptionPane.showInputDialog("Enter value between 1 and 10");
		int number = Integer.parseInt(numberStr);
		
		JFrame f = new JFrame("Encrypt/Decrypt application");
		f.setSize(1100, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EncryptPanel p = new EncryptPanel();
		f.add(p);
		f.setVisible(true);
	}

}
