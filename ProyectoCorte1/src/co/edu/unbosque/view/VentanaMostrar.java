package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaMostrar  extends JFrame{

	public PanelMostrar panelMostrar;
	
	public VentanaMostrar	() {
		
		setTitle("Mostrar Empleados");
		this.setSize(550, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		panelMostrar = new PanelMostrar();
		getContentPane().add(panelMostrar);
		this.setVisible(false);
	}

	public PanelMostrar getPanelMostrar() {
		return panelMostrar;
	}

	public void setPanelMostrar(PanelMostrar panelMostrar) {
		this.panelMostrar = panelMostrar;
	}
	
	
}
