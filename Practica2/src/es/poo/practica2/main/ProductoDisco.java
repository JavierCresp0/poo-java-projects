package es.poo.practica2.main;

import java.util.ArrayList;

public class ProductoDisco extends Producto implements IMostrable {

	/* Constantes */
	private static final String CODIGO1 = "RMC1";
	private static final String CODIGO2 = "RMC2";
	private static final String CODIGO3 = "RMC3";
	private static final String CODIGO4 = "RMC4";
	private static final String CODIGO5 = "RMC5";
	private static final String TEXTO1 = "Opera Night";
	private static final String TEXTO2 = "Thriller";
	private static final String TEXTO3 = "Discovery";
	private static final String TEXTO4 = "Metallica";
	private static final String TEXTO5 = "Faith";
	private static final double PRECIO1 = 5;
	private static final double PRECIO2 = 7;
	private static final double PRECIO3 = 4;
	private static final String TEXTO11 = "Queen";
	private static final String TEXTO22 = "Michael Jackson";
	private static final String TEXTO33 = "Daft Punk";
	private static final String TEXTO55 = "George Michael";

	/* Atributos */
	private String artOGrup;
	private Genero genero;
	public static ArrayList<ProductoDisco> p_Disco;

	/* Getters y Setters */

	/**
	 * Establece el artista o grupo del disco.
	 * 
	 * @param artOGrup El artista o grupo del disco.
	 */
	public void setArtOGrup(String artOGrup) {
		this.artOGrup = artOGrup;
	}

	/**
	 * Establece el género musical del disco.
	 * 
	 * @param genero El género musical del disco.
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/* Metodos */

	/**
	 * Método que genera una cadena de texto con la información del producto de tipo
	 * disco.
	 * 
	 * @return Cadena de texto con la información del producto de tipo disco.
	 */
	@Override
	public String dameCadena() {
		String cadena = super.dameCadena();
		cadena = cadena + artOGrup + "\s\s\s\s\s\s\s";
		cadena = cadena + genero + "\s";

		return cadena;
	}

	/**
	 * Método que devuelve una lista de productos de tipo disco creados. Si la lista
	 * aún no ha sido creada, la inicializa y agrega algunos ejemplos.
	 * 
	 * @return Lista de productos de tipo disco.
	 */
	public ArrayList<ProductoDisco> obtenerElementos() {

		if (p_Disco == null) {
			p_Disco = new ArrayList<ProductoDisco>();

			ProductoDisco bohemian = new ProductoDisco();
			bohemian.setCodigo(CODIGO1);
			bohemian.setDescripcion(TEXTO1);
			bohemian.setPrecioSin(PRECIO2);
			bohemian.setTotal((bohemian.getPrecioSin() * bohemian.getImpuestos()) + bohemian.getPrecioSin());
			bohemian.setArtOGrup(TEXTO11);
			bohemian.setGenero(Genero.ROCK);
			p_Disco.add(bohemian);

			ProductoDisco thriller = new ProductoDisco();
			thriller.setCodigo(CODIGO2);
			thriller.setDescripcion(TEXTO2);
			thriller.setPrecioSin(PRECIO1);
			thriller.setTotal((thriller.getPrecioSin() * thriller.getImpuestos()) + thriller.getPrecioSin());
			thriller.setArtOGrup(TEXTO22);
			thriller.setGenero(Genero.POP);
			p_Disco.add(thriller);

			ProductoDisco punk = new ProductoDisco();
			punk.setCodigo(CODIGO3);
			punk.setDescripcion(TEXTO3);
			punk.setPrecioSin(PRECIO3);
			punk.setTotal((punk.getPrecioSin() * punk.getImpuestos()) + punk.getPrecioSin());
			punk.setArtOGrup(TEXTO33);
			punk.setGenero(Genero.POP);
			p_Disco.add(punk);

			ProductoDisco metallica = new ProductoDisco();
			metallica.setCodigo(CODIGO4);
			metallica.setDescripcion(TEXTO4);
			metallica.setPrecioSin(PRECIO1);
			metallica.setTotal((metallica.getPrecioSin() * metallica.getImpuestos()) + metallica.getPrecioSin());
			metallica.setArtOGrup(TEXTO4);
			metallica.setGenero(Genero.ROCK);
			p_Disco.add(metallica);

			ProductoDisco faith = new ProductoDisco();
			faith.setCodigo(CODIGO5);
			faith.setDescripcion(TEXTO5);
			faith.setPrecioSin(PRECIO1);
			faith.setTotal((faith.getPrecioSin() * faith.getImpuestos()) + faith.getPrecioSin());
			faith.setArtOGrup(TEXTO55);
			faith.setGenero(Genero.ROCK);
			p_Disco.add(faith);
		}

		return p_Disco;

	}
}
