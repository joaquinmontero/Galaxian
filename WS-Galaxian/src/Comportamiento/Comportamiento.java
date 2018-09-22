package Comportamiento;

import java.awt.Point;
import Logica.Entidad;

public interface Comportamiento {
	static final Point nuevaPosicion = null ;

	public abstract void actuar(Entidad e);

}
