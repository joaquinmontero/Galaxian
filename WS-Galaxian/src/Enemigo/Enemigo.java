package Enemigo;



import Logica.*;
import Premio.*;
import Inteligencia.*;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmín Pie Lopez
 *
 */
public abstract class Enemigo extends Entidad {
	Inteligencia i;
	boolean regala; //me indica si el enemigos entrega un premio al morir
	Premio premio; // premio que entregara el enemigo
	
	/**
	 * Inicializa enemigo con su respectiva velocidad, posicion X, posicion Y y puntos de vida
	 * inicia condicion booleana regala con false
	 * @param v Int velocidad, x Int posicion en eje X, y Int posicion en eje Y, v Int puntos de vida
	 */
	protected Enemigo(int velocidad,int x, int y, int v) {
		super(velocidad,x,y,v);
		regala=false;
	}
	
	/**
	 * Establece el tipo de inteligencia del enemigo
	 * @param i Tipo de inteligencia
	 */
	public void asignarInteligencia(Inteligencia i) {
		this.i=i;
	}
	
	/**
	 * Establece si el enemigo entrega un premio al morir o no
	 * @param b Verdadero si entrega premio, falso en caso contrario
	 */
	public void entregaPremio(boolean b) {
		regala=b;
	}
	
	/**
	 * Devuelve el premio que entrega el enemigo al morir
	 * @return
	 */
	public Premio premio() {
		return premio;
	}
	
	/**
	 * Establece que tipo de premio entrega el enemigo
	 * @param p Premio a entregar
	 */
	public void asignarPremio(Premio p) {
		if(regala==true)
			premio=p;
	}

}
