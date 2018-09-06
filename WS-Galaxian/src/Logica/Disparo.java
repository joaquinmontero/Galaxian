package Logica;

import javax.swing.ImageIcon;

public abstract class Disparo extends Entidad {
	
		int fuerzaImpacto;
		
		public Disparo(int velocidad, int x, int y,int vida) {

	        super(velocidad,x,y,vida);
	    }

		public abstract void atacar(Entidad e);
	}

