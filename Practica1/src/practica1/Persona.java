package practica1;

public class Persona {
	/* Constantes */
	private static final String NOMBRE = "Nombre: ";
	private static final String APELLIDO1 = "Primer Apellido: ";
	private static final String APELLIDO2 = "Segundo Apellido: ";
	private static final String EDAD = "Edad: ";

	/* Atributos */
	private String nombre, apellido1, apellido2;
	private int salarioBruto, dia, mes, año, edad;

	/* Getters y Setters */

	/**
	 * Obtiene la edad de la persona.
	 *
	 * @return La edad de la persona.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Establece la edad de la persona.
	 *
	 * @param edad La nueva edad de la persona.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Obtiene el día de nacimiento de la persona.
	 *
	 * @return El día de nacimiento de la persona.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Establece el día de nacimiento de la persona si la fecha es válida.
	 *
	 * @param año El año de nacimiento.
	 * @param mes El mes de nacimiento.
	 * @param dia El día de nacimiento.
	 */
	public void setDia(int año, int mes, int dia) {
		if (Fecha.fechaValida(año, mes, dia)) {
			this.dia = dia;
		}

	}

	/**
	 * Obtiene el mes de nacimiento de la persona.
	 *
	 * @return El mes de nacimiento de la persona.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Establece el mes de nacimiento de la persona si la fecha es válida.
	 *
	 * @param año El año de nacimiento.
	 * @param mes El mes de nacimiento.
	 * @param dia El día de nacimiento.
	 */
	public void setMes(int año, int mes, int dia) {
		if (Fecha.fechaValida(año, mes, dia)) {
			this.mes = mes;
		}

	}

	/**
	 * Obtiene el año de nacimiento de la persona.
	 *
	 * @return El año de nacimiento de la persona.
	 */

	public int getAño() {
		return año;
	}

	/**
	 * Establece el año de nacimiento de la persona si la fecha es válida.
	 *
	 * @param año El nuevo año de nacimiento.
	 * @param mes El mes de nacimiento.
	 * @param dia El día de nacimiento.
	 */
	public void setAño(int año, int mes, int dia) {
		if (Fecha.fechaValida(año, mes, dia)) {
			this.año = año;
		}

	}

	/**
	 * Obtiene el salario bruto de la persona.
	 *
	 * @return El salario bruto de la persona.
	 */
	public int getSalarioBruto() {
		return salarioBruto;
	}

	/**
	 * Establece el salario bruto de la persona.
	 *
	 * @param salarioBruto El nuevo salario bruto de la persona.
	 */
	public void setSalarioBruto(int salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	/**
	 * Obtiene el nombre de la persona.
	 *
	 * @return El nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la persona.
	 *
	 * @param nombre El nuevo nombre de la persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el primer apellido de la persona.
	 *
	 * @return El primer apellido de la persona.
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Establece el primer apellido de la persona.
	 *
	 * @param apellido1 El nuevo primer apellido de la persona.
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Obtiene el segundo apellido de la persona.
	 *
	 * @return El segundo apellido de la persona.
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * Establece el segundo apellido de la persona.
	 *
	 * @param apellido2 El nuevo segundo apellido de la persona.
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/* Metodos */

	/**
	 * Retorna una cadena con información de la persona.
	 * 
	 * @return Cadena con información de la persona.
	 */
	public String dameCadena() {
		String cadena = "";

		cadena = cadena + NOMBRE + nombre + "\s";
		cadena = cadena + APELLIDO1 + apellido1 + "\s";
		cadena = cadena + APELLIDO2 + apellido2 + "\s";
		cadena = cadena + EDAD + edad + "\n";

		return cadena;
	}
}

