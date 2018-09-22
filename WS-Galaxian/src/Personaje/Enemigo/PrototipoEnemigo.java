package Personaje.Enemigo;

import java.awt.Point;
import Comportamiento.*;

public abstract class PrototipoEnemigo extends Enemigo {

	public PrototipoEnemigo(Point pos) {
		super(pos);
		this.vida = 100;
		this.comportamiento = new Standard();
	}

	public PrototipoEnemigo clone() {
		return this.clone();
	}

}
