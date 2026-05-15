package practica1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/* Constantes */
	private static final String PEDIR_FECHA = "A continuacion dime tu fecha de nacimiento";
	private static final String PEDIR_DIA = "Dime el día que naciste: ";
	private static final String PEDIR_MES = "Dime el mes que naciste: ";
	private static final String PEDIR_AÑO = "Dime el año que naciste: ";
	private static final String F_NO_VALID = "La fecha no es válida. Inténtalo de nuevo.";
	private static final String D_NOMBRE = "Dime tu nombre: ";
	private static final String D_AP1 = "Dime tu primer apellido: ";
	private static final String D_AP2 = "Dime tu segundo apellido: ";
	private static final String D_SALA = "Dime tu salario bruto anual: ";
	private static final String P_PRESTAMO = "A continuacion dime que tipo de prestamo prefieres PERSONAL o HIPOTECARIO:";
	private static final String P1 = "1 - PERSONAL";
	private static final String H2 = "2 - HIPOTECARIO";
	private static final String P = ".";
	private static final String EP = "Ha elegido PERSONAL \n";
	private static final String EH = "Ha elegido HIPOTECARIO \n";
	private static final String OP_INVA = "Opción no válida. Por favor, elija 1 o 2.";
	private static final String D_IMPORT = "Dime el importe solicitado";
	private static final String D_PLA_MES = "Dime cual es el plazo en meses \n";
	private static final String P_INFORME = "A continuacion dime que  tipo de informe quieres RESUMEN o DETALLADO.";
	private static final String R1 = "1 - RESUMEN";
	private static final String D2 = "2 - DETALLADO";
	private static final String P_TP = "A continuacion elige que prestamo prefieres";
	private static final String OPCION = "  Opcion ";
	private static final String PRI_OP = "1 - Primera Opcion";
	private static final String SEG_OP = "2 - Segunda Opcion";
	private static final String ENTER1 = "Ha elegido la primera opcion  precione ENTER para continuar";
	private static final String ENTER2 = "Ha elegido la segunda opcion  precione ENTER para continuar";
	private static final String ENT_INV = "Entrada no válida. Por favor, ingrese un número entero.";
	private static final String FECHA = "dd/MM/yyyy";
	private static final String FECHA2 = "%02d/%02d/%04d";
	private static final String MENOR18 = "Lamentamos comunicarle que los menores de edad no pueden "
			+ "solicitar préstamos, disculpe las molestias.";
	private static final int CERO = 0;
	private static final int UNO = 1;
	private static final int DOS = 2;
	private static final int DIECIOCHO= 18;

	private static Scanner scanIn = new Scanner(System.in);

	public static void main(String[] args) {
		Persona per1 = new Persona();
		Prestamo pres1 = new Prestamo();

		pedirDatos(per1);

		pedirPrestamo(pres1, per1);

		pedirInforme(pres1);

		scanIn.close();
	}

	/**
	 * Pide los datos del usaurio
	 */
	private static void pedirDatos(Persona per) {
		System.out.println(PEDIR_FECHA);

		int dia, mes, año;

		do {
			dia = obtenerEntero(PEDIR_DIA);
			mes = obtenerEntero(PEDIR_MES);
			año = obtenerEntero(PEDIR_AÑO);

			if (!Fecha.fechaValida(año, mes, dia)) {
				System.out.println(F_NO_VALID);
			}
		} while (!Fecha.fechaValida(año, mes, dia));

		per.setDia(año, mes, dia);
		per.setMes(año, mes, dia);
		per.setAño(año, mes, dia);
		vEdad(per);
		per.setNombre(imprimir(D_NOMBRE));
		per.setApellido1(imprimir(D_AP1));
		per.setApellido2(imprimir(D_AP2));
		per.setSalarioBruto(obtenerEntero(D_SALA));

	}

	/**
	 * Pide los datos del prestamo
	 */
	private static void pedirPrestamo(Prestamo pres, Persona per) {

		// enlaza el prestamo con la persona
		pres.setSolicitante(per);

		// Le pide al utilizador elegir entre prestamo PERSONAL o prestamo HIPOTECARIO
		int opcion;

		do {
			System.out.println(P_PRESTAMO);
			System.out.println(P1);
			System.out.println(H2);

			opcion = obtenerEntero(P);

			if (opcion == UNO) {
				System.out.println(EP);

				mostrarPrestamos(pres, TPrestamo.PERSONAL);
			} else if (opcion == DOS) {
				System.out.println(EH);
				mostrarPrestamos(pres, TPrestamo.HIPOTECARIO);
			} else {
				System.out.println(OP_INVA);
			}

		} while (opcion != UNO && opcion != DOS);

		// Consumir el carácter de nueva línea restante en el búfer
		scanIn.nextLine();

		pres.setImporteSoli(obtenerEntero(D_IMPORT));

		pres.setPlazoMes(obtenerEntero(D_PLA_MES));

		pres.fechaPrestamo(pres);

		verificar(pres);

	}

	/**
	 * Verifica si despues del plazo la persona no tendra mas de 75 años. Verifica
	 * si el los valores del Prestamo son correctos. Y verifica que la cuato sea
	 * superior al 40% del salario mensual
	 */
	private static void verificar(Prestamo pres) {
		try {
			pres.verificarEdad();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(UNO);
		}

		try {
			pres.comprobarPrestamo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(UNO);
		}

		try {
			pres.verificarCuota();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(UNO);
		}

	}

	/**
	 * Le pide al utilizador que elija la manera para presentar los datos por pantalla
	 */
	private static void pedirInforme(Prestamo pres) {

		int opcion;

		do {
			System.out.println(P_INFORME);
			System.out.println(R1);
			System.out.println(D2);

			opcion = obtenerEntero(P);

			if (opcion == UNO) {
				System.out.println(pres.obtenerResumen());

			} else if (opcion == DOS) {
				System.out.println(pres.obtenerResumenDetallado());

			} else {
				System.out.println(OP_INVA);
			}

		} while (opcion != UNO && opcion != DOS);

	}

	/**
	 * Imprime por patalla los tipos de prestamos a elegir y lo guarda	 * 
	 * @param pres El prestamo que solicita
	 * @param p El tipo de prestamo que eligio
	 */
 	private static void mostrarPrestamos(Prestamo pres, TPrestamo p) {
		ArrayList<TipoPrestamo> arr;
		arr = TipoPrestamo.damePrestamos(p);

		int opcion;

		do {
			System.out.println(P_TP);

			for (int i = CERO; i < arr.size(); i++) {
				System.out.println(OPCION + (i + UNO) + ":\n " + arr.get(i).dameCadena(p) + "\n ");

			}

			System.out.println(PRI_OP);
			System.out.println(SEG_OP);

			opcion = obtenerEntero(P);

			if (opcion == UNO) {
				System.out.println(ENTER1);
				pres.setTp(arr.get(CERO));
			} else if (opcion == DOS) {
				System.out.println(ENTER2);
				pres.setTp(arr.get(UNO));
			} else {
				System.out.println(OP_INVA);
			}

		} while (opcion != UNO && opcion != DOS);
	}

	/**
	 * Metodo para pintar por pantalla una cadena y obtener un input del usaurio
	 * 
	 * @param cadena Texto a mostrar por pantalla
	 * @return El resultado de texto introducido por el usuario
	 */
	private static String imprimir(String cadena) {
		System.out.println(cadena);

		return (scanIn.nextLine());
	}

	/**
	 * Solicita al usuario un número entero, mostrando el mensaje especificado.
	 * 
	 * @param mensaje El mensaje a mostrar al usuario.
	 * @return El número entero ingresado por el usuario.
	 */
	private static int obtenerEntero(String mensaje) {
		while (true) {
			System.out.print(mensaje);
			String input = scanIn.nextLine();
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println(ENT_INV);
			}

		}
	}

	/**
	 * Metodo para verificar la edad de la persona
	 */
	private static void vEdad(Persona per) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(FECHA);

		String input = String.format(FECHA2, per.getDia(), per.getMes(), per.getAño());

		LocalDate fechaNacimiento = LocalDate.parse(input, fmt);

		LocalDate fechaActual = LocalDate.now();
		Period edad = Period.between(fechaNacimiento, fechaActual);

		// esto verifica que sea mayor de 18 año y si coloca una fecha futura
		if (edad.getYears() < DIECIOCHO) {
			System.out.println(MENOR18);
			System.exit(CERO); // Salir del programa
		} else {
			per.setEdad(edad.getYears());
		}
	}

}
