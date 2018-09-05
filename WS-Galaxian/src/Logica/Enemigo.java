package Logica;

import javax.swing.ImageIcon;

/**
 * 
 * @author Araceli Iglesias, Maria Sol Stiep, Yasmín Pie Lopez
 *
 */
public class Enemigo extends Personaje {
	private Inteligencia inteligencia;
	
	public Enemigo(ImageIcon i,int ejeX,int ejeY) {
		super(i);
		x=ejeX;
		y=ejeY;
	}

	public void agregarArma() {
		arma=new Intermedia();
	}

	public void modificarAlcanceArma(int a) {
		arma.setAlcance(a);
	}

	public void modificarPuntosGolpeArma(int p) {
		arma.setPuntosGolpe(p);
	}
	
}
