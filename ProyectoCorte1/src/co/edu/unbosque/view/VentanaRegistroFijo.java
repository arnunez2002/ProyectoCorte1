package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaRegistroFijo  extends JFrame {
	
	
 public PanelRegistroFijo panelRegistroFijo;
	
	public VentanaRegistroFijo () {

		setTitle("Registar Empleado");
		this.setSize(450, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		panelRegistroFijo = new PanelRegistroFijo();
		getContentPane().add(panelRegistroFijo);
		this.setVisible(false);
	}

	public PanelRegistroFijo getPanelRegistroFijo() {
		return panelRegistroFijo;
	}

	public void setPanelRegistroFijo(PanelRegistroFijo panelRegistroFijo) {
		this.panelRegistroFijo = panelRegistroFijo;
	}


	
}
