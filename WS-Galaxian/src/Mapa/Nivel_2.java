package Mapa;
import GUI.* ;
import Obstaculo.*;
import Premio.*;
import Enemigo.*;


import java.util.Random;

import javax.swing.ImageIcon;

import Mapa.*;
/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */

/**
 * Inicializa el mapa con su respectiva cantidad de filas de enemigos y con obstaculo
 * @param GUI donde ubicara al jugador, enemigos y obstaculos
 */

public class Nivel_2 extends Mapa {

	public Nivel_2() {
		super(2);
		image=new ImageIcon(this.getClass().getResource("/img/universo.gif"));
	/**	
		Obstaculo o=new Destruible();
		o=new Destruible(0,gui.getWidth()/2,66,100);
		
		Random r=new Random();
		int n=r.nextInt(10);
		Enemigo e=enemigos.get(n);
		e.entregaPremio(true);
		Premio p= new Magia();
		e.asignarPremio(p);
		*/
	}

}
