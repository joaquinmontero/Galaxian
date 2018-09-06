package Logica;

public class DisparoEnemigo extends Disparo {
	
	public DisparoEnemigo(int velocidad,int x, int y,int vida) {

        super(velocidad,x,y,vida);
        this.image[0] = new ImageIcon(this.getClass().getResource(".png"));
        fuerzaImpacto=5;
 }

public void atacar(Enemigo e) {
	
}

public void atacar(Jugador j) {
	j.setVida(j.getVida()-fuerzaImpacto);
}

public atacar(Obstaculo o) {
	o.setVida(o.getVida()-fuerzaImpacto);
}



}



