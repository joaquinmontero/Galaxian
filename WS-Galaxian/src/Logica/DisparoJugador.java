package Logica;

public class DisparoJugador extends Disparo {
	
	public DisparoJugador(int velocidad,int x, int y,int vida) {

	        super(velocidad,x,y,vida);
	        this.image[0] = new ImageIcon(this.getClass().getResource(".png"));
	        fuerzaImpacto=10;
	 }
	
	public void atacar(Enemigo e) {
		e.setVida(e.getVida()-fuerzaImpacto);

	}
	
	public void atacar(Jugador j) {
	}
	
	public void atacar(Obstaculo o) {
		o.setVida(o.getVida()-fuerzaImpacto);
	}
	
	

}
