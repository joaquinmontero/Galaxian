package Mapa;
import java.util.*;
import GUI.*;
import Logica.*;
import Enemigo.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */
public abstract class Mapa {
	protected final int ENEMIGOSXFILA=10;
    protected final int distHorizontal=120;
    protected final int distVertical=120;
    protected final int w=1200;
    protected final int h=1200;
	protected Jugador jugador;
	protected LinkedList<Enemigo> enemigos;   
	protected LinkedList<Entidad> entidades;
    protected int filas;
    protected Icon image;
    


 public Mapa(int filas) {
	 //Inicia lista enemigos
	 	enemigos=new LinkedList<Enemigo>();
	 //Inicia lista entidades
	 	entidades=new LinkedList<Entidad>();
	
	//Inicia la cantidad de filas que aparecer�n de enemigos, varia segun el nivel 
	 	this.filas=filas;
	//Crea y aniade el jugador a la GUI abajo del todo en el centro  	
	 	jugador = new Jugador(100, 300, 450, 100); 	
	 	entidades.add(jugador);
	 	
	 	
	//Aniade dos enemigos de cada clase en la primer fila
		Enemigo e;
		int posicionVertical=0;
		int posicionHorizontal=0;
		for(int i=0;i<2;i++){
			e=new Bobo(20,posicionHorizontal,posicionVertical,100);
			posicionHorizontal += distHorizontal;
			enemigos.add(e);      
			entidades.add(e);
			e=new Bomba(40,posicionHorizontal,posicionVertical,100);
			posicionHorizontal += distHorizontal;
			enemigos.add(e);      
			entidades.add(e);
			e=new Kamikaze(40,posicionHorizontal,posicionVertical,100);
			posicionHorizontal += distHorizontal;
			enemigos.add(e);      
			entidades.add(e);
			e=new Cambiante(30,posicionHorizontal,posicionVertical,100);
			posicionHorizontal += distHorizontal;
			enemigos.add(e);      
			entidades.add(e);
			e=new Perdedor(30,posicionHorizontal,posicionVertical,100);
			posicionHorizontal += distHorizontal;
			enemigos.add(e);      
			entidades.add(e);
		}
		
	
    //Aniade enemigos al mapa de manera random, siempre habra diez enemigos por fila
	//La cantidad de filas cambia en base al nivel
		posicionVertical=distVertical;
        for (int i = 1; i < filas; ++i) {
        	posicionHorizontal=0;
            for (int j = 0; j < ENEMIGOSXFILA; j++) {
            	Random r=new Random();
            	int n= r.nextInt(5);
            	
            	if((n%5)==0 ) {
            		e=new Bobo(20,posicionHorizontal,posicionVertical,100);
            		enemigos.add(e);      
            		entidades.add(e);}
            	else {
            		if((n%5)==1 ) {
            			e=new Kamikaze(40,posicionHorizontal,posicionVertical,100);
            			enemigos.add(e);     
            			entidades.add(e);}
            		else {
            			if((n%5)==2 ) {
            				e=new Bomba(40,posicionHorizontal,posicionVertical,100);
            				enemigos.add(e);      
            				entidades.add(e);}
            			else {
            				if((n%5)==3 ) {
            					e=new Cambiante(30,posicionHorizontal,posicionVertical,100);
            					enemigos.add(e);      
            					entidades.add(e);}
            				else {
           					if((n%5)==4 ) {
            						e=new Perdedor(30,posicionHorizontal,posicionVertical,100);
            						enemigos.add(e);                
            						entidades.add(e);
           					}
            			}
            		}
            	}
            }
        	
               posicionHorizontal += distHorizontal;
           }
          posicionVertical += distVertical;
       }
    }
 	 
 	/**
	 *Devuelve la lista de enemigos actualmente en el juego
	 * @return Lista de Enemigos
	 */
 	public LinkedList<Enemigo> enemigos () {
 		return enemigos;
 	}
 	
 	/**
	 * Devuelve al jugador
	 * @ return El jugador
	 */
 	public Jugador jugador() {
 		return jugador;
 	}
 	
 	
 	public LinkedList<Entidad> entidades(){
 		return entidades;
 	}
 	
 	public JLabel getGrafico(){
 		JLabel grafico = new JLabel(image);
		grafico.setBounds(0, 0, w, h);	
		return grafico;
	}

	
}
