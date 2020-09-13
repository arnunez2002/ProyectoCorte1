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

public class PanelRegistrar extends JPanel{

	

	
	private JButton  volver, botonEmpleadoFijo, botonEmpleadoPorComision;
	private static String BOTONEMPLEADOFIJO = "BOTONEMPLEADOFIJO";
	private static String BOTONEMPLEADOPORCOMISION = "BOTONEMPLEADOPORCOMISION";
	private static String BOTONVOLVER = "BOTONVOLVER";
	
	public PanelRegistrar () {
		
		
		TitledBorder border = new TitledBorder("Registarar Empleado");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		
		botonEmpleadoFijo = new JButton("Empleado Fijo");
		botonEmpleadoFijo.setEnabled(true);
		botonEmpleadoFijo.setActionCommand("BOTONEMPLEADOFIJO");
		
		botonEmpleadoPorComision = new JButton("Empleado por Comisión");
		botonEmpleadoPorComision.setEnabled(true);
		botonEmpleadoPorComision.setActionCommand("BOTONEMPLEADOPORCOMISION");
		
		volver = new JButton("Volver");
		volver.setEnabled(true);
		volver.setActionCommand("BOTONVOLVER");
		
		setLayout(new GridLayout(3, 2, 20, 20));
		
		add(botonEmpleadoFijo);
		add(botonEmpleadoPorComision);
		add(volver);
		
		
	}

	

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public JButton getBotonEmpleadoFijo() {
		return botonEmpleadoFijo;
	}

	public void setBotonEmpleadoFijo(JButton botonEmpleadoFijo) {
		this.botonEmpleadoFijo = botonEmpleadoFijo;
	}

	public JButton getBotonEmpleadoPorComision() {
		return botonEmpleadoPorComision;
	}

	public void setBotonEmpleadoPorComision(JButton botonEmpleadoPorComision) {
		this.botonEmpleadoPorComision = botonEmpleadoPorComision;
	}

	public static String getBOTONEMPLEADOFIJO() {
		return BOTONEMPLEADOFIJO;
	}

	public static void setBOTONEMPLEADOFIJO(String bOTONEMPLEADOFIJO) {
		BOTONEMPLEADOFIJO = bOTONEMPLEADOFIJO;
	}

	public static String getBOTONEMPLEADOPORCOMISION() {
		return BOTONEMPLEADOPORCOMISION;
	}

	public static void setBOTONEMPLEADOPORCOMISION(String bOTONEMPLEADOPORCOMISION) {
		BOTONEMPLEADOPORCOMISION = bOTONEMPLEADOPORCOMISION;
	}

	public static String getBOTONVOLVER() {
		return BOTONVOLVER;
	}

	public static void setBOTONVOLVER(String bOTONVOLVER) {
		BOTONVOLVER = bOTONVOLVER;
	}

	


	
	
	
}
