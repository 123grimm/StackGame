package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//�berwacht Bewegungszustand der notwendigen Tasten
public class TastaturEingabe implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			Var.moveUp=true;  
			//Muss am Ende weg
			System.out.println("Leertaste gedr�ckt.");
		} 
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			Var.moveUp=false;
			//Muss am Ende weg
			System.out.println("Leertaste losgelassen.");
		}
    }	
}

