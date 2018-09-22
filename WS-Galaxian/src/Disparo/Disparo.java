package Disparo;
import java.awt.Point;

import javax.swing.Icon;
import Logica.*;
/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */


public abstract class Disparo extends Entidad {
	int fuerzaImpacto;

	public Disparo(Point pos) {
        super(pos);
        this.vida = 1;
        this.puntaje = 0;
        
    }

	/**
	 * Se encarga de alterar a la Entidad que est� atacando dependiendo del tipo que sea
	 * @param e Entidad a atacar
	 */
	public void atacar(Entidad e) {
		
	}
	
	public void disparar(Entidad e) {
		e.meDisparan(this);
	}

	
}

