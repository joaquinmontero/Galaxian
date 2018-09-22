package Mapa;

import java.awt.Point;
import java.util.LinkedList;

import Personaje.Enemigo.Bomba;
import Personaje.Enemigo.Buscador;
import Personaje.Enemigo.Debil;
import Personaje.Enemigo.Distraido;
import Personaje.Enemigo.Kamikaze;
import Personaje.Enemigo.PrototipoEnemigo;

public abstract class nivelActual extends Mapa {
	protected final int ENEMIGOSXFILA = 6;
	protected LinkedList<PrototipoEnemigo> prototipoEnemigo;
	protected final int distHorizontal = 120;
	protected final int distVertical = 120;
	protected boolean status = false;

	public nivelActual() {
		iniciarNivel();
	}

	protected abstract nivelActual iniciarNivel();

	public abstract boolean nivelCompletado();

	public abstract nivelActual nivelSiguiente();
	
	public void generarPrototipos() {
		Point inicial = new Point(50, 50);
		PrototipoEnemigo bomba = new Bomba(inicial);
		prototipoEnemigo.add(bomba);
		PrototipoEnemigo buscador = new Buscador(inicial);
		prototipoEnemigo.add(buscador);
		PrototipoEnemigo debil = new Debil(inicial);
		prototipoEnemigo.add(debil);
		PrototipoEnemigo distraido = new Distraido(inicial);
		prototipoEnemigo.add(distraido);
		PrototipoEnemigo kamikaze = new Kamikaze(inicial);
		prototipoEnemigo.add(kamikaze);

	}
}
