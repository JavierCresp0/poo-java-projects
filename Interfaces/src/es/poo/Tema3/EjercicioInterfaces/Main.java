package es.poo.Tema3.EjercicioInterfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EquipoFutbol rm = new EquipoFutbol();
		EquipoFutbol barcelona = new EquipoFutbol();
		
		
		rm.compareTo(barcelona);	
		
		
		comparar(rm,barcelona);
	}
	
	public static void comparar(Comparable c1, Comparable c2)
	{
		c1.compareTo(c2);	
	}

}
