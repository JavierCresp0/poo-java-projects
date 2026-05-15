package es.poo.practica2.main;

import es.poo.practica2.apoyo.Fecha;

public class Paypal extends MetodoPago implements IMostrable {

	/* Constantes */
	private static final String USUARIO = "Usuario:";
	private static final String FECHA = "Fecha de caduciada:";

	private String usuario;
	private int dia, mes, ano;

	/* Getters y Setters */

	/**
	 * Obtiene el nombre de usuario asociado a la cuenta de Paypal.
	 *
	 * @return El nombre de usuario de Paypal.
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Establece el nombre de usuario asociado a la cuenta de Paypal.
	 *
	 * @param usuario El nuevo nombre de usuario de Paypal.
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Obtiene el día de caducidad de la cuenta de Paypal.
	 *
	 * @return El día de caducidad de la cuenta de Paypal.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Establece el día de caducidad de la cuenta de Paypal si la fecha es válida.
	 *
	 * @param año El año de caducidad.
	 * @param mes El mes de caducidad.
	 * @param dia El día de caducidad.
	 */
	public void setDia(int ano, int mes, int dia) {
		if (Fecha.fechaValida(ano, mes, dia)) {
			this.dia = dia;
		}

	}

	/**
	 * Obtiene el mes de caducidad de la cuenta de Paypal.
	 *
	 * @return El mes de caducidad de la cuenta de Paypal.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Establece el mes de caducidad de la cuenta de Paypal si la fecha es válida.
	 *
	 * @param año El año de caducidad.
	 * @param mes El mes de caducidad.
	 * @param dia El día de caducidad.
	 */
	public void setMes(int ano, int mes, int dia) {
		if (Fecha.fechaValida(ano, mes, dia)) {
			this.mes = mes;
		}

	}

	/**
	 * Obtiene el año de caducidad de la cuenta de Paypal.
	 *
	 * @return El año de caducidad de la cuenta de Paypal.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Establece el año de caducidad de la cuenta de Paypal si la fecha es válida.
	 *
	 * @param ano El año de caducidad.
	 * @param mes El mes de caducidad.
	 * @param dia El día de caducidad.
	 */
	public void setAno(int ano, int mes, int dia) {
		if (Fecha.fechaValida(ano, mes, dia)) {
			this.ano = ano;
		}

	}

	/* Metodos */

	/**
	 * Obtiene una representación en cadena de la cuenta de Paypal.
	 *
	 * @return Una cadena que representa la cuenta de Paypal.
	 */
	@Override
	public String dameCadena() {
		String cadena = super.dameCadena();
		cadena = cadena + USUARIO + usuario + "\s";
		cadena = cadena + FECHA + dia + "/" + mes + "/" + ano + "/" + "\s";

		return cadena;
	}

}
