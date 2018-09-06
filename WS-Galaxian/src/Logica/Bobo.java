package Logica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import GUI.*;

public class Bobo extends Inteligencia {
	private JLabel grafico;
	
	public Bobo() {
		grafico = new JLabel(new ImageIcon(this.getClass().getResource("img/Enemigo_normal.png")));
	}
	
}
