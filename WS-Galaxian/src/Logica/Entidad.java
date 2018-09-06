package Logica;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;

/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmín Pie Lopez
 *
 */
public abstract class Entidad {
	
	protected JLabel grafico;
	protected Icon image[];
	protected final int width = 32;
	protected final int height = 32;
	
	protected int velocidad;
	protected int vida;
	
	protected Point pos;
	
	protected Entidad(int velocidad, int x, int y,int vida) {
		this.pos = new Point(x, y);
		this.velocidad = velocidad;
		this.vida=vida;
		this.image = new Icon[4];
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public Point getPos() {
		return pos;
	}
	
	public int getVida() { 
		return vida;
	}
	
	public void setVida(int v) {
			vida=v;}
	
	protected void cambiarGrafico(int dir){
		if(this.grafico != null){
			this.grafico.setIcon(this.image[dir]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
	}
	
	public void mover(int dir){	
		switch (dir) {
			case 0 : //Arriba
				pos.setLocation(pos.x, pos.y - velocidad);
				break;
			case 1 : //Abajo
				pos.setLocation(pos.x, pos.y + velocidad);
				break;
			case 2 : //Izquierda
				pos.setLocation(pos.x - velocidad, pos.y);
				break;
			case 3 : //Derecha
				pos.setLocation(pos.x + velocidad, pos.y);
				break;
		}
		cambiarGrafico(dir);
	}
	
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(image[0]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
		
		return this.grafico;
	}
	
	public void meDisparan(Disparo d) {
		d.atacar(this);
	}
	

}



