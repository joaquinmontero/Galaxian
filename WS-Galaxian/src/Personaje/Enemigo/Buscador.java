package Personaje.Enemigo;

import java.awt.Point;

import javax.swing.ImageIcon;

public class Buscador extends PrototipoEnemigo {
	public Buscador(Point pos) {
		super(pos);
		this.image[0] = new ImageIcon(this.getClass().getResource("/img/Bomba.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/img/Bomba.png"));
		this.image[2] = new ImageIcon(this.getClass().getResource("/img/Bomba.png"));
		this.image[3] = new ImageIcon(this.getClass().getResource("/img/Bomba.png"));
	}
	
	public PrototipoEnemigo clone() {
		return this.clone();
	}
}
