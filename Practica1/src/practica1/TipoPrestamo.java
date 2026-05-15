package practica1;

import java.util.ArrayList;

public class TipoPrestamo {

	/* Constantes */
	private static final String TIPO = "Tipo: ";
	private static final String IMP_MAX = "\n importeMaximo: ";
	private static final String PLA_MAX = "\n plazoMaximo: ";
	private static final String AÑOS = " Años";
	private static final String MESES = " Meses";
	private static final double TIPO1 = 0.0099;
	private static final double TIPO2 = 0.015;
	private static final double TIPO3 = 0.05;
	private static final double TIPO4 = 0.07;
	private static final int IMP_MAX1 = 200000;
	private static final int IMP_MAX2 = 300000;
	private static final int IMP_MAX3 = 15000;
	private static final int IMP_MAX4 = 30000;
	private static final int PLA_MAX1 = 20;
	private static final int PLA_MAX2 = 35;
	private static final int PLA_MAX3 = 48;
	private static final int PLA_MAX4 = 72;
	private static final int DOCE = 12;
	private static final int CIEN = 100;

	/* Atributos */
	private TPrestamo Tpres;
	private double tipo;
	private int importeMaximo;
	private int plazoMaximo;

	/* Setters y Getters */

	/**
	 * Obtiene el tipo de préstamo.
	 *
	 * @return El tipo de préstamo.
	 */
	public TPrestamo getTpres() {
		return Tpres;
	}

	/**
	 * Establece el tipo de préstamo.
	 *
	 * @param tpres El nuevo tipo de préstamo.
	 */
	public void setTpres(TPrestamo tpres) {
		Tpres = tpres;
	}

	/**
	 * Obtiene el tipo de interés del préstamo.
	 *
	 * @return El tipo de interés.
	 */
	public double getTipo() {
		return tipo;
	}

	/**
	 * Establece el tipo de interés del préstamo.
	 *
	 * @param tipo El nuevo tipo de interés.
	 */
	public void setTipo(double tipo) {
		this.tipo = tipo;
	}

	/**
	 * Obtiene el importe máximo permitido para el préstamo.
	 *
	 * @return El importe máximo permitido.
	 */
	public int getImporteMaximo() {
		return importeMaximo;
	}

	/**
	 * Establece el importe máximo permitido para el préstamo.
	 *
	 * @param importeMaximo El nuevo importe máximo permitido.
	 */
	public void setImporteMaximo(int importeMaximo) {
		this.importeMaximo = importeMaximo;
	}

	/**
	 * Obtiene el plazo máximo del préstamo en meses.
	 *
	 * @param tp El tipo de préstamo.
	 * @return El plazo máximo en meses.
	 */
	public int getPlazoMaximo(TPrestamo tp) {

		if (tp == TPrestamo.HIPOTECARIO) {
			return plazoMaximo * DOCE; // transforma los años a meses
		} else {
			return plazoMaximo;
		}

	}

	/**
	 * Establece el plazo máximo del préstamo en años.
	 *
	 * @param plazoMaximo El nuevo plazo máximo en años.
	 */
	public void setPlazoMaximo(int plazoMaximo) {
		this.plazoMaximo = plazoMaximo;
	}

	/* Metodos */

	/**
	 * Crea 4 objetos
	 * 
	 * @param tp El Tipo de prestamo elegido
	 * @return una array con los 4 objetos
	 */
	public static ArrayList<TipoPrestamo> damePrestamos(TPrestamo tp) {
		ArrayList<TipoPrestamo> tipo = new ArrayList<TipoPrestamo>();

		if (tp == TPrestamo.HIPOTECARIO) {
			TipoPrestamo tp1 = new TipoPrestamo();
			tp1.setTpres(TPrestamo.HIPOTECARIO);
			tp1.setTipo(TIPO1);
			tp1.setImporteMaximo(IMP_MAX1);
			tp1.setPlazoMaximo(PLA_MAX1);

			TipoPrestamo tp2 = new TipoPrestamo();
			tp2.setTpres(TPrestamo.HIPOTECARIO);
			tp2.setTipo(TIPO2);
			tp2.setImporteMaximo(IMP_MAX2);
			tp2.setPlazoMaximo(PLA_MAX2);

			tipo.add(tp1);
			tipo.add(tp2);

			return tipo;

		} else {
			TipoPrestamo tp3 = new TipoPrestamo();
			tp3.setTpres(TPrestamo.PERSONAL);
			tp3.setTipo(TIPO3);
			tp3.setImporteMaximo(IMP_MAX3);
			tp3.setPlazoMaximo(PLA_MAX3);

			TipoPrestamo tp4 = new TipoPrestamo();
			tp4.setTpres(TPrestamo.PERSONAL);
			tp4.setTipo(TIPO4);
			tp4.setImporteMaximo(IMP_MAX4);
			tp4.setPlazoMaximo(PLA_MAX4);

			tipo.add(tp3);
			tipo.add(tp4);

			return tipo;

		}

	}

	/**
	 * Metodo para pintar por pantalla los detalles de cada Tipo de prestamo
	 * 
	 * @param tp El Tipo de prestamo elegido
	 * @return Los datos a pintar
	 */
	public String dameCadena(TPrestamo tp) {

		if (tp == TPrestamo.HIPOTECARIO) {
			return TIPO + tipo * CIEN + "%" + IMP_MAX + "$" + importeMaximo + PLA_MAX + plazoMaximo + AÑOS;
		} else {
			return TIPO + tipo * CIEN + "%" + IMP_MAX + "$" + importeMaximo + PLA_MAX + plazoMaximo + MESES;

		}

	}

}
