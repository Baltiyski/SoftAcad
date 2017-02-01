package lesson22.animation;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class TestBallPanel {
	private static BallPanel ballPanel;
	
	public static void main(String[] args) throws InterruptedException {
		JFrame f =new JFrame("Mouving Ball");
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ballPanel = new BallPanel();
		f.add(ballPanel);
		f.setVisible(true);
		f.addKeyListener(new BallListener());
		
		while (true){  
			Thread.sleep(10);
			ballPanel.moveBall();
			ballPanel.repaint();
			
		}
		
		
	}
	
	private static class BallListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent arg0) {}
		@Override
		public void keyTyped(KeyEvent arg0) {}
		
		@Override
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode()== KeyEvent.VK_LEFT) {
				ballPanel.setStepX(-1);
				ballPanel.setStepY(0);
			}else if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
				ballPanel.setStepX(1);
				ballPanel.setStepY(0);
			}else if(e.getKeyCode()== KeyEvent.VK_UP) {
				ballPanel.setStepX(0);
				ballPanel.setStepY(-1);
			}else if(e.getKeyCode()== KeyEvent.VK_DOWN) {
				ballPanel.setStepX(0);
				ballPanel.setStepY(1);
			}else if(e.getKeyCode()== KeyEvent.VK_ENTER) {
				ballPanel.setStepX(0);
				ballPanel.setStepY(0);
			}
			
		}

		
		
	}
}
