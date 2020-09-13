package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.VentanaJunior;
import co.edu.unbosque.view.VentanaMostrar;
import co.edu.unbosque.view.VentanaMostrarFijo;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VentanaRegistrar;
import co.edu.unbosque.view.VentanaRegistroComision;
import co.edu.unbosque.view.VentanaRegistroFijo;
import co.edu.unbosque.view.VentanaSenior;

public class Controller implements ActionListener {

	private VentanaPrincipal ventanaPrincipal;
	private VentanaRegistrar ventanaRegistro;
	private VentanaRegistroFijo ventanaRegistroFijo;
	private VentanaRegistroComision ventanaRegistroComision;
	private VentanaJunior ventanaJunior;
	private VentanaSenior ventanaSenior;
	public VentanaMostrar ventanaMostrar;
	public VentanaMostrarFijo ventanaMostrarFijo;

	public Controller() {
		ventanaPrincipal = new VentanaPrincipal();
		ventanaRegistro = new VentanaRegistrar();
		ventanaRegistroFijo = new VentanaRegistroFijo();
		ventanaRegistroComision = new VentanaRegistroComision();
		ventanaJunior = new VentanaJunior();
		ventanaSenior = new VentanaSenior();
		ventanaMostrar = new VentanaMostrar();
		ventanaMostrarFijo = new VentanaMostrarFijo	();
		asignarOyentes();
	}

	public void asignarOyentes() {
		ventanaPrincipal.getPanelPrincipal().getRegistrarEmpleado().addActionListener(this);
		ventanaPrincipal.getPanelPrincipal().getEliminarEmpleado().addActionListener(this);
		ventanaPrincipal.getPanelPrincipal().getMostrarEmpleado().addActionListener(this);
		ventanaPrincipal.getPanelPrincipal().getModificar().addActionListener(this);
		ventanaPrincipal.getPanelPrincipal().getSalir().addActionListener(this);
		ventanaRegistro.getPanelRegistrar().getBotonEmpleadoFijo().addActionListener(this);
		ventanaRegistro.getPanelRegistrar().getBotonEmpleadoPorComision().addActionListener(this);
		ventanaRegistro.getPanelRegistrar().getVolver().addActionListener(this);
		ventanaRegistroFijo.getPanelRegistroFijo().getVolver().addActionListener(this);
		ventanaRegistroFijo.getPanelRegistroFijo().getBotonJunior().addActionListener(this);
		ventanaRegistroFijo.getPanelRegistroFijo().getBotonSenior().addActionListener(this);
		ventanaJunior.getPanelJunior().getBotonAceptar().addActionListener(this);
		ventanaJunior.getPanelJunior().getVolver().addActionListener(this);
		ventanaSenior.getPanelSenior().getVolver().addActionListener(this);
		ventanaSenior.getPanelSenior().getBotonAceptar().addActionListener(this);
		ventanaRegistroComision.getPanelRegistroComision().getBotonAceptar().addActionListener(this);
		ventanaRegistroComision.getPanelRegistroComision().getVolver().addActionListener(this);
		ventanaMostrar.getPanelMostrar().getBotonMostrarComision().addActionListener(this);
		ventanaMostrar.getPanelMostrar().getBotonMostrarFijo().addActionListener(this);
		ventanaMostrar.getPanelMostrar().getVolverMostrar().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub

		String command = evento.getActionCommand();
//		Registro principal (regitra empleado)
		if (command.equals("REGISTRAREMPLEADO")) {
			ventanaPrincipal.setVisible(false);
			ventanaRegistro.setVisible(true);

		}
//		Mostrar Empleado
		if (command.equals("MOSTRAREMPLEADO")) {
			ventanaPrincipal.setVisible(false);
			ventanaMostrar.setVisible(true);
		}
//		Elimina empleado
		if (command.equals("ELIMINAREMPLEADO")) {
			JOptionPane.showMessageDialog(null, "Registro", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
//		Moificar
		if (command.equals("MODIFICAR")) {
			JOptionPane.showMessageDialog(null, "Registro", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
//		Salir
		if (command.equals("SALIR")) {
			System.exit(0);
		}
//		Empleado Registra Empleado fijo
		if (command.equals("BOTONEMPLEADOFIJO")) {

			ventanaRegistro.setVisible(false);
			ventanaRegistroFijo.setVisible(true);

		}

		if (command.equals("BOTONVOLVERFIJO")) {
			ventanaRegistroFijo.setVisible(false);
			ventanaRegistro.setVisible(true);
		}

//		Rgistra Empleado por comision
		if (command.equals("BOTONEMPLEADOPORCOMISION")) {
			ventanaRegistro.setVisible(false);
			ventanaRegistroComision.setVisible(true);

		}
//		Rgistra Empleado por comision
		if (command.equals("BOTONACEPTARCOMISION")) {
			ventanaRegistro.setVisible(false);
			ventanaRegistroComision.setVisible(false);
			
		}
//		Volver a Registro Fijo
		if (command.equals("BOTONVOLVERCOMISION")) {
			
			ventanaRegistroComision.setVisible(false);
			ventanaRegistroFijo.setVisible(true);
		}
		
		
//		volver registro a Principal
		if (command.equals("BOTONVOLVER")) {
			ventanaRegistro.setVisible(false);
			ventanaPrincipal.setVisible(true);

		}
//		Activar ventana Regitrar Junior FIJO
		if (command.equals("BOTONJUNIOR")) {

			ventanaRegistroFijo.setVisible(false);
			ventanaJunior.setVisible(true);

		}
//		Activar ventana senior
		if (command.equals("BOTONSENIOR")) {
			ventanaRegistroFijo.setVisible(false);
			ventanaSenior.setVisible(true);

		}
//		Desactiva ventana Senior
		if (command.equals("BOTONVOLVERSENIOR")) {
			ventanaSenior.setVisible(false);
			ventanaRegistroFijo.setVisible(true);

		}
//		Desactivar vntana Junior
		if (command.equals("BNTVOLVERJUNIOR")) {

			ventanaJunior.setVisible(false);
			ventanaRegistroFijo.setVisible(true);

		}
//		Aceptar (Registra) emplado junior
		if (command.equals("BOTONACEPTARJUNIOR")) {
			JOptionPane.showMessageDialog(null, "Se registró");
			ventanaJunior.setVisible(false);
			ventanaPrincipal.setVisible(true);

		}
//		Aceptar (Registra) emplado senior
		if (command.equals("BOTONACEPTARSENIOR")) {
			JOptionPane.showMessageDialog(null, "Se registró");
			ventanaSenior.setVisible(false);
			ventanaPrincipal.setVisible(true);

		}
//		mostrar Fijos
		if (command.equals("BOTONMOSTRARFIJO")) {
			ventanaMostrarFijo.setVisible(true);
			ventanaMostrar.setVisible(false);

		}

	}

}
