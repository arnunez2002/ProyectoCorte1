package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaMostrarFijo extends JFrame{

	private PanelMostrarFijo panelMostrarFijo;
	
	public VentanaMostrarFijo () {
		setTitle("Mostrar Empleados Fijos");
		this.setSize(550, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		panelMostrarFijo = new PanelMostrarFijo();
		getContentPane().add(panelMostrarFijo);
		this.setVisible(false);
	}

	public PanelMostrarFijo getPanelMostrarFijo() {
		return panelMostrarFijo;
	}

	public void setPanelMostrarFijo(PanelMostrarFijo panelMostrarFijo) {
		this.panelMostrarFijo = panelMostrarFijo;
	}
	
}
