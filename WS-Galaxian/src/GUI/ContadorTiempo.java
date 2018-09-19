package GUI;
/**
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 */

import Logica.*;

public class ContadorTiempo extends Thread {

	private Juego elJuego;
	private int fps;

	public ContadorTiempo(Juego j,int fps) {
		this.elJuego = j;
		this.fps = fps;
	}
	
	public void setFPS(int fps) {
		this.fps = fps;
	}
	

	public void run() {
		long tiempoActual = System.nanoTime();
		long tiempoFinal = tiempoActual + (1000000 * 1000 / fps);
		while(true){
			tiempoActual = System.nanoTime();
			if(tiempoActual >= tiempoFinal) {
				tiempoFinal = tiempoActual + (1000000 * 1000 / fps);
				elJuego.getMapa().actualizarEntidades();
			}
		elJuego.mover();
		}
	}
}