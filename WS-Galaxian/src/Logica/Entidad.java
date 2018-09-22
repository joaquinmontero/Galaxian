package Logica;

import java.awt.Point;
import javax.swing.Icon;
import Disparo.*;
import Grafica.EntidadGrafica;
import Mapa.Mapa;

public abstract class Entidad {

	protected EntidadGrafica sprite;
	protected Icon image[];
	protected final int anchoSprite = 120;
	protected final int altoSprite = 120;
	protected int vida;
	protected int puntaje;
	protected Point pos;
	protected Mapa mapa;

	/**
	 * Inicializa entidad con su respectiva velocidad, posicion X, posicion Y y
	 * puntos de vida
	 * 
	 * @param v Int velocidad, x Int posicion en eje X, y Int posicion en eje Y, v
	 *          Int puntos de vida
	 */
	protected Entidad(Point pos) {
		this.pos = pos;
		this.image = new Icon[4];
	}

	/**
	 * Devuelve la posicion X e Y de la entidad
	 * 
	 * @return Point posicion
	 */
	public Point getPos() {
		return pos;
	}

	/**
	 * Devuelve la cantidad de vida de la entidad
	 * 
	 * @return Int vida
	 */
	public int getVida() {
		return vida;
	}

	/**
	 * Establece la vida de la entidad
	 * 
	 * @param v Vida nueva a establecer
	 */
	public void setVida(int v) {
		vida = v;
	}

	/**
	 * Asigna a la entidad un nuevo grafico dentro de su arreglo de imagenes
	 * 
	 * @param dir Posicion de la nueva imagen en el arreglo de imagenes de la
	 *            entidad
	 */
	public void cambiarGrafico(int dir) {
		if (this.sprite != null) {
			this.sprite.setIcon(this.image[dir]);
			this.sprite.setBounds(this.pos.x, this.pos.y, anchoSprite, altoSprite);
		}
	}

	public abstract void moverme();

	public EntidadGrafica getGrafico() {
		if (this.sprite == null) {
			this.sprite = new EntidadGrafica(image[0]);
			this.sprite.setBounds(this.pos.x, this.pos.y, anchoSprite, altoSprite);
		}
		return this.sprite;
	}

	/**
	 * La entidad el informa al disparo recibido qui�n est� recibiendo ese disparo
	 * 
	 * @param d Disparo a activar
	 */
	public void meDisparan(Disparo d) {
		d.atacar(this);
	}

}
