package lesson18.more;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BirthdayPanel extends JPanel{
	private JButton button;
	private JLabel text;
	
	public BirthdayPanel(){
		button = new JButton("Click me");
		text = new JLabel();
		
		add(button);
		add(text);
		
		ButtonListener butList = new ButtonListener();
		button.addActionListener(butList);
	}
	
	
	/**
	 * Listener for the button "Click me".
	 * It set text "Happy Birthday" to the label
	 * 
	 * @author stanislav.georgiev
	 *
	 */
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			text.setText("Happy birthday!!!");
		}

	}
}
