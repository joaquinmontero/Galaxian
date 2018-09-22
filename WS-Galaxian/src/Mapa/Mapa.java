package Mapa;

import java.util.*;

import Logica.*;
import Personaje.*;

import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class Mapa {
	protected static final int ALTURA_JUEGO = 800;
	protected static final int ANCHURA_JUEGO = 600;
	protected Jugador jugador;
	protected LinkedList<Entidad> entidades;
	protected Icon fondo;
	protected nivelActual nivel;

	public Mapa() {
		nivel.iniciarNivel();
	}

	public Jugador getJugador() {
		return jugador;
	}

	public LinkedList<Entidad> getEntidades() {
		return entidades;
	}

	public JLabel getGrafico() {
		JLabel grafico = new JLabel(fondo);
		grafico.setBounds(0, 0, ANCHURA_JUEGO, ALTURA_JUEGO);
		return grafico;
	}

}
