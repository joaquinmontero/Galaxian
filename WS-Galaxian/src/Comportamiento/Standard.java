package Comportamiento;

import Logica.Entidad;

public class Standard implements Comportamiento {
	private boolean moverDerecha;
	private int velocidad = 10;

	public Standard() {
		standardSingleton();
	}
	
	private Standard standardSingleton() {
		return this;
	}

	/**
	 * Mueve de forma standard a los enemigos, como el Galaxian.
	 * 
	 * @param e
	 */
	public void actuar(Entidad e) {
		if (moverDerecha) {
			if (nuevaPosicion.getX() > 50) {
				e.cambiarGrafico(2);
				nuevaPosicion.setLocation(nuevaPosicion.getX() - velocidad, nuevaPosicion.getY());
				for (int i = 0; i < 10; i++) {
					nuevaPosicion.setLocation(nuevaPosicion.getX() - 1, nuevaPosicion.getY());
				}
				if (nuevaPosicion.getY() > 550) {
					moverAbajo(e);
					moverDerecha = true;
				}
			}
		} else {
			if (nuevaPosicion.getX() < 750) {
				e.cambiarGrafico(3);
				nuevaPosicion.setLocation(nuevaPosicion.getX() + velocidad, nuevaPosicion.getY());
				for (int i = 0; i < 10; i++) {
					nuevaPosicion.setLocation(nuevaPosicion.getX() + 1, nuevaPosicion.getY());
				}
				if (nuevaPosicion.getY() < 50) {
					moverAbajo(e);
					moverDerecha = false;
				}
			}
		}
	}

	private void moverAbajo(Entidad e) {
		e.cambiarGrafico(1);
		nuevaPosicion.setLocation(nuevaPosicion.getX(), nuevaPosicion.getY() + velocidad);
		for (int i = 0; i < 4; i++) {
			nuevaPosicion.setLocation(nuevaPosicion.getX(), nuevaPosicion.getY() + 1);
		}
		if (nuevaPosicion.getY() > 500) {
			nuevaPosicion.setLocation(nuevaPosicion.x, 0);
		}
	}
}
