package Logica;

public class Nivel_3 extends Mapa{
	
	public Nivel_3(GUI gui) {
		super(gui,3);
		
		Obstaculo o=new Destruible();
		o=new Destruible(0,(gui.getWidth()/4)*2,99,100);
		gui.add(o.getGrafico());
		
		o=new ObjetosPreciosos(0,(gui.getWidth()/4)*3,99,100);
		gui.add(o.getGrafico());
		
		
		Random r=new Random();
		int n=r.nextInt(10);
		Enemigo e=enemigos.get(n);
		e.entregaPremio(true);
		Premio p= new Magia();
		e.asignarPremio(p);
		
		n=r.nextInt(30);
		e=enemigos.get(n);
		e.entregaPremio(true);
		p= new Proteccion();
		e.asignarPremio(p);
		
		n=r.nextInt(30);
		e=enemigos.get(n);
		e.entregaPremio(true);
		p= new Pocion();
		e.asignarPremio(p);
		
		n=r.nextInt(30);
		e=enemigos.get(n);
		e.entregaPremio(true);
		p= new SuperArma();
		e.asignarPremio(p);
	}
}

}
