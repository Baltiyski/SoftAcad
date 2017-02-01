package lesson17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//draw line
		g.drawLine(0, 0, 100, 100);
		

		g.setColor(Color.RED);
		g.fillRect(100, 100, 100, 50);
		g.drawOval(200, 150, 100, 100);
		
		int[] triangleX={300, 350, 400, 100, 14};
		int[] triangleY={300, 250, 400, 500, 600};
		g.drawPolygon(triangleX, triangleY, 5);
		
	}
}
