package Logica;

import javax.swing.ImageIcon;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmín Pie Lopez
 *
 */
public class Enemigo extends Personaje {
	private int x,y;
	private Inteligencia inteligencia;
	
	public Enemigo(ImageIcon i,int ejeX,int ejeY) {
		super(i);
		x=ejeX;
		y=ejeY;
	}
	
}
