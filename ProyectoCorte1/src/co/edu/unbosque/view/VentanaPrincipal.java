package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame  {

	public PanelPrincipal panelPrincipal;
	public VentanaPrincipal() {
		
		setTitle("Ventana Principal");
		this.setSize(350, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		panelPrincipal = new PanelPrincipal();
		getContentPane().add(panelPrincipal);
		this.setVisible(true);
	}
	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}
	public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	
	
	
	
	
}
