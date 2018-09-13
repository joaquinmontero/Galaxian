package Disparo;
import javax.swing.Icon;
import Logica.*;
/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */


public abstract class Disparo extends Entidad {
	
	int fuerzaImpacto;
	
	/**
	 * Inicializa disparo con su respectiva velocidad, posicion X, posicion Y y puntos de vida
	 * @param v Int velocidad, x Int posicion en eje X, y Int posicion en eje Y, v Int puntos de vida
	 */
	public Disparo(int velocidad, int x, int y,int vida) {

        super(velocidad,x,y,vida);
    }

	/**
	 * Se encarga de alterar a la Entidad que está atacando dependiendo del tipo que sea
	 * @param e Entidad a atacar
	 */
	public void atacar(Entidad e) {
		
	}

	
}

