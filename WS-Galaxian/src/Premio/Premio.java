package Premio;
import Logica.*;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */

public abstract class Premio extends Entidad{
	/**
	 * Inicializa premio con su respectiva velocidad, posicion X, posicion Y y puntos de vida
	 * @param v Int velocidad, x Int posicion en eje X, y Int posicion en eje Y, v Int puntos de vida
	 */
	public Premio(int velocidad, int x, int y,int vida) {

        super(velocidad,x,y,vida);
    }
	
	


}
