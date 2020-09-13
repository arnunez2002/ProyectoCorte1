package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaJunior  extends JFrame {
	
	
 public PanelJunior panelJunior;
	
	public VentanaJunior () {

		setTitle("Registar Empleado");
		this.setSize(450, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		panelJunior = new PanelJunior();
		getContentPane().add(panelJunior);
		this.setVisible(false);
	}

	public PanelJunior getPanelJunior() {
		return panelJunior;
	}

	public void setPanelJunior(PanelJunior panelJunior) {
		this.panelJunior = panelJunior;
	}



	
}
