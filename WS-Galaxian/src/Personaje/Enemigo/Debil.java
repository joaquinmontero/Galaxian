package Personaje.Enemigo;

import java.awt.Point;

import javax.swing.ImageIcon;

public class Debil extends PrototipoEnemigo {
	public Debil(Point pos) {
		super(pos);
		this.image[0] = new ImageIcon(this.getClass().getResource("/img/Kamikaze.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/img/Kamikaze.png"));
		this.image[2] = new ImageIcon(this.getClass().getResource("/img/Kamikaze.png"));
		this.image[3] = new ImageIcon(this.getClass().getResource("/img/Kamikaze.png"));
	}
	
	public PrototipoEnemigo clone() {
		return this.clone();
	}
}
