package es.poo.Tema2.Herencia;

import java.util.ArrayList;
import java.util.Date;

public class Alumno extends Persona {
	private ArrayList<String> asign;
	
	@Override
	public void solicitarDatos()
	{
		super.solicitarDatos();//Llamada al método de mi padre
		
		//A partir de aquí especializo el método.
		asign = new ArrayList<String>();
	}
	
	@Override
	public void mostrarDatos()
	{
		
		super.mostrarDatos();//Llamada al método de mi padre
		
		//A partir de aquí especializo el método.
		//System.out.println("nif: " + nif);
		//....
	}
}
