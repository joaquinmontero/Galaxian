package GUI;

	import Logica.Juego;

	public class TiempoDisparo extends Thread {

		private Juego elJuego;

		TiempoDisparo(Juego j) {
			this.elJuego = j;
		}

		public void run() {
			while(true){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			elJuego.moverDisparo();
			}
		}
	}

