package es.poo.practica2.apoyo;

import java.util.Scanner;

public class Utilidades {

	/* Constantes */
	private static final String INCORRECTO = "Carácter incorrecto. Ingrese una letra válida";
	private static final String INGRESE = "Ingrese un número entero";
	private static final int CERO = 0;
	private static final int UNO = 1;
	private static final Scanner scanIn = new Scanner(System.in);

	/**
	 * Obtiene una letra válida a partir de las letras permitidas.
	 * 
	 * @param letrasPermitidas Cadena que contiene las letras permitidas.
	 * @return La letra ingresada por el usuario.
	 */
	public static char obtenerLetraValida(String letrasPermitidas) {
		String entrada;

		do {
			entrada = scanIn.next().toUpperCase();

			if (!Character.isLetter(entrada.charAt(CERO)) || letrasPermitidas.indexOf(entrada) == -UNO) {
				System.out.println(INCORRECTO);
			}
		} while (!Character.isLetter(entrada.charAt(CERO)) || letrasPermitidas.indexOf(entrada) == -UNO);

		scanIn.nextLine();
		return entrada.charAt(CERO);
	}

	/**
	 * Imprime un mensaje en la consola y obtiene una cadena de texto ingresada por
	 * el usuario.
	 * 
	 * @param cadena Mensaje que se va a imprimir.
	 * @return La cadena ingresada por el usuario.
	 */
	public static String imprimir(String cadena) {
		System.out.println(cadena);
		return scanIn.nextLine();
	}

	/**
	 * Obtiene un número entero ingresado por el usuario.
	 * 
	 * @param mensaje Mensaje que se va a mostrar para solicitar el número.
	 * @return El número entero ingresado por el usuario.
	 */
	public static int obtenerEntero(String mensaje) {
		while (true) {
			System.out.print(mensaje);
			String input = scanIn.nextLine();
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println(INGRESE);
			}
		}
	}

	/**
	 * Cierra la instancia de Scanner para liberar recursos.
	 */
	public static void cerrarScanner() {
		scanIn.close();
	}

}
