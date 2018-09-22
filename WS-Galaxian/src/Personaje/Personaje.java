package Personaje;

import Logica.Entidad;

import java.awt.Point;

import Disparo.*;

public abstract class Personaje extends Entidad {
	protected Personaje(Point pos) {
		super(pos);
		
	}
	
	public Disparo disparar() {
		Disparo disparo=new DisparoJugador(100,this.pos.x+30, this.pos.y-30,100);
		return disparo;
	}
	
	public Disparo dispararSuper() {
		Disparo disparo=new SuperDisparoJugador(150,this.pos.x, this.pos.y-50,100);
		return disparo;
	}
	
	
}
