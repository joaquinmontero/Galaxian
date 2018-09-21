package Enemigo;



import Logica.*;
import Premio.*;
import Disparo.Disparo;
import Disparo.DisparoJugador;
import Inteligencia.*;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmín Pie Lopez
 *
 */
public abstract class Enemigo extends Entidad {
	protected Inteligencia i;
	protected boolean regala; //me indica si el enemigos entrega un premio al morir
	protected Premio premio; // premio que entregara el enemigo
	
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
	
	public void moverme(int dir){	
		switch (dir) {
			case 0 : //Arriba			
				break;
			case 1 : //Abajo
				cambiarGrafico(dir);
				pos.setLocation(pos.x, pos.y + velocidad);
				pos.setLocation(pos.x, pos.y + 1);
				pos.setLocation(pos.x, pos.y + 1);
				pos.setLocation(pos.x, pos.y + 1);
				pos.setLocation(pos.x, pos.y + 1);	
				if(pos.getY()>500) {
					pos.setLocation(pos.x, 0);
				}
				break;
			case 2 : //Izquierda
				if(pos.getX()>0) {
					cambiarGrafico(dir);
					pos.setLocation(pos.x - velocidad, pos.y);
					pos.setLocation(pos.x - 1, pos.y);
					pos.setLocation(pos.x - 1, pos.y);
					pos.setLocation(pos.x - 1, pos.y);
					pos.setLocation(pos.x - 1, pos.y);
				}
				break;
			case 3 : //Derecha
				if(pos.getX()<600) {
					cambiarGrafico(dir);
					pos.setLocation(pos.x + velocidad, pos.y);
					pos.setLocation(pos.x + 1, pos.y);
					pos.setLocation(pos.x + 1, pos.y);
					pos.setLocation(pos.x + 1, pos.y);
					pos.setLocation(pos.x + 1, pos.y);
					
				}
				break;
		}
		
	}

}
