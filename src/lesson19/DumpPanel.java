package lesson19;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DumpPanel extends JPanel{
	public DumpPanel(){
		setLayout(new BorderLayout());
		
		JPanel north = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel l = new JLabel("Test border layout");
		Font font = new Font(Font.SANS_SERIF, Font.ITALIC, 20);
		l.setFont(font);
		north.add(l);
		add(north, BorderLayout.NORTH);
		
		JTextArea text = new JTextArea();
		JScrollPane pane = new JScrollPane(text);
		add(pane, BorderLayout.CENTER);
		
		JLabel empty = new JLabel();
		empty.setPreferredSize(new Dimension(120, 0));
		add(empty, BorderLayout.WEST);
		
		
		JButton button = new JButton("Click");
		JPanel sount = new JPanel(new FlowLayout(FlowLayout.LEFT, 60, 0));
		sount.add(button);
		add(sount, BorderLayout.SOUTH);
	}
}
