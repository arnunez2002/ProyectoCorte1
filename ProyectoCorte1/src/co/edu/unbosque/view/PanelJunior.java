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

public class PanelJunior extends JPanel{
	
	private JLabel etiquetaNombre;
	private JLabel etiquetaApellido;
	private JLabel etiquetaCedula;
	private JLabel etiquetaGenero;
	private JLabel etiquetaTelefono;
	private JLabel etiquetaCorreo;
	private JLabel etiqueNivel;
	private JLabel etiquetaAñoIngreso;
	private JLabel etiquetaDireccion;
	private JLabel etiquetaAñosServicion;
	
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JComboBox<String> genero;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JComboBox<String> niveles;
	private JComboBox<String> tipoDePeronal;
	private JTextField txtAñoIngreso;
	private JTextField txtAñoDireccion;
	private JComboBox<String>  AñosServicion;
	
	private JButton botonAceptar, volver;
	private static String BNTVOLVERJUNIOR = "BNTVOLVERJUNIOR";
	private static String BOTONACEPTARJUNIOR = "BOTONACEPTARJUNIOR";
	
	public PanelJunior () {
		
		
		TitledBorder border = new TitledBorder("Registrar Empleado fijo");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		
		
		
		etiquetaNombre = new JLabel("Nombre:");
		etiquetaApellido = new JLabel("Apellido:");
		etiquetaCedula = new JLabel("Cedula:");
		etiquetaGenero = new JLabel("Genero:");
		etiquetaTelefono = new JLabel("Telefono:");
		etiquetaCorreo = new JLabel("Correo:");
		etiqueNivel = new JLabel("Nivel del Empleado");
		etiquetaAñoIngreso = new JLabel("Año de Ingreso");
		etiquetaDireccion = new JLabel("Direccion");
		etiquetaAñosServicion = new JLabel("Años de laborados");
		
		txtNombre = new JTextField(10);
		txtApellido = new JTextField(10);
		txtCedula = new JTextField(10);
		
		genero = new JComboBox<>();
		genero.addItem("Seleccione...");
		genero.addItem("Masculino");
		genero.addItem("Femenino");
		
		txtTelefono = new JTextField(10);
		
		niveles = new JComboBox<>();
		niveles.addItem("Seleccione...");
		niveles.addItem("Nivel 1");
		niveles.addItem("Nivel 2");
		niveles.addItem("Nivel 3");
		niveles.addItem("Nivel 4");
		niveles.addItem("Nivel 5");
		
		tipoDePeronal = new JComboBox<>();
		tipoDePeronal.addItem("Seleccione...");
		tipoDePeronal.addItem("Salario fijo");
		tipoDePeronal.addItem("Salario de comision");
		
		
		txtCorreo = new JTextField(10);
		txtAñoIngreso = new JTextField(10);
		txtAñoDireccion = new JTextField(10);
		
		botonAceptar = new JButton("Aceptar");
		botonAceptar.setEnabled(true);
		botonAceptar.setActionCommand("BOTONACEPTARJUNIOR");
		
		volver = new JButton("Volver");
		volver.setEnabled(true);
		volver.setActionCommand("BNTVOLVERJUNIOR");
		
		AñosServicion = new JComboBox<>();
		AñosServicion.addItem("Seleccione...");
		AñosServicion.addItem("0 a 2 años");
		AñosServicion.addItem("2 a 3 años");
		AñosServicion.addItem("4 a 7 años");
		AñosServicion.addItem("8 a 15 años");
		AñosServicion.addItem("más de 15 años");
		
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
		add(etiqueNivel);
		add(niveles);
		add(etiquetaAñoIngreso);
		add(txtAñoIngreso);
		add(etiquetaDireccion);
		add(txtAñoDireccion);
		add(etiquetaAñosServicion);
		add(AñosServicion);
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


	public JLabel getEtiquetaAreaT() {
		return etiqueNivel;
	}


	public void setEtiquetaAreaT(JLabel etiquetaAreaT) {
		this.etiqueNivel = etiquetaAreaT;
	}


	public static String getBNTVOLVERJUNIOR() {
		return BNTVOLVERJUNIOR;
	}


	public static void setBNTVOLVERJUNIOR(String bNTVOLVERJUNIOR) {
		BNTVOLVERJUNIOR = bNTVOLVERJUNIOR;
	}


	public JLabel getEtiquetaAñoIngreso() {
		return etiquetaAñoIngreso;
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


	public JComboBox<String> getAreaTrabajo() {
		return niveles;
	}


	public void setAreaTrabajo(JComboBox<String> areaTrabajo) {
		niveles = areaTrabajo;
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
		return txtAñoDireccion;
	}


	public void setTxtAñoDireccion(JTextField txtAñoDireccion) {
		this.txtAñoDireccion = txtAñoDireccion;
	}


	public JLabel getEtiquetaDireccion() {
		return etiquetaDireccion;
	}


	public void setEtiquetaDireccion(JLabel etiquetaDireccion) {
		this.etiquetaDireccion = etiquetaDireccion;
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

	public JLabel getEtiqueNivel() {
		return etiqueNivel;
	}


	public void setEtiqueNivel(JLabel etiqueNivel) {
		this.etiqueNivel = etiqueNivel;
	}


	public JLabel getEtiquetaAñosServicion() {
		return etiquetaAñosServicion;
	}


	public void setEtiquetaAñosServicion(JLabel etiquetaAñosServicion) {
		this.etiquetaAñosServicion = etiquetaAñosServicion;
	}


	public JComboBox<String> getNiveles() {
		return niveles;
	}


	public void setNiveles(JComboBox<String> niveles) {
		this.niveles = niveles;
	}


	public JComboBox<String> getAñosServicion() {
		return AñosServicion;
	}


	public void setAñosServicion(JComboBox<String> añosServicion) {
		AñosServicion = añosServicion;
	}


	public static String getBNTVOLVERFIJO() {
		return BNTVOLVERJUNIOR;
	}


	public static void setBNTVOLVERFIJO(String bNTVOLVERFIJO) {
		BNTVOLVERJUNIOR = bNTVOLVERFIJO;
	}


	public static String getBOTONACEPTARJUNIOR() {
		return BOTONACEPTARJUNIOR;
	}


	public static void setBOTONACEPTARJUNIOR(String bOTONACEPTARJUNIOR) {
		BOTONACEPTARJUNIOR = bOTONACEPTARJUNIOR;
	}


	
	
}
