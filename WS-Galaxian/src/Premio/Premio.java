package Premio;

import java.awt.Point;

import Comportamiento.Comportamiento;
import Logica.*;

public abstract class Premio extends Entidad {
	protected Comportamiento comportamiento;
	protected static final Point inicial = new Point(0, 0);

	public Premio() {
		super(inicial);
	}

}
