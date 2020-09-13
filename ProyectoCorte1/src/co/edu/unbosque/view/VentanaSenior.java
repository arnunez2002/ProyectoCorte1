package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaSenior  extends JFrame {
	
	
 public PanelSenior panelSenior;
	
	public VentanaSenior () {

		setTitle("Registar Empleado");
		this.setSize(450, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		panelSenior = new PanelSenior();
		getContentPane().add(panelSenior);
		this.setVisible(false);
	}

	public PanelSenior getPanelSenior() {
		return panelSenior;
	}

	public void setPanelSenior(PanelSenior panelSenior) {
		this.panelSenior = panelSenior;
	}





	
}
