package projeckt;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextEditor extends JPanel {
	public TextEditor() {
		setLayout(new BorderLayout());
		
		
		JPanel north = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel l = new JLabel("Test");
		Font font = new Font(Font.SANS_SERIF, Font.ITALIC, 20);
		
		l.setFont(font);
		north.add(l);
		add(north, BorderLayout.NORTH);
		
		JTextArea text = new JTextArea();
		JScrollPane pane = new JScrollPane(text);
		add(pane, BorderLayout.CENTER);
		
		JLabel empty = new JLabel();
		empty.setPreferredSize(new Dimension(0,600));
		add(empty, BorderLayout.CENTER);
		
		JButton button = new JButton("Open File");
		JPanel scout = new JPanel(new FlowLayout(FlowLayout.LEADING));
		scout.add(button);
		add(scout, BorderLayout.SOUTH);
		
	}

}
