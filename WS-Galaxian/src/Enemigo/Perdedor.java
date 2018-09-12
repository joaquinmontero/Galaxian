package Enemigo;

import javax.swing.ImageIcon;
/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */

/**
 * Inicializa Perdedor con su respectiva velocidad, posicion X, posicion Y y puntos de vida
 * A�ade el conjunto de imagenes al arreglo de imagenes de Perdedor
 * @param v Int velocidad, x Int posicion en eje X, y Int posicion en eje Y, v Int puntos de vida
 */
public class Perdedor extends Enemigo {
	public Perdedor(int velocidad,int x, int y, int v) {
		super(velocidad,x,y,v);
		this.image[0] = new ImageIcon(this.getClass().getResource("/img/Con_disparo.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/img/Con_disparo.png"));
		this.image[2] = new ImageIcon(this.getClass().getResource("/img/Con_disparo.png"));
		this.image[3] = new ImageIcon(this.getClass().getResource("/img/Con_disparo.png"));
}
}
