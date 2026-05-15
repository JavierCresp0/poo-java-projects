package practica1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Prestamo {

	/* Constantes */
	private static final String FECHA = "dd/MM/yyyy";
	private static final String DATOS_INCO = "Los datos que ingresaste son incorrectos, por favor intentelo de nuevo";
	private static final String EDAD_SUP = "Lamentamos comunicarle que la fecha de amortización del último pago supera la edad "
			+ "máxima de 75 años y no podemos concederle el préstamo, disculpe las molestias.";
	private static final String FECHA1 = "fecha:";
	private static final String SOLI = "Solicitante: \s";
	private static final String IMP_SOLI = "Importe Solicitado: ";
	private static final String P_MES = "Plazo en meses: ";
	private static final String P_ANO = "  Plazo en años: ";
	private static final String TP = "Tipo de préstamo seleccionado: ";
	private static final String TI = "Tipo de Interes aplicado: ";
	private static final String IMPORT_INT = "Importe Intereses: ";
	private static final String IMPORT_TOT = "Importe total: ";
	private static final String COM = "Comodidad para pagar: ";
	private static final String CUOT_SUP = "Lamentamos comunicarle que el importe de la cuota supera el 40% de sus ingresos mensuales, por \r\n"
			+ "tanto, no podemos concederle el préstamo, disculpe las molestias.";
	private static final String M_BUENA = "Muy buena: El pago de la cuota representa menos del 20% del salario bruto mensual.";
	private static final String BUENA = "Buena: El pago de la cuota representa entre el 20% y el 30% del salario bruto mensual.";
	private static final String REGULAR = "Regular: El pago de la cuota representa entre el 30% y el 40% del salario bruto mensual.";
	private static final int CERO = 0;
	private static final int UNO = 1;
	private static final int DOCE = 12;
	private static final int CIEN = 100;
	private static final int MAX75 = 75;
	private static final int MAX35 = 35;
	private static final int MAX45 = 45;
	private static final int MENOS65 = 65;
	private static final double CERO2 = 0.2;
	private static final double CERO3 = 0.3;
	private static final double CERO4 = 0.4;
	private static final double CERO9 = 0.9;
	private static final double CERO95 = 0.95;

	/* Atreibutos */
	private Persona solicitante;
	private String fechaSoli;
	private int importeSoli;
	private int plazoMes;
	private TipoPrestamo tp;
	private double tipoInteres;
	private double totalIntereses;
	private double importeTotal;
	private ArrayList<Cuota> cuotas;
	private double cuotaConst;

	/* Setters y Getters */

	/**
	 * Establece el solicitante del préstamo.
	 *
	 * @param solicitante La persona que solicita el préstamo.
	 */
	public void setSolicitante(Persona solicitante) {
		this.solicitante = solicitante;
	}

	/**
	 * Obtiene el importe solicitado en el préstamo.
	 *
	 * @return El importe solicitado.
	 */
	public int getImporteSoli() {
		return importeSoli;
	}

	/**
	 * Establece el importe solicitado y recalcula el cuadro de amortización.
	 *
	 * @param importeSoli El nuevo importe solicitado.
	 */
	public void setImporteSoli(int importeSoli) {
		this.importeSoli = importeSoli;
		calcularCuadroAmortizacion();
	}

	/**
	 * Obtiene el plazo en meses del préstamo.
	 *
	 * @return El plazo en meses.
	 */
	public int getPlazoMes() {
		return plazoMes;

	}

	/**
	 * Establece el plazo en meses y recalcula el cuadro de amortización.
	 *
	 * @param plazoMes El nuevo plazo en meses.
	 */
	public void setPlazoMes(int plazoMes) {
		this.plazoMes = plazoMes;
		calcularCuadroAmortizacion();
	}

	/**
	 * Obtiene el tipo de préstamo.
	 *
	 * @return El tipo de préstamo.
	 */
	public TipoPrestamo getTp() {
		return tp;
	}

	/**
	 * Establece el tipo de préstamo.
	 *
	 * @param tipoPrestamo El nuevo tipo de préstamo.
	 */
	public void setTp(TipoPrestamo tipoPrestamo) {
		this.tp = tipoPrestamo;
	}

	/**
	 * Obtiene la fecha de solicitud del préstamo.
	 *
	 * @return La fecha de solicitud.
	 */
	public String getFechaSoli() {
		return fechaSoli;
	}

	/**
	 * Establece la fecha de solicitud del préstamo.
	 *
	 * @param fechaSoli La nueva fecha de solicitud.
	 */
	public void setFechaSoli(String fechaSoli) {
		this.fechaSoli = fechaSoli;
	}

	/* Constructor */

	/**
	 * Constructor de la clase Prestamo. Inicializa la lista de cuotas.
	 */
	public Prestamo() {
		cuotas = new ArrayList<Cuota>();

	}

	/* Metodos */

	/**
	 * Obtiene la fecha actual en la que se realizo el prestamo
	 */
	public void fechaPrestamo(Prestamo pres) {
		LocalDate fechaSolicitud = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FECHA);
		pres.setFechaSoli(fechaSolicitud.format(formatter));

	}

	/**
	 * Verifica que el importe solicitado y el plazo en meses sean correctos
	 * 
	 * @throws Exception
	 */
	public void comprobarPrestamo() throws Exception {

		if (importeSoli > tp.getImporteMaximo() || plazoMes > tp.getPlazoMaximo(tp.getTpres())) {

			throw new Exception(DATOS_INCO);
		}

	}

	/**
	 * Verifica si despues del plazo la persona no tendra mas de 75 años
	 * 
	 * @throws Exception
	 */
	public void verificarEdad() throws Exception {

		int edadConPlazo = solicitante.getEdad() + (plazoMes / DOCE); // Calcular la edad con el plazo en cuenta

		if (edadConPlazo > MAX75) {
			throw new Exception(EDAD_SUP);
		}
	}

	/**
	 * Verifica que la cuota se inferior al 40% del salario mensual bruto
	 * 
	 * @throws Exception
	 */
	public void verificarCuota() throws Exception {
		if (cuotaConst > ((solicitante.getSalarioBruto() / DOCE) * CERO4)) {
			throw new Exception(CUOT_SUP);

		}

	}

	/**
	 * Calcula el Tipo de interes real amplicando los descuentos
	 */
	private void interesReal() {
		tipoInteres = tp.getTipo();

		if (solicitante.getEdad() < MAX35) {
			tipoInteres = (tp.getTipo() * CERO9);

		}
		if (solicitante.getEdad() < MAX45 || solicitante.getEdad() > MENOS65) {
			tipoInteres = (tp.getTipo() * CERO95);
		}
	}

	/**
	 * Hace todas las cuentas necesarias para calculas las Cuotas y todos los
	 * detalles
	 */
	private void calcularCuadroAmortizacion() {
		cuotas.removeAll(cuotas);

		// Calcula el tipo de intere real
		interesReal();

		// Calcula el valor constante de las cuotas
		cuotaConst = importeSoli * ((tipoInteres * Math.pow((UNO + tipoInteres), plazoMes))
				/ (Math.pow((UNO + tipoInteres), plazoMes) - UNO));
		double importeRestante = importeSoli;

		// Crea todos los detalles de las Cuotas
		for (int i = CERO; i < plazoMes; i++) {

			double intereses = tipoInteres * importeRestante;
			double amortizacion = cuotaConst - intereses;

			Cuota cuota = new Cuota();
			cuota.setNumero(i + UNO);
			cuota.setImporteCuota(cuotaConst);
			cuota.setImporteIntereses(intereses);
			cuota.setImporteAmortizado(amortizacion);
			cuota.setCapital(importeRestante);

			importeRestante = importeRestante - amortizacion;
			totalIntereses = totalIntereses + intereses;
			cuotas.add(cuota);
		}

		importeTotal = totalIntereses + importeSoli;

	}

	/**
	 * Metodo para pintar por pantalla una cadena con los detalles del prestamo
	 * 
	 * @return La cadena de texto a pintar
	 */
	public String obtenerResumen() {

		String cadena = "";

		cadena = cadena + "\n" + FECHA1 + fechaSoli + "\n";
		cadena = cadena + SOLI + solicitante.dameCadena() + "\n";
		cadena = cadena + IMP_SOLI + "$" + importeSoli + "\n";
		cadena = cadena + P_MES + plazoMes + P_ANO + (double) plazoMes / DOCE + "\n";
		cadena = cadena + TP + tp.getTpres() + "\n";
		cadena = cadena + TI + tipoInteres * CIEN + "%" + "\n";
		cadena = cadena + IMPORT_INT + "$" + totalIntereses + "\n";
		cadena = cadena + IMPORT_TOT + "$" + importeTotal + "\n";
		cadena = cadena + COM + calcularComodidad() + "\n" + "\n";

		return cadena;
	}

	/**
	 * Calcula el tipo de comodidad del prestamo
	 * 
	 * @return devuelve el texto
	 */
	private String calcularComodidad() {
		String texto = "";

		// Clasificar la cuota según el porcentaje
		if (cuotaConst < (((double)solicitante.getSalarioBruto() / DOCE) * CERO2)) {
			texto = M_BUENA;

		} else if (cuotaConst >= (((double)solicitante.getSalarioBruto() / DOCE) * CERO2)
				&& cuotaConst <= (((double)solicitante.getSalarioBruto() / DOCE) * CERO3)) {
			texto = BUENA;

		} else if (cuotaConst > (((double)solicitante.getSalarioBruto() / DOCE) * CERO3)
				&& cuotaConst <= (((double)solicitante.getSalarioBruto() / DOCE) * CERO4)) {
			texto = REGULAR;

		}

		return texto;

	}

	/**
	 * Metodo para pintar por pantalla una cadena con los detalles del prestamo mas
	 * detallado con informacion de las cuotas
	 * 
	 * @return La cadena de texto a pintar
	 */
	public String obtenerResumenDetallado() {
		
		String cadena = "";

		cadena = cadena + obtenerResumen();

		for (int i = CERO; i < cuotas.size(); i++) {

			cadena = cadena + "Couta:" + cuotas.get(i).obtenerTexto();

		}

		return cadena;

	}

}
