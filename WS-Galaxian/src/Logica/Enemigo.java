package Logica;
/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmín Pie Lopez
 *
 */
public abstract class Enemigo extends Personaje {
	Inteligencia i;
	boolean regala;
	Premio premio;
	
	protected Enemigo(int velocidad,int x, int y, int v) {
		super(velocidad,x,y,v);
		regala=false;
	}
	
	public void asignarInteligencia(Inteligencia i) {
		this.i=i;
	}
	
	public void entregaPremio(boolean b) {
		premio=b;
	}
	public Premio premio() {
		return premio;
	}
	
	public void asignarPremio(Premio p) {
		premio=p;
	}

}
