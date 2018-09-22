package Mapa;

public class Nivel_2 extends nivelActual {
	private int cantidadEnemigos = 18;
	private int cantidadRestante = cantidadEnemigos;
	
	public Nivel_2() {
		iniciarNivel();
	}

	protected nivelActual iniciarNivel() {
		return null;
	}

	public boolean nivelCompletado() {
		return false;
	}

	public nivelActual nivelSiguiente() {
		return null;
	}
	
	
}
