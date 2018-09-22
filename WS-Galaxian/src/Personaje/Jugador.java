package Personaje;

import java.awt.Point;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */

/**
 * Inicializa jugador con su respectiva velocidad, posicion X, posicion Y y
 * puntos de vida A�ade el conjunto de imagenes al arreglo de imagenes del
 * jugador
 * 
 * @param v Int velocidad, x Int posicion en eje X, y Int posicion en eje Y, v
 *          Int puntos de vida
 */
public class Jugador extends Personaje {
	private int cantVidas = 3;
	private int porcentajeVida = 100;
	protected int velocidad = 20;

	public Jugador(Point pos) {
		super(pos);
		this.vida = porcentajeVida;
		setGraficos();
	}

	private void setGraficos() {
		this.image[0] = new ImageIcon(this.getClass().getResource("/img/Jugador_arriba.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/img/Jugador_abajo.png"));
		this.image[2] = new ImageIcon(this.getClass().getResource("/img/Jugador_izquierda.png"));
		this.image[3] = new ImageIcon(this.getClass().getResource("/img/Jugador_derecha.png"));
	}

	public int cantVidas() {
		return cantVidas;
	}

	/**
	 * Recibe la tecla del usuario
	 * 
	 * @param dir Direccion del movimiento
	 */
	public void keyListener(int dir) {
		int direccion = 0;

		switch (dir) {
		case KeyEvent.VK_UP: // Arriba
			direccion = 0;
			break;
		case KeyEvent.VK_DOWN: // Abajo
			direccion = 1;
			break;
		case KeyEvent.VK_LEFT: // Izquierda
			direccion = 2;
			break;
		case KeyEvent.VK_RIGHT: // Derecha
			direccion = 3;
			break;
		}

		moverme(direccion);

	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void moverme(int dir) {
		// El metodo esta modificado para que el jugador dispare con la flecha de arriba
		// y para que solo pueda moverse hacia los costados
		switch (dir) {
		case 0: // Arriba
			cambiarGrafico(0);
			break;
		case 1: // Abajo
			cambiarGrafico(1);
			break;
		case 2: // Izquierda
			if (pos.x > 0) {
				pos.setLocation(pos.x - velocidad, pos.y);
				cambiarGrafico(dir);
			}
			break;
		case 3: // Derecha
			if (pos.x < 600) {
				pos.setLocation(pos.x + velocidad, pos.y);
				cambiarGrafico(dir);
			}
			break;
		}
	}

	public void moverme() {
	}
}
