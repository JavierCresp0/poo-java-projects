package es.poo.Tema3.EjercicioInterfaces;

public class Alumno implements IComparable {

	@Override
	public int comparar(Object obj) {
		//if (obj.getClass().getName().equals("Alumno")) {
		if (obj instanceof Alumno) {
			return 0;
		}
		else
		{
			//Devuelvo una excepción
			//throw new Exception("Clase errónea");
			return 1;
		}
	}

}
