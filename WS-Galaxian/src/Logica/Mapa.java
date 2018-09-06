package Logica;
import java.util.*;
import GUI.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmín Pie Lopez
 *
 */
public abstract class Mapa {
	protected final int ENEMIGOSXFILA=10;
    protected final int distHorizontal=33;
    protected final int distVertical=33;
    protected final int w=330;
    protected final int h=330;
	protected Jugador jugador;
	protected Collection<Enemigo> enemigos;   
    protected int filas;
    protected JLabel grafico;
    


 public Mapa(GUI gui,int filas) {
	 
		grafico = new JLabel(new ImageIcon(this.getClass().getResource("img/Fondo_nivel_1.png")));
		grafico.setBounds(0, 0, w, h);
	 
	 	this.filas=filas;
	 	
	 	jugador = new Jugador(10, gui.getHeight()+32, (gui.getWidth()/2)+32, 100);
		gui.add(jugador.getGrafico());
       
		int posicionVertical ;
        int posicionHorizontal;
        Enemigo e;
        for (int i = 0; i < filas; ++i) {

        	posicionHorizontal=(gui.getWidth()-330)/2;
            posicionVertical = posicionVertical+distVertical;

            for (int j = 0; j < ENEMIGOSXFILA; j++) {
            	Random r=new Random();
            	int n= r.nextInt(5);
            	
            	if((j%5)==0 ) 
            		e=new Bobo(2,posicionHorizontal,posicionVertical,100);
            	else {
            		if((j%5)==1 ) 
            			e=new Kamikaze(4,posicionHorizontal,posicionVertical,100);
            		else {
            			if((j%5)==2 ) 
            				e=new Bomba(4,posicionHorizontal,posicionVertical,100);
            			else {
            				if((j%5)==3 ) 
            					e=new Cambiante(3,posicionHorizontal,posicionVertical,100);
            				else {
            					if((j%5)==4 ) 
            						e=new Perdedor(3,posicionHorizontal,posicionVertical,100);
            				}
            			}
            		}
            	}
                enemigos.add(e);
                gui.add(e.getGrafico());
                posicionHorizontal += distHorizontal;
            }
        }
    }

	
}
