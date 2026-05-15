package es.poo.practica2.main;

import es.poo.practica2.apoyo.Fecha;

public class TarjetaCredito extends MetodoPago {

	/* Atributos */
	private TipoTarjeta tarjeta;
	private String numero;
	private int mes;
	private int ano;
	private String cvc;
	private String titular;

	/* Getters y Setters */

	/**
	 * Obtiene el tipo de tarjeta.
	 *
	 * @return El tipo de tarjeta.
	 */
	public TipoTarjeta getTarjeta() {
		return tarjeta;
	}

	/**
	 * Establece el tipo de tarjeta.
	 *
	 * @param tarjeta El nuevo tipo de tarjeta.
	 */
	public void setTarjeta(TipoTarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	/**
	 * Obtiene el número de la tarjeta.
	 *
	 * @return El número de la tarjeta.
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Establece el número de la tarjeta.
	 *
	 * @param numero El nuevo número de la tarjeta.
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Obtiene el mes de caducidad de la tarjeta.
	 *
	 * @return El mes de caducidad.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Establece el mes de caducidad de la tarjeta.
	 *
	 * @param mes El nuevo mes de caducidad.
	 */
	public void setMes(int ano, int mes) {
		if (Fecha.fechaValida(ano, mes)) {
			this.mes = mes;
		}

	}

	/**
	 * Obtiene el año de caducidad de la tarjeta.
	 *
	 * @return El año de caducidad.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Establece el año de caducidad si la fecha es válida.
	 *
	 * @param año El año de nacicaducidadmiento.
	 * @param mes El mes de caducidad.
	 */
	public void setAno(int ano, int mes) {
		if (Fecha.fechaValida(ano, mes)) {
			this.ano = ano;
		}

	}

	/**
	 * Establece el código de verificación (CVC) de la tarjeta.
	 *
	 * @param cvc El nuevo código de verificación.
	 */
	public void setCvc(String cvc) {
		// Verificar si el CVC tiene exactamente 3 caracteres
		if (cvc.length() == 3) {
			// Verificar si todos los caracteres son dígitos
			for (char c : cvc.toCharArray()) {
				if (!Character.isDigit(c)) {
					this.cvc = cvc;
				}
			}
		}

	}

	/**
	 * Obtiene el titular de la tarjeta.
	 *
	 * @return El titular de la tarjeta.
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * Establece el titular de la tarjeta.
	 *
	 * @param titular El nuevo titular de la tarjeta.
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/* Metodos */

	/**
	 * Método que valida un CVC (Código de Verificación de la Tarjeta) de tres
	 * dígitos.
	 *
	 * @param cvc El CVC a validar.
	 * @return true si el CVC es válido (exactamente 3 caracteres y todos dígitos),
	 *         false de lo contrario.
	 */
	public static boolean validarCVC(String cvc) {
		// Verificar si el CVC tiene exactamente 3 caracteres
		if (cvc.length() == 3) {
			// Verificar si todos los caracteres son dígitos
			for (char c : cvc.toCharArray()) {
				if (!Character.isDigit(c)) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método que verifica si una cadena parece ser un número de tarjeta de crédito.
	 *
	 * @param cadena La cadena a verificar.
	 * @return true si la cadena parece ser un número de tarjeta de crédito, false
	 *         de lo contrario.
	 */
	public static boolean validarNumero(String cadena) {
		// Eliminar espacios en blanco de la cadena
		cadena = cadena.replaceAll("\\s", "");

		// Verificar la longitud de la cadena
		if (cadena.length() != 16) {
			return false;
		}

		// Verificar si todos los caracteres son dígitos
		for (char c : cadena.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}

		// La cadena parece ser un número de tarjeta de crédito
		return true;
	}

}
