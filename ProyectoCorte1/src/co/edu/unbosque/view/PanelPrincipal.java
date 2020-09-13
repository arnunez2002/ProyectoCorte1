package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelPrincipal  extends JPanel{

	private JButton registrarEmpleado, mostrarEmpleado, eliminarEmpleado, modificar, salir;
	private static String REGISTRAREMPLEADO = "REGISTRAREMPLEADO";
	private static String MOSTRAREMPLEADO = "MOSTRAREMPLEADO";
	private static String ELIMINAREMPLEADO = "ELIMINAREMPLEADO";
	private static String MODIFICAR = "MODIFICARVEN";
	private static String SALIR = "SALIR";
	
	public PanelPrincipal () {
		
		
		TitledBorder border = new TitledBorder("Principal");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		
		
		
		registrarEmpleado = new JButton("Registrar");
		registrarEmpleado.setEnabled(true);
		registrarEmpleado.setActionCommand("REGISTRAREMPLEADO");
		
		mostrarEmpleado = new JButton("Mostrar");
		mostrarEmpleado.setEnabled(true);
		mostrarEmpleado.setActionCommand("MOSTRAREMPLEADO");
		
		eliminarEmpleado = new JButton("Eliminar");
		eliminarEmpleado.setEnabled(true);
		eliminarEmpleado.setActionCommand("MOSTRAREMPLEADO");
		
		modificar = new JButton("Modificar");
		modificar.setEnabled(true);
		modificar.setActionCommand("MODIFICAR");
		
		salir = new JButton("Salir");
		salir.setEnabled(true);
		salir.setActionCommand("SALIR");
		
		setLayout(new GridLayout(3, 2, 20, 20));
		
		add(registrarEmpleado);
		add(mostrarEmpleado);
		add(eliminarEmpleado);
		add(modificar);
		add(salir);
	}

	public JButton getRegistrarEmpleado() {
		return registrarEmpleado;
	}

	public void setRegistrarEmpleado(JButton registrarEmpleado) {
		this.registrarEmpleado = registrarEmpleado;
	}

	public JButton getMostrarEmpleado() {
		return mostrarEmpleado;
	}

	public void setMostrarEmpleado(JButton mostrarEmpleado) {
		this.mostrarEmpleado = mostrarEmpleado;
	}

	public JButton getEliminarEmpleado() {
		return eliminarEmpleado;
	}

	public void setEliminarEmpleado(JButton eliminarEmpleado) {
		this.eliminarEmpleado = eliminarEmpleado;
	}

	public JButton getModificar() {
		return modificar;
	}

	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}

	public JButton getSalir() {
		return salir;
	}

	public void setSalir(JButton salir) {
		this.salir = salir;
	}

	public static String getREGISTRAREMPLEADO() {
		return REGISTRAREMPLEADO;
	}

	public static void setREGISTRAREMPLEADO(String rEGISTRAREMPLEADO) {
		REGISTRAREMPLEADO = rEGISTRAREMPLEADO;
	}

	public static String getMOSTRAREMPLEADO() {
		return MOSTRAREMPLEADO;
	}

	public static void setMOSTRAREMPLEADO(String mOSTRAREMPLEADO) {
		MOSTRAREMPLEADO = mOSTRAREMPLEADO;
	}

	public static String getELIMINAREMPLEADO() {
		return ELIMINAREMPLEADO;
	}

	public static void setELIMINAREMPLEADO(String eLIMINAREMPLEADO) {
		ELIMINAREMPLEADO = eLIMINAREMPLEADO;
	}

	public static String getMODIFICAR() {
		return MODIFICAR;
	}

	public static void setMODIFICAR(String mODIFICAR) {
		MODIFICAR = mODIFICAR;
	}

	public static String getSALIR() {
		return SALIR;
	}

	public static void setSALIR(String sALIR) {
		SALIR = sALIR;
	}

	
}
