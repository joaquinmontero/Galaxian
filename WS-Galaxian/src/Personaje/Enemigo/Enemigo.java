package Personaje.Enemigo;

import Premio.*;

import java.awt.Point;

import Comportamiento.*;
import Personaje.Personaje;

public abstract class Enemigo extends Personaje {
	protected final static int enemigos = 5; //está hardcodeado
	
	protected boolean regala; 
	protected Premio miPremio; 
	protected Comportamiento comportamiento;
	
	protected Enemigo(Point pos) {
		super(pos);
		regala=false;
	}
	
	public void asignarComportamiento(Comportamiento comp) {
		this.comportamiento=comp;
	}
	
	/**
	 * Establece si el enemigo entrega un premio al morir o no
	 * @param b Verdadero si entrega premio, falso en caso contrario
	 */
	public void entregaPremio(boolean b) {
		regala=b;
	}
	
	/**
	 * Devuelve el premio que entrega el enemigo al morir
	 * @return
	 */
	public Premio premio() {
		return miPremio;
	}
	
	/**
	 * Establece que tipo de premio entrega el enemigo
	 * @param p Premio a entregar
	 */
	public void asignarPremio(Premio p) {
		if(regala==true)
			miPremio=p;
	}
	public void setPosicion(int x, int y) {
		this.pos.x = x;
		this.pos.y = y;
	}
	public void moverme(){	
		comportamiento.actuar(this);
	}

}
