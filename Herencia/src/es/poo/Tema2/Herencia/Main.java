package es.poo.Tema2.Herencia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		Alumno alu = new Alumno();
		alu.setNif("fsdfsdfsdfds");
		
		//Así por cada clase de persona.
		
		ArrayList<Persona> array = new ArrayList<Persona>();
		
		Persona pers = new Alumno();
		//Alumno alu2 = new Persona(); //Está mal y no compila
		//estblecer atributos
		
		
		
		Alumno alu1 = new Alumno();
		//establecer atributos
		
		//Esto es un casting y está permitido
		Persona pers1 = (Persona) alu1;	

		
		array.add(pers);
		array.add(alu1);
		
		mostrar(pers);
		mostrar(alu1);
		
	}
	
	public static void mostrar(Persona pers)
	{
		
	
	}
}
