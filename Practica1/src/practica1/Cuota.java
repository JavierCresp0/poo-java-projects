package practica1;

public class Cuota {

	/* Constantes */
	private static final String N_CUOT = "Numero de cuota: ";
	private static final String IMP_INT = "Importe de intereses:";
	private static final String IMP_AMO = "Importe amortizado:";
	private static final String IMP_CUOT = "Importe de cuota:";
	private static final String IMP_PEN = "Importe pendiente:";
	private static final String S = "\s|\s";

	/* Atributos */

	private int numero;
	private double importeIntereses;
	private double importeAmortizado;
	private double importeCuota;
	private double capital;

	/* Setters y Getters */

    /**
     * Obtiene el número de la cuota.
     *
     * @return El número de la cuota.
     */
	public int getNumero() {
		return numero;
	}

	 /**
     * Establece el número de la cuota.
     *
     * @param numero El nuevo número de la cuota.
     */
	public void setNumero(int numero) {
		this.numero = numero;
	}

    /**
     * Obtiene el importe de intereses de la cuota.
     *
     * @return El importe de intereses de la cuota.
     */
	public double getImporteIntereses() {
		return importeIntereses;
	}

    /**
     * Establece el importe de intereses de la cuota.
     *
     * @param importeIntereses El nuevo importe de intereses de la cuota.
     */
	public void setImporteIntereses(double importeIntereses) {
		this.importeIntereses = importeIntereses;
	}

    /**
     * Obtiene el importe amortizado de la cuota.
     *
     * @return El importe amortizado de la cuota.
     */
	public double getImporteAmortizado() {
		return importeAmortizado;
	}

    /**
     * Establece el importe amortizado de la cuota.
     *
     * @param importeAmortizado El nuevo importe amortizado de la cuota.
     */
	public void setImporteAmortizado(double importeAmortizado) {
		this.importeAmortizado = importeAmortizado;
	}

    /**
     * Obtiene el importe total de la cuota.
     *
     * @return El importe total de la cuota.
     */
	public double getImporteCuota() {
		return importeCuota;
	}

    /**
     * Establece el importe total de la cuota.
     *
     * @param importeCuota El nuevo importe total de la cuota.
     */
	public void setImporteCuota(double importeCuota) {
		this.importeCuota = importeCuota;
	}

    /**
     * Obtiene el capital restante de la cuota.
     *
     * @return El capital restante de la cuota.
     */
	public double getCapital() {
		return capital;
	}

    /**
     * Establece el capital restante de la cuota.
     *
     * @param capital El nuevo capital restante de la cuota.
     */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/* Metodos */

	/**
	 * Retorna una cadena con información de las cuotas.
	 * 
	 * @return la cadena a pintar por pantalla
	 */
	public String obtenerTexto() {
		String cadena = "";

		cadena = cadena + N_CUOT + numero + S;
		cadena = cadena + IMP_INT + importeIntereses + S;
		cadena = cadena + IMP_AMO + importeAmortizado + S;
		cadena = cadena + IMP_CUOT + importeCuota + S;
		cadena = cadena + IMP_PEN + capital + "\n";

		return cadena;
	}

}
