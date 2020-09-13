package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelRegistroFijo extends JPanel {

	private JButton botonJunior, botonSenior;

	private JButton  volver;
	private static String BOTONJUNIOR = "BOTONJUNIOR";
	private static String BOTONSENIOR = "BOTONSENIOR";
	private static String BOTONVOLVERFIJO = "BOTONVOLVERFIJO";

	public PanelRegistroFijo() {

		TitledBorder border = new TitledBorder("Registrar Empleado fijo");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);

		botonJunior = new JButton("Junior");
		botonJunior.setEnabled(true);
		botonJunior.setActionCommand("BOTONJUNIOR");

		botonSenior = new JButton("Senior");
		botonSenior.setEnabled(true);
		botonSenior.setActionCommand("BOTONSENIOR");


		volver = new JButton("Volver");
		volver.setEnabled(true);
		volver.setActionCommand("BOTONVOLVERFIJO");

		setLayout(new GridLayout(5, 2));

		add(botonJunior);
		add(botonSenior);
		add(volver);

	}

	

	

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public static String getBOTONVOLVERFIJO() {
		return BOTONVOLVERFIJO;
	}

	public static void setBOTONVOLVERFIJO(String bOTONVOLVERFIJO) {
		BOTONVOLVERFIJO = bOTONVOLVERFIJO;
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



	public static String getBOTONJUNIOR() {
		return BOTONJUNIOR;
	}



	public static void setBOTONJUNIOR(String bOTONJUNIOR) {
		BOTONJUNIOR = bOTONJUNIOR;
	}



	public static String getBOTONSENIOR() {
		return BOTONSENIOR;
	}



	public static void setBOTONSENIOR(String bOTONSENIOR) {
		BOTONSENIOR = bOTONSENIOR;
	}

}
