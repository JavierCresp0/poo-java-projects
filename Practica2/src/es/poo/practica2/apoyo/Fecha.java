package es.poo.practica2.apoyo;

import java.util.Calendar;
import java.util.Date;

public class Fecha {

	/* Constantes */
	private static final String ANO_INV = "Año inválido.";
	private static final String NO_SUP = "La fecha no puede ser superior a la fecha actual.";
	private static final int UNO = 1;
	private static final String NO_INF = "La fecha no puede ser inferior a la fecha actual.";

	/**
	 * Verifica si una fecha es válida y no es superior a la fecha actual.
	 *
	 * @param year       El año de la fecha.
	 * @param month      El mes de la fecha (1-12).
	 * @param dayOfMonth El día del mes.
	 * @return true si la fecha es válida y no es superior a la fecha actual, false
	 *         si no lo es.
	 */
	public static boolean fechaValida(int year, int month, int dayOfMonth) {
		boolean resultado = true;

		try {
			if (year < 1900) {
				throw new IllegalArgumentException(ANO_INV);
			}

			Calendar calendar = Calendar.getInstance();
			// Se debe especificar para solo permitir fechas válidas
			calendar.setLenient(false);
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month - UNO); // [0,...,11]
			calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

			// Verificar que la fecha no sea superior a la fecha actual
			Date fechaIngresada = calendar.getTime();
			Date fechaActual = new Date();

			if (fechaIngresada.after(fechaActual)) {
				throw new IllegalArgumentException(NO_SUP);
			}

		} catch (Exception e) {
			resultado = false;
		}

		return resultado;
	}

	/**
	 * Verifica si una fecha es válida y no inferior a la fecha actual.
	 *
	 * @param year  El año de la fecha.
	 * @param month El mes de la fecha (1-12).
	 * @return true si la fecha es válida y no inferior a la actual, false si no lo
	 *         es.
	 */
	public static boolean fechaValida(int year, int month) {
		boolean resultado = true;

		try {
			if (year < 1900) {
				throw new IllegalArgumentException(ANO_INV);
			}

			Calendar calendar = Calendar.getInstance();
			// Se debe especificar para solo permitir fechas válidas
			calendar.setLenient(false);
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month - 1); // [0,...,11]

			// Asumir que el día es correcto (por ejemplo, día 1)
			calendar.set(Calendar.DAY_OF_MONTH, 1);

			// Verificar que la fecha no sea inferior a la fecha actual
			Date fechaIngresada = calendar.getTime();
			Date fechaActual = new Date();

			if (fechaIngresada.before(fechaActual)) {
				throw new IllegalArgumentException(NO_INF);
			}

		} catch (Exception e) {
			resultado = false;
		}

		return resultado;
	}

	/**
	 * Verifica si una fecha es válida y no inferior a la fecha actual.
	 *
	 * @param year       El año de la fecha.
	 * @param month      El mes de la fecha (1-12).
	 * @param dayOfMonth El día del mes.
	 * @return true si la fecha es válida y no inferior a la actual, false si no lo
	 *         es.
	 */
	public static boolean fechaValida3(int year, int month, int dayOfMonth) {
		boolean resultado = true;

		try {
			if (year < 1900) {
				throw new IllegalArgumentException(ANO_INV);
			}

			Calendar calendar = Calendar.getInstance();
			// Se debe especificar para solo permitir fechas válidas
			calendar.setLenient(false);
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month - 1); // [0,...,11]
			calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

			// Verificar que la fecha no sea inferior a la fecha actual
			Date fechaIngresada = calendar.getTime();
			Date fechaActual = new Date();

			if (fechaIngresada.before(fechaActual)) {
				throw new IllegalArgumentException(NO_INF);
			}

		} catch (Exception e) {
			resultado = false;
		}

		return resultado;
	}
}
