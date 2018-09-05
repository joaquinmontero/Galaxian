package Logica;

import javax.swing.ImageIcon;

/**
 * 
 * @author Araceli Iglesias, Maria Sol Stiep, Yasmín Pie Lopez
 *
 */
public abstract class Personaje extends Entidad{
	protected ImageIcon sprite;
	protected int x,y,puntosVida=100;
	protected Arma arma;
	
	public Personaje(ImageIcon i) {
		sprite = i;
	}
	
	public void setPuntosVida(int p) {
		puntosVida=p;
	}
	
	public int getPuntosVida() {
		return puntosVida;
	}
	
	public void setX(int ejeX) {
		x=ejeX;
	}
	
	public void setY(int ejeY) {
		y=ejeY;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public abstract void agregarArma();
	
	public abstract void modificarAlcanceArma(int a);
	
	public abstract void modificarPuntosGolpeArma(int p);
}
