package Disparo;
import javax.swing.ImageIcon;
import Logica.*;
import Obstaculo.*;
import Personaje.*;
import Personaje.Enemigo.Enemigo;
/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */
public class DisparoEnemigo extends Disparo {
	
	/**
	 * Inicializa DisparoEnemigo con su respectiva velocidad, posicion X, posicion Y y puntos de vida
	 * A�ade el conjunto de imagenes al arreglo de imagenes del DisparoEnemigo
	 * @param v Int velocidad, x Int posicion en eje X, y Int posicion en eje Y, v Int puntos de vida
	 */
	public DisparoEnemigo(int velocidad,int x, int y,int vida) {

        super(velocidad,x,y,vida);
        this.image[0] = new ImageIcon(this.getClass().getResource("/img/Disparo_1.png"));
        this.image[1] = new ImageIcon(this.getClass().getResource("/img/Disparo_1.png"));
        this.image[2] = new ImageIcon(this.getClass().getResource("/img/Disparo_1.png"));
        this.image[3] = new ImageIcon(this.getClass().getResource("/img/Disparo_1.png"));
        fuerzaImpacto=5;
	}

	/**
	 * No modifica al enemigo atacado
	 * @param e Enemigo a atacar
	 */
	public void atacar(Enemigo e) {
	
	}

	/**
	 * Modifica la vida del Jugador atacado
	 * @param j Jugador a atacar
	 */
	public void atacar(Jugador j) {
		j.setVida(j.getVida()-fuerzaImpacto);
	}

	
	/**
	 * Modifica la vida del obstaculo atacado
	 * @param Obstaculo a atacar
	 */
	
	public void atacar(Obstaculo o) {
		o.setVida(o.getVida()-fuerzaImpacto);
	}



}



