package Grafica;

import javax.swing.Icon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class EntidadGrafica extends JLabel {
	Icon defaultIcon;
	
	public EntidadGrafica() {}
	public EntidadGrafica(Icon ico) {
		defaultIcon = ico;
	}

	public void actualizarEntidad() {
		this.repaint();
	}
}
