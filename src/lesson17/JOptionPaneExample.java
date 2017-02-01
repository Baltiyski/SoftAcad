package lesson17;

import javax.swing.JOptionPane;

public class JOptionPaneExample {
	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "Hello World");
//		JOptionPane.showMessageDialog(null, "Some message", "This is the title", JOptionPane.ERROR_MESSAGE);
		
		//user input
//		int choice = JOptionPane.showConfirmDialog(null, "Are you male?");
//		JOptionPane.showConfirmDialog(null, "Are you male?", "Please answer the question", JOptionPane.OK_CANCEL_OPTION);
//		System.out.println(choice);
		
		String name = JOptionPane.showInputDialog("Enter your name");
		System.out.println("The name is " + name);
		JOptionPane.showInputDialog("Name?", "Enter your name here");
		
		String[] cars = {"Mecedes", "Trabant", "BMW"};
		JOptionPane.showInputDialog(null, "What's you favorit car?", "Choose car", JOptionPane.QUESTION_MESSAGE, null, cars, "BMW");
	}
}
