package GUI;
/**
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 */

import Logica.*;

public class ContadorTiempo extends Thread {

	private Juego elJuego;

	ContadorTiempo(Juego j) {
		this.elJuego = j;
	}

	public void run() {
		while(true){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		elJuego.mover();
		}
	}
}