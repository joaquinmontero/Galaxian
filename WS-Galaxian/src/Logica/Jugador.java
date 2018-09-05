package Logica;

import javax.swing.ImageIcon;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, YasmÃ­n Pie Lopez
 *
 */
public class Jugador extends Personaje {
	
	public Jugador(ImageIcon i) {
		super(i);
		x=400;
		y=600;   // ubicaciones en el mapa, suponiendo que el tamaño total es 800x600
	}
	
}
