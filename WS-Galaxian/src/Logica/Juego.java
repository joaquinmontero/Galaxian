package Logica;
import Mapa.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

import Disparo.*;
import Grafica.*;

public class Juego {
	private ThreadGeneral tiempo;
	private ThreadDisparo threadDisparo;
	private Mapa mapa;
	private int puntaje;
	
	public Juego() {	
		mapa = new Nivel_1();
		puntaje = 0;
		iniciarTiempo();
	}
	
	public Mapa getMapa() {
		return mapa;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void sumarPuntaje(int sum) {
		puntaje = puntaje + sum;
	}
	
	public void resetLevel() {	
		mapa = null;
		mapa = new Nivel_3();
	}
	
	public void gameOver() {
		//mostrar pantalla de fin de juego
	}
	
	public void iniciarTiempo() {
		tiempo = new ThreadGeneral(mapa);
		tiempo.start();
		threadDisparo=new ThreadDisparo(mapa);
		threadDisparo.start();
	}
	
}

	