

	package GUI;
	/**
	 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
	 */

	import Logica.*;

	public class TiempoDisparo extends Thread {

		private Juego elJuego;

		TiempoDisparo(Juego j) {
			this.elJuego = j;
		}

		public void run() {
			while(true){
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			elJuego.moverDisparos();
			}
		}
	}

