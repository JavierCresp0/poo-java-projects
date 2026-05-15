package es.poo.practica2.main;

import java.util.ArrayList;

public class Cliente implements IMostrable {

	/* Constantes */
	private static final String CORREO = "Correo:";
	private static final String APELLIDOS = "Apellidos:";
	private static final String DIRECCION = "Direccion";

	/* Atreibutos */
	private String correo;
	private String nombre;
	private String apellidos;
	private String direccion;

	/* Getters y Setters */
	/**
	 * Obtiene el correo del cliente.
	 * 
	 * @return El correo del cliente.
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Establece el correo del cliente.
	 * 
	 * @param correo El nuevo correo del cliente.
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Obtiene el nombre del cliente.
	 * 
	 * @return El nombre del cliente.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del cliente.
	 * 
	 * @param nombre El nuevo nombre del cliente.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene los apellidos del cliente.
	 * 
	 * @return Los apellidos del cliente.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Establece los apellidos del cliente.
	 * 
	 * @param apellidos Los nuevos apellidos del cliente.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Obtiene la dirección del cliente.
	 * 
	 * @return La dirección del cliente.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Establece la dirección del cliente.
	 * 
	 * @param direccion La nueva dirección del cliente.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Implementación del método de la interfaz IMostrable para obtener una cadena
	 * de texto con la información del cliente.
	 * 
	 * @return Cadena de texto con la información del cliente.
	 */
	@Override
	public String dameCadena() {
		String cadena = "";
		cadena = cadena + CORREO + correo + "\s";
		cadena = cadena + APELLIDOS + apellidos + "\s";
		cadena = cadena + DIRECCION + direccion + "\s";

		return cadena;
	}

}
