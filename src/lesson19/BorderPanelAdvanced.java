package lesson19;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BorderPanelAdvanced extends JPanel{
	public BorderPanelAdvanced(){
		this.setLayout(new BorderLayout(10, 10));
		
		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p.add(new JLabel("Test border layout"));
		add(p, BorderLayout.NORTH);
		
		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.LEFT, 50, 0));
		bottom.add(new JButton("Click"));
		
		add(bottom, BorderLayout.SOUTH);
		
		JLabel l = new JLabel();
		l.setPreferredSize(new Dimension(200, 100));
		add(l, BorderLayout.WEST);
		
		add(new JTextArea(), BorderLayout.CENTER);
	}
}
