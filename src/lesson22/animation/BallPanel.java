package lesson22.animation;

import java.awt.Graphics;

import javax.swing.JPanel;

public class BallPanel extends JPanel {
	private static final int BALL_WHIDTH = 100;
	private static final int BALL_HEIGHT = 100;
	
	private int startX = 0;
	private int startY = 0;
	
	private int stepX = 1;
	private int stepY = 1;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(startX, startY, BALL_WHIDTH, BALL_HEIGHT);
	}
	
	public void moveBall() {
		startX += stepX;
		startY += stepY;
	}


	public void setStepX(int stepX) {
		this.stepX = stepX;
	}

	public void setStepY(int stepY) {
		this.stepY = stepY;
	}
	
	
}
