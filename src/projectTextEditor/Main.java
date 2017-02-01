package projectTextEditor;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Main {
	private static final String mainFrameName = "TEXT EDITOR";

	public static void main(String[] args) {

		JFrame mainFrame = new JFrame(mainFrameName);
		mainFrame.setResizable(true);
		mainFrame.setSize(800, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BorderPanel borderPanel = new BorderPanel(mainFrame);
		JScrollPane scrollTextArea = new JScrollPane(borderPanel.getTextArea());

		borderPanel.add(scrollTextArea);

		mainFrame.add(borderPanel);

		mainFrame.setVisible(true);
	}
	// *-----------*//
}
