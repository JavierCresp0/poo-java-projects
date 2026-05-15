package es.poo.practica2.main;

public class MetodoPago implements IMostrable {

	/* Constantes */
	private static final String DESCRIPCION = "Descripcion:";

	/* Atributos */
	protected String texto;

	/* Getters y Setters */
	/**
	 * Obtiene la descripción del método de pago.
	 *
	 * @return La descripción del método de pago.
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * Establece la descripción del método de pago.
	 *
	 * @param texto La nueva descripción del método de pago.
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/* Metodos */

	/**
	 * Obtiene una representación en cadena del método de pago.
	 *
	 * @return Una cadena que representa el método de pago.
	 */
	@Override
	public String dameCadena() {
		String cadena = "";
		cadena = cadena + DESCRIPCION + texto + "\s";

		return cadena;
	}

}
