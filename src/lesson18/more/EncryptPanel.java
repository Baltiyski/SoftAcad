package lesson18.more;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EncryptPanel extends JPanel{
	private JComboBox mode;
	private JLabel label;
	private JTextField textToEncrypt;
	private JButton encrypt;
	private JButton clear;
	private JTextArea area;
	private static final String[] MODES = {"Encrypt", "Decrypt"};
	
	
	public EncryptPanel(){
		mode = new JComboBox(MODES);
		label = new JLabel("Text to enrypt");
		textToEncrypt = new JTextField(10);
		encrypt = new JButton("Encrypt");
		clear = new JButton("Clear");
		area = new JTextArea(10, 10);
		JScrollPane scroll = new JScrollPane(area);
		
		add(mode);
		add(label);
		add(textToEncrypt);
		add(encrypt);
		add(clear);
		add(scroll);
		
		clear.addActionListener(new ClearButtonListener());
	}
	
	private class ClearButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			area.setText("");
		}
	}
	//ZA DOMA6NO DA SI DOVYRHITE ZADA4ATA.
	//za pokazvaneto na informaciq pri poso4vaneto na buton, 6te vi trqbva MouseListener
	//6te vi trqbva i da si igraete s e.getSource()
	// pri smqna na combobox-a se polu4ava ActionEvent
	
}
