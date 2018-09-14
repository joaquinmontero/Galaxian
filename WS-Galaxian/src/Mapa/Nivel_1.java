package Mapa;
import javax.swing.ImageIcon;


/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */

/**
 * Inicializa el mapa con su respectiva cantidad de filas de enemigos
 * @param GUI donde ubicara al jugador y enemigos
 */
public class Nivel_1 extends Mapa {
	public Nivel_1() {
		super(1);
		image=new ImageIcon(this.getClass().getResource("/img/Fondo_nivel_1.png"));
	}
	
}
