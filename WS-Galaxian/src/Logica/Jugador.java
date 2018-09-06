package Logica;

import javax.swing.ImageIcon;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmín Pie Lopez
 *
 */
public class Jugador extends Personaje {
	Arma arma;
	
	public Jugador(int velocidad,int x, int y,int vida) {

        super(velocidad,x,y,vida);
        this.image[0] = new ImageIcon(this.getClass().getResource("img/Jugador_normal.png"));
        arma=new ArmaJugador();
	}
	
	public void disparar(Entidad e) {
		Disparo d=arma.crearDisparo();
		e.meDisparan(d);
	}
	
	public void asignarArma(Arma a) {
		arma=a;
	}
	
	public void modificarAlcanceArma(int a) {
		arma.setAlcance(a);
	}

	public void modificarImpactoArma(int p) {
		arma.setImpacto(p);
	}
	
}
