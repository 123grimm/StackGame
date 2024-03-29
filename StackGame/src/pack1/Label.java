package pack1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel{
	
	//Nicht zwingend notwendig
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		//Ist f�r Antialiasing zust�ndig
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//Hintergrund
		//g.drawImage(Var.ib1, 0, Var.backgroundY3, 800, 600, null);
		g.drawImage(Var.ib2, 0, Var.backgroundY1, 800, 600, null);
		g.drawImage(Var.ib3, 0, Var.backgroundY2, 800, 600, null);
		
		//Spieler (Pinguin)
		g.drawImage(Var.iplayer,Var.x,Var.y, 100, 100, null);
		
		repaint();
	}

}
