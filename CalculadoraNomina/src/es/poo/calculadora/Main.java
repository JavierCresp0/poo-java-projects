package es.poo.calculadora;

import java.util.Scanner;

public class Main {
	private static final String CAD_NOM = "Dame el nombre: ";
	private static final String CAD_APE1 ="Dame el apellido1: ";
	private static final String CAD_APE2 ="Dame el apellido2: ";
	private static final String CAD_SAL ="Salario bruto mensual: ";
	private static Scanner scanIn;
	private static String nombre;
	private static String apellido1;
	private static String apellido2;
	private static String salarioBruto;
	private static double retencionSS;
	private static double retencionIRPF;
	private static double salarioNeto;
	
	public static void main(String[] args) {
		//Declaramos el objeto para leer por pantalla
		scanIn = new Scanner(System.in);
		
		pedirDatos();
		hacerCalculos();
		pintarPantalla();
		
		//Cerramos la entrada de datos por pantalla
		scanIn.close();
	}
	
	private static void pedirDatos()
	{
		nombre = pedirDato(CAD_NOM);
		apellido1 = pedirDato(CAD_APE1);
		apellido2 = pedirDato(CAD_APE2);
		salarioBruto = pedirDato(CAD_SAL);
	}
	
	/**
	 * Metodo para pintar una cadena por pantalla y pedirle una cadena al usuario
	 * @param textoAPintar cadena que se pinta por pantalla
	 * @return Cadena introducida por el usuario
	 */
	public static String pedirDato(String textoAPintar)
	{
		System.out.println(textoAPintar);
		return scanIn.nextLine();
	}
	
	/**
	 * Metodo para hacer los calculos de la nómina
	 */
	public static void hacerCalculos()
	{
		retencionSS = Double.parseDouble(salarioBruto) * 0.1;
		retencionIRPF = Double.parseDouble(salarioBruto) * 0.2;
		salarioNeto = Double.parseDouble(salarioBruto) - retencionSS - retencionIRPF;
	}
	
	public static void pintarPantalla()
	{
		System.out.println("****************************************");
		System.out.println("Apellidos y Nombre:" + apellido1 + " " + apellido2 + ", " + nombre);
		System.out.println("Salario bruto:" + salarioBruto + " Euros");
		System.out.println("Retenciones SS:" + retencionSS + " Euros");
		System.out.println("Retenciones IRPF:" + retencionIRPF + " Euros");
		System.out.println("Neto a percibir:" + salarioNeto + " Euros");
		System.out.println("****************************************");
	}

}
