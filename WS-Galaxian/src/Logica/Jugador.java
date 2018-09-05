package Logica;

import javax.swing.ImageIcon;

/**
 * 
 * @author Araceli Iglesias, Maria Sol Stiep, YasmÃ­n Pie Lopez
 *
 */
public class Jugador extends Personaje {
	
	public Jugador(ImageIcon i) {
		super(i);
		x=400;
		y=600;   // ubicaciones en el mapa, suponiendo que el tamaño total es 800x600
	}

	public void agregarArma() {
		arma=new Intermedia();
	}

	public void modificarAlcanceArma(int a) {
		arma.setAlcance(a);
	}

	public void modificarPuntosGolpeArma(int p) {
		arma.setPuntosGolpe(p);
	}
	
}
