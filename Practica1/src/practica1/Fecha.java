package practica1;

import java.util.Calendar;
import java.util.Date;


public class Fecha {
	
	/*Constantes*/
	private static final String AÑO_INV= "Año inválido.";
	
	/**
	 * Verifica si una fecha es válida.
	 * @param year El año de la fecha.
	 * @param month El mes de la fecha (1-12).
	 * @param dayOfMonth El día del mes.
	 * @return true si la fecha es válida, false si no lo es.
	 */
	public static boolean fechaValida(int year, int month, int dayOfMonth)
	{
		boolean resultado=true;
		
		try {
			if (year < 1900) {
	            throw new IllegalArgumentException(AÑO_INV);
	        }

	        Calendar calendar = Calendar.getInstance();
	        //Se debe especificar para solo permitir fecha válidas
	        calendar.setLenient(false);
	        calendar.set(Calendar.YEAR, year);
	        calendar.set(Calendar.MONTH, month - 1); // [0,...,11]
	        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
	        
	        //Si la fecha no es válida provoca una excepción
	        Date date = calendar.getTime();
	        /*
	         * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        System.out.println(sdf.format(date)); // 01/01/2016
	        */
		} catch (Exception e) {
			resultado = false;
		}
		
		return resultado;
	}

}
