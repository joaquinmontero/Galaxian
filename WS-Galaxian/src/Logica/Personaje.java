package Logica;
/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmín Pie Lopez
 *
 */
public abstract class Personaje extends Entidad{
	protected Imagen sprite;
	
	public Personaje(Imagen i) {
		sprite = new Imagen(i);
	}
}
