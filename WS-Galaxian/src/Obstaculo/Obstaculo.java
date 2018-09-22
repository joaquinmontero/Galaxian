package Obstaculo;
import java.awt.Point;
import Comportamiento.*;
import Logica.*;
public class Obstaculo extends Entidad{
	protected Comportamiento comportamiento;
	protected static final Point inicial = new Point(0,0);
	
	public Obstaculo() {
		super(inicial);
		comportamiento = new Standard();
	}

	public void moverme() {
		comportamiento.actuar(this);
	}
}
