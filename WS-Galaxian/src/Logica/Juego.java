package Logica;
import Mapa.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;
import GUI.*;
import Disparo.*;
/**
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */
public class Juego {
	
	private Mapa mapa;
	private LinkedList<Disparo> disparos;
	
	public Juego() {
		mapa = new Nivel_3();
		disparos=new LinkedList<Disparo>();
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
	
	public void moverDisparo() {
		int i=0;
		while(i<disparos.size()) {
				disparos.get(i).mover(0);
				i++;
		}
	}

	public Mapa getMapa() {
		return mapa;
	}
	
	public void agregarDisparo(Disparo d) {
		disparos.add(d);
	}
	

}

	