package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaRegistroComision  extends JFrame {
	
	
 public PanelRegistroComision panelRegistroComision;
	
	public VentanaRegistroComision () {

		setTitle("Registar Empleado");
		this.setSize(450, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		panelRegistroComision = new PanelRegistroComision();
		getContentPane().add(panelRegistroComision);
		this.setVisible(false);
	}

	public PanelRegistroComision getPanelRegistroComision() {
		return panelRegistroComision;
	}

	public void setPanelRegistroComision(PanelRegistroComision panelRegistroComision) {
		this.panelRegistroComision = panelRegistroComision;
	}

	
	
}
