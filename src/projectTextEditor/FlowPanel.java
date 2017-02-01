package projectTextEditor;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FlowPanel extends JPanel {

	JFrame mainFrame;
	JTextField fileArea;
	JLabel labelFileArea;
	JButton openFile;
	JButton saveFile;
	JButton newFile;
	JButton exitFile;
	JFileChooser chooseFile;
	JTextArea textArea;

	FlowPanel(JFrame mainFrame, JTextArea textArea) {
		this.mainFrame = mainFrame;
		this.textArea = textArea;

		setLayout(new FlowLayout());
		newFile = new JButton("New");
		openFile = new JButton("Open");
		saveFile = new JButton("Save");
		exitFile = new JButton("Exit");
		fileArea = new JTextField("   Path to the file .... ");
		labelFileArea = new JLabel("Opened File: ");
		chooseFile = new JFileChooser();

		newFile.setToolTipText("Click to open a new file.");
		openFile.setToolTipText("Click to open a file.");
		saveFile.setToolTipText("Click to save the file.");
		exitFile.setToolTipText("Click to exit Editor.");
		fileArea.setToolTipText("Full path to the file.");
		fileArea.setEnabled(true);
		fileArea.setEditable(false);
		fileArea.setPreferredSize(new Dimension(300, 20));

		add(newFile);
		add(openFile);
		add(labelFileArea);
		add(fileArea);
		add(saveFile);
		add(exitFile);

		ButtonListeners buttonListener = new ButtonListeners();
		newFile.addActionListener(buttonListener);
		openFile.addActionListener(buttonListener);
		saveFile.addActionListener(buttonListener);
		exitFile.addActionListener(buttonListener);

	}

	/*--------------*/

	private class ButtonListeners implements ActionListener {

		JButton buttonSource;
		File selectedFile;
		Scanner scanner;
		StringBuilder textToRead;
		PrintStream fileToWrite;

		@Override
		public void actionPerformed(ActionEvent e) {

			buttonSource = (JButton) e.getSource();
			if (buttonSource == openFile) {
				chooseFile.showOpenDialog(openFile);
				selectedFile = chooseFile.getSelectedFile();
				try {
					scanner = new Scanner(selectedFile);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (selectedFile != null) {
					fileArea.setText(selectedFile.getAbsolutePath());
					textToRead = new StringBuilder();
					while (scanner.hasNextLine()) {
						textToRead.append(scanner.nextLine());
						textToRead.append("\n");
					}
					textArea.setText(textToRead.toString());
				} else {
					JOptionPane.showMessageDialog(openFile,
							"You Must Choose File First!");
					return;
				}

			} else if (buttonSource == newFile) {
				int choice = JOptionPane.showConfirmDialog(newFile,
						"All changes will be lost untill the file is saved!!!",
						"New File", 0);
				System.out
						.println("This is the choice of the buttons of the New File Button "
								+ choice);
				if (choice == 0) {
					textArea.setText(null);
				} else if (choice == 1) {
					return;
				} else if (choice == 2) {
					return;
				}

			} else if (buttonSource == saveFile) {
				chooseFile.showSaveDialog(saveFile);
				selectedFile = chooseFile.getSelectedFile();
				textToRead = new StringBuilder();
				try {
					fileToWrite = new PrintStream(selectedFile);
					fileToWrite.println(textArea.getText());
					fileToWrite.close();
				} catch (FileNotFoundException e1) {
					return;
				}

			} else if (buttonSource == exitFile) {
				mainFrame.dispose();
			}
		}

	}
}
