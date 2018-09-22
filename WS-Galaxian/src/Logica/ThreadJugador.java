package Logica;

import Mapa.Mapa;

public class ThreadJugador extends Thread {
	private Mapa map;

	public ThreadJugador(Mapa mapa) {
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
