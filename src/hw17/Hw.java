package hw17;

import javax.swing.JOptionPane;

public class Hw {
	public static void main(String[] args) {
		
		//selecting a shape - Rectangles,Circles
		String[] shape = {"Rectangles", "Circles"};
		JOptionPane.showInputDialog(null, "Chose shape", "Shape", JOptionPane.INFORMATION_MESSAGE, null, shape, "Rectangles");
		
		
		//number of shapes that are displayed
		String shapes = JOptionPane.showInputDialog(null, "Enter number of shapes to be draw", "Input", JOptionPane.QUESTION_MESSAGE);
		System.out.println("the name is: " + shapes);
		
		/**
		 * indication of the distance between them (figures are drawn each
		 * is next down the Y axis and right axis X)
		 */
		String distance = JOptionPane.showInputDialog(null, "Enter distance", "Input", JOptionPane.QUESTION_MESSAGE);
		System.out.println("The distance is: " + distance);
		
		//select a color that will draw
		String[] color = {"White", "Red", "Blue", "Green", "Orange", "Black"};
		JOptionPane.showInputDialog(null, "Chose color", "Color", JOptionPane.INFORMATION_MESSAGE, null, color, "White");
		
		
		
		
	}
}
