package Logica;

public class Nivel_2 extends Mapa {

	public Nivel_2(GUI gui) {
		super(gui,2);
		
		Obstaculo o=new Destruible();
		o=new Destruible(0,gui.getWidth()/2,66,100);
		
		Random r=new Random();
		int n=r.nextInt(10);
		Enemigo e=enemigos.get(n);
		e.entregaPremio(true);
		Premio p= new Magia();
		e.asignarPremio(p);
	}
}
