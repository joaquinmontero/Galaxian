package Mapa;

import javax.swing.ImageIcon;

import Personaje.Enemigo.*;

import java.awt.Point;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class Nivel_1 extends nivelActual {
	private static final int cantidadEnemigos = 12;
	private int cantidadRestante = cantidadEnemigos;

	public Nivel_1() {
		iniciarNivel();
	}

	protected Nivel_1 iniciarNivel() {
		fondo = new ImageIcon(this.getClass().getResource("/img/Fondo_nivel_1.png"));
		prototipoEnemigo = new LinkedList<PrototipoEnemigo>();
		generarPrototipos();
		generarEnemigos();
		return this;
	}

	public boolean nivelCompletado() {
		if (cantidadRestante == 0) {
			status = true;
		}
		return status;
	}

	public nivelActual nivelSiguiente() {
		nivelActual sgteNivel;
		if (status)
			sgteNivel = new Nivel_2();
		else
			sgteNivel = this;

		return sgteNivel;
	}

	public void generarEnemigos() {
		Point referencia = new Point(0, 0);
		Random rnd = new Random();
		PrototipoEnemigo prot = prototipoEnemigo.get(rnd.nextInt(prototipoEnemigo.size()));
		PrototipoEnemigo nuevoEnemigo = null;
		for (int i = 0; i < cantidadEnemigos; i++) {
			referencia.setLocation(prot.getPos().x, prot.getPos().y + 50);
			for (int j = 0; j < ENEMIGOSXFILA; i++) {
				nuevoEnemigo = prot.clone();
				nuevoEnemigo.setPosicion(referencia.x + distHorizontal, referencia.y);
				entidades.add(nuevoEnemigo);
				referencia.setLocation(nuevoEnemigo.getPos());
			}
		}
	}
}
