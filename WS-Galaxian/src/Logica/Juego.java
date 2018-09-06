package Logica;
import java.awt.event.KeyEvent;
import java.util.Random;
import GUI.*;
/**
 * @author Araceli Iglesias, Sol Stiep, Yasmín Pie Lopez
 *
 */
public class Juego {
	private Nivel_1 lvl1;
	private Nivel_2 lvl2;
	private Nivel_3 lvl3;
	private Jugador jugador;
	public Juego(GUI gui) {
		lvl1 = new Nivel_1(gui);	
	}
	
	
	
	public void mover(int dir){		
		int direccion = 0;
		
		switch (dir){
			case KeyEvent.VK_UP : //Arriba
				direccion = 0;
				break;
			case KeyEvent.VK_DOWN : //Abajo
				direccion = 1;
				break;
			case KeyEvent.VK_LEFT : //Izquierda
				direccion = 2;
				break;
			case KeyEvent.VK_RIGHT : //Derecha
				direccion = 3;
				break;
		}
		
		jugador.mover(direccion);
	}
}
