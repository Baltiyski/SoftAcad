package projectTextEditor;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class BorderPanel extends JPanel {

	JFrame mainFrame;
	JTextArea textArea;
	FlowPanel flowPanel;

	BorderPanel(JFrame mainFrame) {
		this.mainFrame = mainFrame;
		setLayout(new BorderLayout());

		textArea = new JTextArea();
		textArea.setEnabled(true);
		textArea.setEditable(true);

		flowPanel = new FlowPanel(mainFrame, textArea);
		add(flowPanel, BorderLayout.NORTH);

		add(textArea, BorderLayout.CENTER);

	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
}
