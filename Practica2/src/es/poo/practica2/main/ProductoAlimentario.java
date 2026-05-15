package es.poo.practica2.main;

import java.util.ArrayList;

import es.poo.practica2.apoyo.Fecha;

public class ProductoAlimentario extends Producto implements IMostrable {
	
	/* Constantes */
	private static final String USUARIO = "Usuario:";
	private static final String CODIGO1 = "RMA1";
	private static final String CODIGO2 = "RMA2";
	private static final String CODIGO3 = "RMA3";
	private static final String CODIGO4 = "RMA4";
	private static final String CODIGO5 = "RMA5";
	private static final String TEXTO1 = "Jamon";
	private static final String TEXTO2 = "Arroz";
	private static final String TEXTO3 = "Queso";
	private static final String TEXTO4 = "Huevo";
	private static final String TEXTO5 = "Pan";
	private static final int DOCE = 12;
	private static final int ANO = 2030;
	private static final double DOS = 2;
	private static final double DOS_5 = 2.5;
	private static final double TRES = 3;
	private static final double UNO_5 = 1.5;

	/* Atributos */
	private int fechaCadDia;
	private int fechaCadMes;
	private int fechaCadAno;
	public static ArrayList<ProductoAlimentario> p_Alimentarios;
	/* Getters y Setters */


    /**
     * Establece el día de caducidad si la fecha es válida.
     *
     * @param año El año de caducidad.
     * @param mes El mes de caducidad.
     * @param dia El día de caducidad.
     */
	public void setFechaCadDia(int ano, int mes, int dia) {
	    if (Fecha.fechaValida3(ano, mes, dia)) {
	        this.fechaCadDia = dia;
	    }
	}

    /**
     * Establece el mes de caducidad si la fecha es válida.
     *
     * @param año El año de caducidad.
     * @param mes El mes de caducidad.
     * @param dia El día de caducidad.
     */
	public void setFechaCadMes(int ano, int mes, int dia) {
	    if (Fecha.fechaValida3(ano, mes, dia)) {
	        this.fechaCadMes = mes;
	    }
	}

    /**
     * Establece el año de caducidad si la fecha es válida.
     *
     * @param año El año de caducidad.
     * @param mes El mes de caducidad.
     * @param dia El día de caducidad.
     */
	public void setFechaCadAno(int ano, int mes, int dia) {
	    if (Fecha.fechaValida3(ano, mes, dia)) {
	        this.fechaCadAno = ano;
	    }
	}

	/* Constructor */
	/**
	 * Constructor de la clase ProductoAlimentario.
	 * Inicializa los impuestos de los productos alimentarios.
	 */
	public ProductoAlimentario() {
		impuestos = 0.04;

	}

	/* Metodos */
	
    /**
     * Retorna la información del producto alimentario.
     *
     * @return Cadena que representa la información del producto alimentario.
     */
	@Override
	public String dameCadena() {
		String cadena = super.dameCadena();
		cadena = cadena + fechaCadDia + "/" + fechaCadMes + "/" + fechaCadAno + "\s";

		return cadena;
	}

    /**
     * Retorna una lista de productos alimentarios, inicializándola si es necesario.
     *
     * @return Lista de productos alimentarios.
     */
	public ArrayList<ProductoAlimentario> obtenerElementos() {

		if (p_Alimentarios == null) {
			p_Alimentarios = new ArrayList<ProductoAlimentario>();

			ProductoAlimentario jamon = new ProductoAlimentario();
			jamon.setCodigo(CODIGO1);
			jamon.setDescripcion(TEXTO1);
			jamon.setPrecioSin(TRES);
			jamon.setTotal((jamon.getPrecioSin() * jamon.getImpuestos()) + jamon.getPrecioSin());
			jamon.setFechaCadDia(ANO, DOCE, DOCE);
			jamon.setFechaCadMes(ANO, DOCE, DOCE);
			jamon.setFechaCadAno(ANO, DOCE, DOCE);
			p_Alimentarios.add(jamon);
			
			ProductoAlimentario arroz = new ProductoAlimentario();
			arroz.setCodigo(CODIGO2);
			arroz.setDescripcion(TEXTO2);
			arroz.setPrecioSin(DOS);
			arroz.setTotal((arroz.getPrecioSin() * arroz.getImpuestos()) + arroz.getPrecioSin());
			arroz.setFechaCadDia(ANO, DOCE, DOCE);
			arroz.setFechaCadMes(ANO, DOCE, DOCE);
			arroz.setFechaCadAno(ANO, DOCE, DOCE);
			p_Alimentarios.add(arroz);

			ProductoAlimentario queso = new ProductoAlimentario();
			queso.setCodigo(CODIGO3);
			queso.setDescripcion(TEXTO3);
			queso.setPrecioSin(DOS_5);
			queso.setTotal((queso.getPrecioSin() * queso.getImpuestos()) + queso.getPrecioSin());
			queso.setFechaCadDia(ANO, DOCE, DOCE);
			queso.setFechaCadMes(ANO, DOCE, DOCE);
			queso.setFechaCadAno(ANO, DOCE, DOCE);
			p_Alimentarios.add(queso);
			
			ProductoAlimentario huevo = new ProductoAlimentario();
			huevo.setCodigo(CODIGO4);
			huevo.setDescripcion(TEXTO4);
			huevo.setPrecioSin(UNO_5);
			huevo.setTotal((huevo.getPrecioSin() * huevo.getImpuestos()) + huevo.getPrecioSin());
			huevo.setFechaCadDia(ANO, DOCE, DOCE);
			huevo.setFechaCadMes(ANO, DOCE, DOCE);
			huevo.setFechaCadAno(ANO, DOCE, DOCE);
			p_Alimentarios.add(huevo);
			
			ProductoAlimentario pan = new ProductoAlimentario();
			pan.setCodigo(CODIGO5);
			pan.setDescripcion(TEXTO5);
			pan.setPrecioSin(DOS_5);
			pan.setTotal((pan.getPrecioSin() * pan.getImpuestos()) + pan.getPrecioSin());
			pan.setFechaCadDia(ANO, DOCE, DOCE);
			pan.setFechaCadMes(ANO, DOCE, DOCE);
			pan.setFechaCadAno(ANO, DOCE, DOCE);
			p_Alimentarios.add(pan);

		}

		return p_Alimentarios;
	}

}
