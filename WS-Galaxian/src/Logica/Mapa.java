package Logica;
import java.util.*;

import javax.swing.ImageIcon;
/**
 * 
 * @author Araceli Iglesias, Maria Sol Stiep, Yasmín Pie Lopez
 *
 */
public abstract class Mapa {
	
	protected int x=800,y=600; 
	
	protected Personaje jugador;
	protected int cantidadEnemigos=10;
	protected Collection<Personaje> enemigos;
	protected ImageIcon fondoEspacial, imagenJugador,imagenEnemigo;
	protected int funcionEnemigos=x/cantidadEnemigos; // determina la posicion del eje y en donde agregar al enemigo
	
	public Mapa(ImageIcon f,ImageIcon jug,ImageIcon en) {
		imagenJugador=jug;
		imagenEnemigo=en;
		fondoEspacial=f;
		// hay que agregar las imagenes del fondo, jugador y enemigo
		// agregar al mapa al jugador con jugador.getX()  y   jugador.getY()
		Enemigo e;
		int i,j;
		// Creo jugador y lista de enemigos. 
		jugador =new Jugador(imagenJugador);
		enemigos=new LinkedList<Personaje>();			
		// creo los enemigos y los voy agregando al mapa y a la lista
		// hay que partir el for dependiendo de la cantidad de enemigos con distintas inteligencias
		// enemigos kamikaze
		for (i=0;i<3;i++) {
			e=new Enemigo(imagenEnemigo, i,i*funcionEnemigos);
			enemigos.add(e);
			// agregarle la inteligencia que le corresponde a e
			// falta agregar al mapa con e.getX()   y   e.getY()
		}
		// enemigos con armas
		for(j=i;j<2;j++) {
			e=new Enemigo(imagenEnemigo, j,j*funcionEnemigos);
			enemigos.add(e);
			// agregarle la inteligencia que le corresponde a e
			// falta agregar al mapa con e.getX()   y   e.getY()
		}
		// completar si es que faltan enemigos 
		for(int z=j;z<cantidadEnemigos;z++) {
			e=new Enemigo(imagenEnemigo, z,z*funcionEnemigos);
			enemigos.add(e);
			// agregarle la inteligencia que le corresponde a e
			// falta agregar al mapa con e.getX()   y   e.getY()
		}
			
		
	}
}
