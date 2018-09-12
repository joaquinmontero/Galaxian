package Logica;
import Disparo.*;

import javax.swing.ImageIcon;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */

/**
 * Inicializa jugador con su respectiva velocidad, posicion X, posicion Y y puntos de vida
 * A�ade el conjunto de imagenes al arreglo de imagenes del jugador
 * @param v Int velocidad, x Int posicion en eje X, y Int posicion en eje Y, v Int puntos de vida
 */
public class Jugador extends Entidad {
	
	public Jugador(int velocidad,int x, int y,int vida) {

        super(velocidad,x,y,vida);
        this.image[0] = new ImageIcon(this.getClass().getResource("/img/Jugador_arriba.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/img/Jugador_abajo.png"));
		this.image[2] = new ImageIcon(this.getClass().getResource("/img/Jugador_izquierda.png"));
		this.image[3] = new ImageIcon(this.getClass().getResource("/img/Jugador_derecha.png"));
        
	}
	
	public void disparar(Entidad e) {
		Disparo disparo=new DisparoJugador(60,this.pos.x+10, this.pos.y+10,100);
		//informa a la entidad a la que le disparo que esta siendo disparada
		e.meDisparan(disparo);
	}
	
	public void dispararSuper(Entidad e) {
		Disparo disparo=new SuperDisparoJugador(60,this.pos.x+10, this.pos.y+10,100);
		//informa a la entidad a la que le disparo que esta siendo disparada
		e.meDisparan(disparo);
	}
	
	
	public void mover(int dir){	
	//El metodo esta modificado para que el jugador dispare con la flecha de arriba
	//y para que solo pueda moverse hacia los costados
		switch (dir) {
			case 0 : //Arriba
				cambiarGrafico(0);
				break;
			case 1 : //Abajo
				cambiarGrafico(1);
				break;
			case 2 : //Izquierda
				pos.setLocation(pos.x - velocidad, pos.y);
				cambiarGrafico(dir);
				break;
			case 3 : //Derecha
				pos.setLocation(pos.x + velocidad, pos.y);
				cambiarGrafico(dir);
				break;
		}
	}
	

	
}
