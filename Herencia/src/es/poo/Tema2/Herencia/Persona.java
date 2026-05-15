package es.poo.Tema2.Herencia;

import java.util.Date;
import java.util.Scanner;

/**
 * Clase que encapsula la información de las personas
 * @author demaal
 *
 */
public class Persona {
	
	//Atributos
	private String nif;
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	
	//Contructores
	
	//Getters y setters
	public void setNif(String nif)
	{
		this.nif = nif;
	}
	
	public String getNif()
	{
		return this.nif;
	}
	//...
	
	//Métodos
	public void solicitarDatos()
	{
		//Scanner.class..
		
		nif = "Mjssjshsd";
		nombre = "sdfsdfsdf";
		apellidos = "sdsfsfsf";
		fechaNacimiento = new Date ();
	}
	
	public void mostrarDatos()
	{
		System.out.println("nif: " + nif);
		//....
	}
	
	public final void mostrarEdad()
	{
		int edad;
		edad=calcularEdad();
		System.out.println("Edad: " + edad);
	}
	
	/**
	 * Función para calcular la edad
	 * @return Edad de la persona
	 */
	private int calcularEdad()
	{
		return 23;
	}
	
}
