package Logica;
/**
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 */

import Logica.*;
import Mapa.Mapa;

public class ThreadGeneral extends Thread {

	private Mapa map;

	public ThreadGeneral(Mapa mapa) {
		this.map = mapa;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (Entidad ent : map.getEntidades())
				ent.getGrafico().actualizarEntidad();
		}
	}
}