package Logica;
import Mapa.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import GUI.*;
/**
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */
public class Juego {
	private Mapa mapa;
	public Juego(GUI gui) {
		mapa = new Nivel_3(gui);
		
	}
	
	/**
	 * Se encarga de mover de manera random a los enemigos, nunca los mueve hacia arriba
	 */
	public void mover(){
		int i=0;
			
			while(i<mapa.enemigos().size()) {
			Random r = new Random();
			
			int dir = r.nextInt(3)+1;
			
			mapa.enemigos().get(i).mover(dir);
			i++;
		}
	}
	
	/**
	 * Mueve al jugador en base a la direccion pasada por parametro
	 * @param dir Direccion del movimiento
	 */
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
		
		mapa.jugador().mover(direccion);
	}

}

	