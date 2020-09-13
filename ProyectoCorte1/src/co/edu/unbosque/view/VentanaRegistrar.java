package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaRegistrar  extends JFrame {
	
	
	public PanelRegistrar panelRegistrar;

	
	public VentanaRegistrar () {

		setTitle("Mostrar Empleados");
		this.setSize(450, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		panelRegistrar = new PanelRegistrar();
		getContentPane().add(panelRegistrar);
		this.setVisible(false);
	}


	public PanelRegistrar getPanelRegistrar() {
		return panelRegistrar;
	}


	public void setPanelRegistrar(PanelRegistrar panelRegistrar) {
		this.panelRegistrar = panelRegistrar;
	}
	
	
}
