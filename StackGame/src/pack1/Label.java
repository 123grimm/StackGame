package pack1;

import java.awt.Color;
import java.awt.Font;
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
		
		//�ffnet TitleScreen
		if(Var.gameActive==0) {
			
			//Hintergrund (Wolkenbild)
			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
			
			//Spieler (Pinguin)
			g.drawImage(Var.iplayer,350 ,275 , 100, 100, null);
			
			//Schatten von Title usw...
			//Vom Titel
			g.setFont(getFont().deriveFont(Font.BOLD, 96F));
			g.setColor(Color.BLACK);
			g.drawString(Var.titleTxt,130 , 200);
			
			//Title usw...
			g.setFont(getFont().deriveFont(Font.BOLD, 96F));
			g.setColor(Color.BLUE);
			g.drawString(Var.titleTxt,125 , 200);
			//Subtitle
			g.setFont(getFont().deriveFont(Font.BOLD, 20F));
			g.drawString(Var.subtitle,200 , 250);
			
			//Spiel starten
			g.setFont(getFont().deriveFont(Font.BOLD, 40F));
			g.drawString(Var.start, 300 , 425);
			
			//Spiel schlie�en
			g.setFont(getFont().deriveFont(Font.BOLD, 36F));
			g.drawString(Var.close, 304 , 480);
			
			//Settings
			g.drawString(Var.setting,340, 535);
			
			//Pr�ft ob welcher Button gedr�ckt und markiert die Auswahl
			if(Var.buttonNumber == 0) {
				g.setFont(getFont().deriveFont(Font.BOLD, 40F));
				g.drawString("<", 270,  425);
				g.drawString(">", 525,  425);
			} else if(Var.buttonNumber == 1) {
				g.drawString("<", 270,  480);
				g.drawString(">", 525,  480);
			} else if(Var.buttonNumber == 2) {
				g.drawString("<", 270,  535);
				g.drawString(">", 525,  535);
			}
		
		//Offnet Spiel
		} else if(Var.gameActive==1) {
			
			//Hintergrund (Wolkenbild)
			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
			
			//Spieler (Pinguin)
			g.drawImage(Var.iplayer,Var.x,Var.y, 100, 100, null);
			
			if(Var.buttonNumberGame==1) {
				
				//Pop-up Fenster f�rs Leaven
				g.setColor(Color.BLUE);
				g.drawRect(250, 100, 300, 300);
				g.setFont(getFont().deriveFont(Font.BOLD, 30F));
				g.drawString(Var.gameQuestion, 300, 150);
				g.drawString(Var.gameQuestion2, 300, 200);
				//Kasten linksunten
				g.drawLine(250, 300, 550, 300);
				//Kasten rechtsunten
				g.drawLine(400, 300, 400, 400);
				g.drawString(Var.yes, 290, 360);
				g.drawString(Var.no, 450, 360);
				
				//Markiert yes oder no
				if(Var.buttonYN==0) {
					g.drawString("<",270 ,360);
					g.drawString(">",355 ,360);
				}else if(Var.buttonYN==1) {
					g.drawString("<",430 ,360);
					g.drawString(">",500 ,360);
				}
			}
				
		//Schlei�t Programm
		} else if(Var.gameActive==2) {
			
			//Schlie�t alles
			System.exit(0);
			
		//�ffnet Settings
		} else if(Var.gameActive==3) {
			
			//Hintergrund (Wolkenbild)
			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
			
			//Lautst�rke und Steuerung kommt noch und Escape zur�ck zum Start
		}
		repaint();
	}

}
