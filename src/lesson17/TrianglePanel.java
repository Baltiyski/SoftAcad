package lesson17;

import java.awt.Graphics;

import javax.swing.JPanel;

public class TrianglePanel extends JPanel {
	@Override
	protected void paintComponent(Graphics p) {
		super.paintComponent(p);
		
		
		int[] triangleX={150, 150, 100};
		int[] triangleY={100, 50, 50};
		p.drawPolygon(triangleX, triangleY, 3);
	}
}
