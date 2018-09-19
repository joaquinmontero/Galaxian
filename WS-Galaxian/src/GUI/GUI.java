package GUI;
import java.awt.EventQueue;
import Disparo.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Logica.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Juego;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 * 
 * @author Araceli Iglesias, Sol Stiep, Yasmin Pie Lopez
 *
 */


public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private Juego j;
	private ContadorTiempo tiempo;
	private TiempoDisparo tiempoDisparo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				mover(arg0);
			}
		});
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		j = new Juego();
		setContentPane(j.getMapa().getGrafico());
		agregarEntidades();
		
		tiempo = new ContadorTiempo(j,120);
		tiempo.start();
		tiempoDisparo= new TiempoDisparo(j,120);
		tiempoDisparo.start();
		
		
	}
	
	protected void agregarEntidades() {
		LinkedList<Entidad> entidades=j.getMapa().entidades();
		for(Entidad e:entidades) {
			add(e.getGrafico());
		}
	}
	
	
	
	protected void mover(KeyEvent key){
		int r=key.getKeyCode();
		j.mover(r);
		if(r==KeyEvent.VK_UP) {
			Disparo d=j.getMapa().jugador().disparar();
			add(d.getGrafico());
			j.agregarDisparo(d);
		}
		this.repaint();
	}
}
