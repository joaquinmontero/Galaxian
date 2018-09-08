package GUI;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Logica.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


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
		setBounds(0, 0, 1200, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		j = new Juego(this);
		tiempo = new ContadorTiempo(j);
		tiempo.start();
	}
	
	protected void mover(KeyEvent key){
		j.mover(key.getKeyCode());
		
		this.repaint();
	}
}
