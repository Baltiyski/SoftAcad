package treaning;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Treaning02 extends JPanel{
	private JButton openFile;
	private JButton save;
	private JButton exit;
	private JLabel loaldText;
	private JTextField textFromOpenFile;
	private JTextArea openFileText;
	
	
	public Treaning02() {
		setLayout(null);
		openFile = new JButton("Open File");
		save = new JButton("Save");
		exit = new JButton("Exit");
		loaldText = new JLabel("Loaded Files:");
		textFromOpenFile = new JTextField("Name of Open File");
		openFileText = new JTextArea();
		
		JScrollPane scroll = new JScrollPane(openFileText);

		openFile.setBounds(50, 10, 90, 30);
		save.setBounds(145, 10, 90, 30);
		exit.setBounds(240, 10, 90, 30);
		loaldText.setBounds(335, 3, 150, 50);
		textFromOpenFile.setBounds(415, 15, 300, 25);
		openFileText.setBounds(0, 50, 795, 425);
		
		add(openFile);
		add(save);
		add(exit);
		add(loaldText);
		add(textFromOpenFile);
		add(openFileText);
		add(scroll);
	}
	
}
