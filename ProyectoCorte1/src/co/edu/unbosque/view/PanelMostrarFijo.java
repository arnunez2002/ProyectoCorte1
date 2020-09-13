package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelMostrarFijo extends JPanel{
	
	private JButton botonJunior, botonSenior;
	
	private JButton  volver;
	private static String BOTONJUNIORMOSTRAR = "BOTONJUNIORMOSTRAR";
	private static String BOTONSENIORMOSTRAR = "BOTONSENIORMOSTRAR";
	private static String BOTONVOLVERMOSTRARFIJO = "BOTONVOLVERMOSTRARFIJO";
	
	public PanelMostrarFijo () {
		
		TitledBorder border = new TitledBorder("Registrar Empleado fijo");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		
		botonJunior = new JButton("Mostrar Junior");
		botonJunior.setEnabled(true);
		botonJunior.setActionCommand("BOTONJUNIORMOSTRAR");
		
		botonSenior = new JButton("Mostrar Senior");
		botonSenior.setEnabled(true);
		botonSenior.setActionCommand("BOTONSENIORMOSTRAR");
		
		volver = new JButton("Volver");
		volver.setEnabled(true);
		volver.setActionCommand("BOTONVOLVERMOSTRARFIJO");
		
		setLayout(new GridLayout(2, 2, 15, 15));
		
		add(botonJunior);
		add(botonSenior);
		add(volver);
		
	}

	public JButton getBotonJunior() {
		return botonJunior;
	}

	public void setBotonJunior(JButton botonJunior) {
		this.botonJunior = botonJunior;
	}

	public JButton getBotonSenior() {
		return botonSenior;
	}

	public void setBotonSenior(JButton botonSenior) {
		this.botonSenior = botonSenior;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public static String getBOTONJUNIORMOSTRAR() {
		return BOTONJUNIORMOSTRAR;
	}

	public static void setBOTONJUNIORMOSTRAR(String bOTONJUNIORMOSTRAR) {
		BOTONJUNIORMOSTRAR = bOTONJUNIORMOSTRAR;
	}

	public static String getBOTONSENIORMOSTRAR() {
		return BOTONSENIORMOSTRAR;
	}

	public static void setBOTONSENIORMOSTRAR(String bOTONSENIORMOSTRAR) {
		BOTONSENIORMOSTRAR = bOTONSENIORMOSTRAR;
	}

	public static String getBOTONVOLVERMOSTRARFIJO() {
		return BOTONVOLVERMOSTRARFIJO;
	}

	public static void setBOTONVOLVERMOSTRARFIJO(String bOTONVOLVERMOSTRARFIJO) {
		BOTONVOLVERMOSTRARFIJO = bOTONVOLVERMOSTRARFIJO;
	}
	
}
