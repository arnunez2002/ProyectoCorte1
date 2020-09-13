package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelMostrar  extends JPanel {
	
	private JButton botonMostrarFijo, botonMostrarComision, volverMostrar;
	
	private static String BOTONMOSTRARFIJO = "BOTONMOSTRARFIJO";
	private static String BOTONMOSTRARCOMISION = "BOTONMOSTRARCOMISION";
	private static String VOLVERMOSTRAR = "VOLVERMOSTRAR";
	
	public PanelMostrar () {
		
		TitledBorder border = new TitledBorder("Registrar Empleado fijo");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		
		botonMostrarFijo = new JButton("Mostrar los empleados Fijos");
		botonMostrarFijo.setEnabled(true);
		botonMostrarFijo.setActionCommand("BOTONMOSTRARFIJO");
		
		botonMostrarComision = new JButton("Mostrar los empleados por Comision");
		botonMostrarComision.setEnabled(true);
		botonMostrarComision.setActionCommand("BOTONMOSTRARCOMISION");
		
		volverMostrar = new JButton("Volver");
		volverMostrar.setEnabled(true);
		volverMostrar.setActionCommand("VOLVERMOSTRAR");
		
		setLayout(new GridLayout(2, 2, 15, 15));
		
		
		add(botonMostrarFijo);
		add(botonMostrarComision);
		add(volverMostrar);
		
	}

	public JButton getBotonMostrarComision() {
		return botonMostrarComision;
	}

	public void setBotonMostrarComision(JButton botonMostrarComision) {
		this.botonMostrarComision = botonMostrarComision;
	}

	public JButton getVolverMostrar() {
		return volverMostrar;
	}

	public void setVolverMostrar(JButton volverMostrar) {
		this.volverMostrar = volverMostrar;
	}


	public static String getBOTONMOSTRARCOMISION() {
		return BOTONMOSTRARCOMISION;
	}

	public static void setBOTONMOSTRARCOMISION(String bOTONMOSTRARCOMISION) {
		BOTONMOSTRARCOMISION = bOTONMOSTRARCOMISION;
	}

	public static String getVOLVERMOSTRAR() {
		return VOLVERMOSTRAR;
	}

	public static void setVOLVERMOSTRAR(String vOLVERMOSTRAR) {
		VOLVERMOSTRAR = vOLVERMOSTRAR;
	}

	public JButton getBotonMostrarFijo() {
		return botonMostrarFijo;
	}

	public void setBotonMostrarFijo(JButton botonMostrarFijo) {
		this.botonMostrarFijo = botonMostrarFijo;
	}

	public static String getBOTONMOSTRARFIJO() {
		return BOTONMOSTRARFIJO;
	}

	public static void setBOTONMOSTRARFIJO(String bOTONMOSTRARFIJO) {
		BOTONMOSTRARFIJO = bOTONMOSTRARFIJO;
	}
	

}
