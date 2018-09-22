package Personaje.Enemigo;

import java.awt.Point;

import javax.swing.ImageIcon;

public class Kamikaze extends PrototipoEnemigo {
	public Kamikaze(Point pos) {
		super(pos);
		setGraficos();
	}
	
	private void setGraficos() {
		this.image[0] = new ImageIcon(this.getClass().getResource("/img/Kamikaze.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/img/Kamikaze.png"));
		this.image[2] = new ImageIcon(this.getClass().getResource("/img/Kamikaze.png"));
		this.image[3] = new ImageIcon(this.getClass().getResource("/img/Kamikaze.png"));

	}
	public PrototipoEnemigo clone() {
		return this.clone();
	}

}
