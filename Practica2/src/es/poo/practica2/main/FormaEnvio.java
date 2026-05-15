package es.poo.practica2.main;

import java.util.ArrayList;

public class FormaEnvio implements IMostrable {

	/* Constantes */
	private static final String TEXTO1 = " Entrega hoy ";
	private static final String TEXTO2 = " Envío 1 día ";
	private static final String TEXTO3 = " Envío exprés ";
	private static final String TEXTO4 = " Envío estándar ";
	private static final double nuemro1 = 9.99;
	private static final double nuemro2 = 5;
	private static final double nuemro3 = 3.45;
	private static final double nuemro4 = 0;
	private static final String PLAZO1 = " mismo día ";
	private static final String PLAZO2 = " al día siguiente ";
	private static final String PLAZO3 = " 3 días laborales ";
	private static final String PLAZO4 = " 5 días laborales ";

	/* Atributos */
	private String texto;
	private double coste;
	private String plazo;

	/* Getters y Setters */

	/**
	 * Obtiene el texto asociado a la forma de envío.
	 *
	 * @return El texto de la forma de envío.
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * Establece el texto asociado a la forma de envío.
	 *
	 * @param texto El nuevo texto de la forma de envío.
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * Obtiene el coste asociado a la forma de envío.
	 *
	 * @return El coste de la forma de envío.
	 */
	public double getCoste() {
		return coste;
	}

	/**
	 * Establece el coste asociado a la forma de envío.
	 *
	 * @param coste El nuevo coste de la forma de envío.
	 */
	public void setCoste(double coste) {
		this.coste = coste;
	}

	/**
	 * Obtiene el plazo de entrega asociado a la forma de envío.
	 *
	 * @return El plazo de entrega de la forma de envío.
	 */
	public String getPlazo() {
		return plazo;
	}

	/**
	 * Establece el plazo de entrega asociado a la forma de envío.
	 *
	 * @param plazo El nuevo plazo de entrega de la forma de envío.
	 */
	public void setPlazo(String plazo) {
		this.plazo = plazo;
	}

	/* Metodos */

	/**
	 * Obtiene una lista de formas de envío predefinidas.
	 *
	 * @return Una lista de formas de envío predefinidas.
	 */
	public static ArrayList<FormaEnvio> damePrestamos() {
		ArrayList<FormaEnvio> forma = new ArrayList<FormaEnvio>();

		FormaEnvio forma1 = new FormaEnvio();
		forma1.setTexto(TEXTO1);
		forma1.setCoste(nuemro1);
		forma1.setPlazo(PLAZO1);

		FormaEnvio forma2 = new FormaEnvio();
		forma2.setTexto(TEXTO2);
		forma2.setCoste(nuemro2);
		forma2.setPlazo(PLAZO2);

		FormaEnvio forma3 = new FormaEnvio();
		forma3.setTexto(TEXTO3);
		forma3.setCoste(nuemro3);
		forma3.setPlazo(PLAZO3);

		FormaEnvio forma4 = new FormaEnvio();
		forma4.setTexto(TEXTO4);
		forma4.setCoste(nuemro4);
		forma4.setPlazo(PLAZO4);

		forma.add(forma1);
		forma.add(forma2);
		forma.add(forma3);
		forma.add(forma4);

		return forma;

	}

	/**
	 * Genera una cadena de texto que representa la forma de envío.
	 *
	 * @return Una cadena de texto que representa la forma de envío.
	 */
	@Override
	public String dameCadena() {
		String cadena = "";
		cadena = cadena + texto + ("(") + coste + ("€,") + plazo + (")");

		return cadena;

	}
}
