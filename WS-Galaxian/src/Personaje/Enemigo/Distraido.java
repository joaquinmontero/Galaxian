package Personaje.Enemigo;

import java.awt.Point;

import javax.swing.ImageIcon;

public class Distraido extends PrototipoEnemigo {
	public Distraido(Point pos) {
		super(pos);
		this.image[0] = new ImageIcon(this.getClass().getResource("/img/Bobo_derecha.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/img/Bobo_izquierda.png"));
		this.image[2] = new ImageIcon(this.getClass().getResource("/img/Bobo_izquierda.png"));
		this.image[3] = new ImageIcon(this.getClass().getResource("/img/Bobo_derecha.png"));

	}
	
	public PrototipoEnemigo clone() {
		return this.clone();
	}
}
