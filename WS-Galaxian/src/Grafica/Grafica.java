package Grafica;

import java.awt.EventQueue;
import Disparo.*;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import Logica.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import Mapa.Mapa;

@SuppressWarnings("serial")
public class Grafica extends JFrame {
	private EntidadGrafica panel_principal;
	private Mapa mapa;
	private Juego instanciaJuego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafica frame = new Grafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grafica() {
//		addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyReleased(KeyEvent arg0) {
//				escucharUsuario(arg0);
//			}
//		});
		getContentPane().setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 750, 600);
		panel_principal = new EntidadGrafica();
		panel_principal.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(panel_principal);
		panel_principal.setLayout(null);

		instanciaJuego = new Juego();
		setContentPane(instanciaJuego.getMapa().getGrafico());
	}

	public void agregarEntidades() {
		LinkedList<Entidad> entidades = mapa.getEntidades();
		for (Entidad e : entidades) {
			add(e.getGrafico());
		}
	}

	public void actualizarEntidades() {
		LinkedList<Entidad> entidades = mapa.getEntidades();
		for (Entidad e : entidades) {
			e.getGrafico().actualizarEntidad();
		}
	}

//	protected void escucharUsuario(KeyEvent key) {
//		int r = key.getKeyCode();
//		mapa.getJugador().keyListener(r);
//		if (r == KeyEvent.VK_UP) {
//			Disparo d = instanciaJuego.getMapa().getJugador().disparar();
//			add(d.getGrafico());
//			instanciaJuego.agregarDisparo(d);
//		}
//	}
}
