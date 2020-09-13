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

public class PanelRegistroComision extends JPanel{
	
	private JLabel etiquetaNombre;
	private JLabel etiquetaApellido;
	private JLabel etiquetaCedula;
	private JLabel etiquetaGenero;
	private JLabel etiquetaTelefono;
	private JLabel etiquetaCorreo;
	private JLabel etiquetaAñoIngreso;
	private JLabel etiquetaDireccion;
	private JLabel etiquetaClientes;
	
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JComboBox<String> genero;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JComboBox<String> tipoDePeronal;
	private JTextField txtAñoIngreso;
	private JTextField txtDireccion;
	private JTextField txtAñoClientes;
	
	private JButton botonAceptar, volver;
	private static String BOTONVOLVERCOMISION = "BOTONVOLVERCOMISION";
	private static String BOTONACEPTARCOMISION = "BOTONACEPTARCOMISION";
	
	public PanelRegistroComision () {
		
		
		TitledBorder border = new TitledBorder("Registrar Empleado Comision");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		
		
		
		etiquetaNombre = new JLabel("Nombre:");
		etiquetaApellido = new JLabel("Apellido:");
		etiquetaCedula = new JLabel("Cedula:");
		etiquetaGenero = new JLabel("Genero:");
		etiquetaTelefono = new JLabel("Telefono:");
		etiquetaCorreo = new JLabel("Correo:");
		etiquetaAñoIngreso = new JLabel("Año de Ingreso");
		etiquetaDireccion = new JLabel("Direccion");
		etiquetaClientes = new JLabel ("Clientes captados");
		
		txtNombre = new JTextField(10);
		txtApellido = new JTextField(10);
		txtCedula = new JTextField(10);
		
		genero = new JComboBox<>();
		genero.addItem("Masculino");
		genero.addItem("Femenino");
		
		txtTelefono = new JTextField(10);
		
		tipoDePeronal = new JComboBox<>();
		tipoDePeronal.addItem("Salario fijo");
		tipoDePeronal.addItem("Salario de comision");
		
		
		txtCorreo = new JTextField(10);
		txtAñoIngreso = new JTextField(10);
		txtDireccion = new JTextField(10);
		txtAñoClientes = new JTextField(10);
		
		botonAceptar = new JButton("Aceptar");
		botonAceptar.setEnabled(true);
		botonAceptar.setActionCommand("BOTONACEPTARCOMISION");
		
		volver = new JButton("Volver");
		volver.setEnabled(true);
		volver.setActionCommand("BOTONVOLVERCOMISION");
		
		setLayout(new GridLayout(6, 2));
		
		add(etiquetaNombre);
		add(txtNombre);
		add(etiquetaApellido);
		add(txtApellido);
		add(etiquetaCedula);
		add(txtCedula);
		add(etiquetaGenero);
		add(genero);
		add(etiquetaTelefono);
		add(txtTelefono);
		add(etiquetaCorreo);
		add(txtCorreo);
		add(etiquetaAñoIngreso);
		add(txtAñoIngreso);
		add(etiquetaDireccion);
		add(txtDireccion);
		add(etiquetaClientes);
		add(txtAñoClientes);
		add(txtAñoClientes);
		add(botonAceptar);
		add(volver);
		
		
	}


	public JLabel getEtiquetaNombre() {
		return etiquetaNombre;
	}


	public void setEtiquetaNombre(JLabel etiquetaNombre) {
		this.etiquetaNombre = etiquetaNombre;
	}


	public JLabel getEtiquetaApellido() {
		return etiquetaApellido;
	}


	public void setEtiquetaApellido(JLabel etiquetaApellido) {
		this.etiquetaApellido = etiquetaApellido;
	}


	public JLabel getEtiquetaCedula() {
		return etiquetaCedula;
	}


	public void setEtiquetaCedula(JLabel etiquetaCedula) {
		this.etiquetaCedula = etiquetaCedula;
	}


	public JLabel getEtiquetaGenero() {
		return etiquetaGenero;
	}


	public void setEtiquetaGenero(JLabel etiquetaGenero) {
		this.etiquetaGenero = etiquetaGenero;
	}


	public JLabel getEtiquetaTelefono() {
		return etiquetaTelefono;
	}


	public void setEtiquetaTelefono(JLabel etiquetaTelefono) {
		this.etiquetaTelefono = etiquetaTelefono;
	}


	public JLabel getEtiquetaCorreo() {
		return etiquetaCorreo;
	}


	public void setEtiquetaCorreo(JLabel etiquetaCorreo) {
		this.etiquetaCorreo = etiquetaCorreo;
	}




	public void setEtiquetaAñoIngreso(JLabel etiquetaAñoIngreso) {
		this.etiquetaAñoIngreso = etiquetaAñoIngreso;
	}


	public JLabel getEtiquetaAñoDireccion() {
		return etiquetaDireccion;
	}


	public void setEtiquetaAñoDireccion(JLabel etiquetaAñoDireccion) {
		this.etiquetaDireccion = etiquetaAñoDireccion;
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtApellido() {
		return txtApellido;
	}


	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}


	public JTextField getTxtCedula() {
		return txtCedula;
	}


	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}


	public JComboBox<String> getGenero() {
		return genero;
	}


	public void setGenero(JComboBox<String> genero) {
		this.genero = genero;
	}


	public JTextField getTxtTelefono() {
		return txtTelefono;
	}


	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}


	public JTextField getTxtCorreo() {
		return txtCorreo;
	}


	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	public JComboBox<String> getTipoDePeronal() {
		return tipoDePeronal;
	}


	public void setTipoDePeronal(JComboBox<String> tipoDePeronal) {
		this.tipoDePeronal = tipoDePeronal;
	}


	public JTextField getTxtAñoIngreso() {
		return txtAñoIngreso;
	}


	public void setTxtAñoIngreso(JTextField txtAñoIngreso) {
		this.txtAñoIngreso = txtAñoIngreso;
	}


	public JTextField getTxtAñoDireccion() {
		return txtDireccion;
	}


	public void setTxtAñoDireccion(JTextField txtAñoDireccion) {
		this.txtDireccion = txtAñoDireccion;
	}


	public JLabel getEtiquetaDireccion() {
		return etiquetaDireccion;
	}


	public void setEtiquetaDireccion(JLabel etiquetaDireccion) {
		this.etiquetaDireccion = etiquetaDireccion;
	}


	public JLabel getEtiquetaClientes() {
		return etiquetaClientes;
	}


	public void setEtiquetaClientes(JLabel etiquetaClientes) {
		this.etiquetaClientes = etiquetaClientes;
	}


	public JTextField getTxtAñoClientes() {
		return txtAñoClientes;
	}


	public void setTxtAñoClientes(JTextField txtAñoClientes) {
		this.txtAñoClientes = txtAñoClientes;
	}


	public JButton getBotonAceptar() {
		return botonAceptar;
	}


	public void setBotonAceptar(JButton botonAceptar) {
		this.botonAceptar = botonAceptar;
	}


	public JButton getVolver() {
		return volver;
	}


	public void setVolver(JButton volver) {
		this.volver = volver;
	}




	public JTextField getTxtDireccion() {
		return txtDireccion;
	}


	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}


	public static String getBOTONVOLVERCOMISION() {
		return BOTONVOLVERCOMISION;
	}


	public static void setBOTONVOLVERCOMISION(String bOTONVOLVERCOMISION) {
		BOTONVOLVERCOMISION = bOTONVOLVERCOMISION;
	}


	public static String getBOTONACEPTARCOMISION() {
		return BOTONACEPTARCOMISION;
	}


	public static void setBOTONACEPTARCOMISION(String bOTONACEPTARCOMISION) {
		BOTONACEPTARCOMISION = bOTONACEPTARCOMISION;
	}


	public JLabel getEtiquetaAñoIngreso() {
		return etiquetaAñoIngreso;
	}
	
	
}
