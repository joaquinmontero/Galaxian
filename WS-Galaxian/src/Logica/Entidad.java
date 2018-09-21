package Logica;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;
import Disparo.*;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */
public abstract class Entidad {
	
	protected JLabel grafico;
	protected Icon image[];
	protected final int width = 120; //ancho de los sprites
	protected final int height = 120; //alto de los sprites
	
	protected int velocidad;
	protected int vida;
	
	protected Point pos;
	
	
	/**
	 * Inicializa entidad con su respectiva velocidad, posicion X, posicion Y y puntos de vida
	 * @param v Int velocidad, x Int posicion en eje X, y Int posicion en eje Y, v Int puntos de vida
	 */
	protected Entidad(int velocidad, int x, int y,int vida) {
		this.pos = new Point(x, y);
		this.velocidad = velocidad;
		this.vida=vida;
		this.image = new Icon[4];
	}
	
	/**
	 * Devuelve la velocidad de la entidad
	 * @return Int velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Devuelve la posicion X e Y de la entidad
	 * @return Point posicion
	 */
	public Point getPos() {
		return pos;
	}
	
	/**
	 * Devuelve la cantidad de vida de la entidad
	 * @return Int vida
	 */
	public int getVida() { 
		return vida;
	}
	
	
	/**
	 * Establece la vida de la entidad
	 * @param v Vida nueva a establecer
	 */
	public void setVida(int v) {
			vida=v;}
	
	/**
	 * Asigna a la entidad un nuevo grafico dentro de su arreglo de imagenes
	 * @param dir Posicion de la nueva imagen en el arreglo de imagenes de la entidad
	 */
	protected void cambiarGrafico(int dir){
		if(this.grafico != null){
			this.grafico.setIcon(this.image[dir]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
	}
	
	public void moverme(int dir){	
		switch (dir) {
			case 0 : //Arriba
				pos.setLocation(pos.x, pos.y - velocidad);
				break;
			case 1 : //Abajo
				pos.setLocation(pos.x, pos.y + velocidad);
				break;
			case 2 : //Izquierda
				pos.setLocation(pos.x - velocidad, pos.y);
				break;
			case 3 : //Derecha
				pos.setLocation(pos.x + velocidad, pos.y);
				break;
		}
		cambiarGrafico(dir);
	}
	
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(image[0]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
		
		return this.grafico;
	}
	
	
	/**
	 * La entidad el informa al disparo recibido qui�n est� recibiendo ese disparo
	 * @param d Disparo a activar
	 */
	public void meDisparan(Disparo d) {
		d.atacar(this);
	}
	

}



