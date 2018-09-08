package Enemigo;

import javax.swing.ImageIcon;
/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */

/**
 * Inicializa Cambiante con su respectiva velocidad, posicion X, posicion Y y puntos de vida
 * Añade el conjunto de imagenes al arreglo de imagenes de Cambiante
 * @param v Int velocidad, x Int posicion en eje X, y Int posicion en eje Y, v Int puntos de vida
 */
public class Cambiante extends Enemigo{
	public Cambiante(int velocidad,int x, int y, int v) {
		super(velocidad,x,y,v);
		this.image[0] = new ImageIcon(this.getClass().getResource("/sprites/Kamikaze_noral.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/sprites/Kamikaze_abajo.png"));
		this.image[2] = new ImageIcon(this.getClass().getResource("/sprites/Kamikaze_izquierda.png"));
		this.image[3] = new ImageIcon(this.getClass().getResource("/sprites/Kamikaze_derecha.png"));

}
}
