package es.poo.practica2.main;

import java.util.ArrayList;

public abstract class Producto implements IMostrable {

	/* Atributos */
	protected String codigo;
	protected String descripcion;
	protected double precioSin;
	protected double impuestos;
	protected double total;

	/* Getters y Setters */
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioSin() {
		return precioSin;
	}

	public void setPrecioSin(double precioSin) {
		this.precioSin = precioSin;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	/* Constructor */
	/**
	 * Constructor de la clase Pedido. Inicializa la lista de líneas de pedido.
	 */
	public Producto() {
		impuestos = 0.21;
	}

	/* Metodos */
	@Override
	/**
	 * Método que genera una cadena de texto con la información del producto.
	 * 
	 * @return Cadena de texto con la información del producto.
	 */
	public String dameCadena() {
		String cadena = "";
		cadena = cadena + codigo + "\s\s\s";
		cadena = cadena + descripcion + "\s\s\s\s\s\s\s\s";
		cadena = cadena + precioSin + "\s\s\s\s\s";
		cadena = cadena + impuestos * precioSin + "\s\s\s\s\s\s\s";
		cadena = cadena + total + "\s\s\s\s";

		return cadena;

	}

	/**
	 * Método abstracto que debe ser implementado por las subclases para devolver
	 * una lista de productos específica.
	 * 
	 * @return Lista de productos específica.
	 */
	public abstract ArrayList<? extends Producto> obtenerElementos();

}
