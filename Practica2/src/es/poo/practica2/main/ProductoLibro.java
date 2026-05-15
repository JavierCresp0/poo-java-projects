package es.poo.practica2.main;

import java.util.ArrayList;

public class ProductoLibro extends Producto implements IMostrable {

	/* Constantes */
	private static final String CODIGO1 = "RMB1";
	private static final String CODIGO2 = "RMB2";
	private static final String CODIGO3 = "RMB3";
	private static final String CODIGO4 = "RMB4";
	private static final String CODIGO5 = "RMB5";
	private static final String TEXTO1 = "The Horse";
	private static final String TEXTO2 = "The Lion";
	private static final String TEXTO3 = "The Clown";
	private static final String TEXTO4 = "The Worm";
	private static final String TEXTO5 = "The Vampire";
	private static final double PRECIO1 = 4;
	private static final double PRECIO2 = 2.5;
	private static final double PRECIO3 = 3;
	private static final String TITULO1 = "The Pale Horse";
	private static final String TITULO2 = "Hamlet";
	private static final String TITULO3 = "It";
	private static final String TITULO4 = "Dune";
	private static final String TITULO5 = "Dracula";
	private static final String CODIGO11 = "RRNNPP";
	private static final String CODIGO22 = "RRNNPP";
	private static final String CODIGO33 = "HAHAHA";
	private static final String CODIGO44 = "DWONPW";
	private static final String CODIGO55 = "RRNNPP";
	private static final String AUTOR1 = "Agatha Christie";
	private static final String AUTOR2 = "William Shakespeare";
	private static final String AUTOR3 = "Stephen King";
	private static final String AUTOR4 = "Frank Herbert";
	private static final String AUTOR5 = "Bram Stoker";
	private static final String EDITORIAL1 = "Collins Crime Club1";
	private static final String EDITORIAL2 = "Penguin Classics";
	private static final String EDITORIAL3 = "Secker and Warburg";
	private static final String EDITORIAL4 = "Chilton Books";
	private static final String EDITORIAL5 = "Archibald Constable";

	/* Atributos */
	private String codigoISBN;
	private String titulo;
	private String autor;
	private String editorial;
	public static ArrayList<ProductoLibro> p_Libro;

	/* Constructor */
	public ProductoLibro() {
		impuestos = 0.1;
	}

	/* Getters y Setters */

	/**
	 * Establece el código ISBN del libro.
	 * 
	 * @param codigoISBN El código ISBN del libro.
	 */
	public void setCodigoISBN(String codigoISBN) {
		this.codigoISBN = codigoISBN;
	}

	/**
	 * Establece el título del libro.
	 * 
	 * @param titulo El título del libro.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Establece el autor del libro.
	 * 
	 * @param autor El autor del libro.
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Establece la editorial del libro.
	 * 
	 * @param editorial La editorial del libro.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/* Metodos */

	/**
	 * Método que genera una cadena de texto con la información del producto de tipo
	 * libro.
	 * 
	 * @return Cadena de texto con la información del producto de tipo libro.
	 */
	@Override
	public String dameCadena() {
		String cadena = super.dameCadena();
		cadena = cadena + codigoISBN + "\s\s\s\s\s";
		cadena = cadena + titulo + "\s\s";
		cadena = cadena + autor + "\s\s\s\s";
		cadena = cadena + editorial + "\s";

		return cadena;
	}

	/**
	 * Método que devuelve una lista de productos de tipo libro creados. Si la lista
	 * aún no ha sido creada, la inicializa y agrega algunos ejemplos.
	 * 
	 * @return Lista de productos de tipo libro.
	 */
	public ArrayList<ProductoLibro> obtenerElementos() {

		if (p_Libro == null) {
			p_Libro = new ArrayList<ProductoLibro>();

			ProductoLibro n10 = new ProductoLibro();
			n10.setCodigo(CODIGO1);
			n10.setDescripcion(TEXTO1);
			n10.setPrecioSin(PRECIO3);
			n10.setTotal((n10.getPrecioSin() * n10.getImpuestos()) + n10.getPrecioSin());
			n10.setCodigoISBN(CODIGO11);
			n10.setTitulo(TITULO1);
			n10.setAutor(AUTOR1);
			n10.setEditorial(EDITORIAL1);
			p_Libro.add(n10);

			ProductoLibro hamlet = new ProductoLibro();
			hamlet.setCodigo(CODIGO2);
			hamlet.setDescripcion(TEXTO2);
			hamlet.setPrecioSin(PRECIO2);
			hamlet.setTotal((hamlet.getPrecioSin() * hamlet.getImpuestos()) + hamlet.getPrecioSin());
			hamlet.setCodigoISBN(CODIGO22);
			hamlet.setTitulo(TITULO2);
			hamlet.setAutor(AUTOR2);
			hamlet.setEditorial(EDITORIAL2);
			p_Libro.add(hamlet);

			ProductoLibro it = new ProductoLibro();
			it.setCodigo(CODIGO3);
			it.setDescripcion(TEXTO3);
			it.setPrecioSin(PRECIO3);
			it.setTotal((it.getPrecioSin() * it.getImpuestos()) + it.getPrecioSin());
			it.setCodigoISBN(CODIGO33);
			it.setTitulo(TITULO3);
			it.setAutor(AUTOR3);
			it.setEditorial(EDITORIAL3);
			p_Libro.add(it);

			ProductoLibro dune = new ProductoLibro();
			dune.setCodigo(CODIGO4);
			dune.setDescripcion(TEXTO4);
			dune.setPrecioSin(PRECIO1);
			dune.setTotal((dune.getPrecioSin() * dune.getImpuestos()) + dune.getPrecioSin());
			dune.setCodigoISBN(CODIGO44);
			dune.setTitulo(TITULO4);
			dune.setAutor(AUTOR4);
			dune.setEditorial(EDITORIAL4);
			p_Libro.add(dune);

			ProductoLibro dracula = new ProductoLibro();
			dracula.setCodigo(CODIGO5);
			dracula.setDescripcion(TEXTO5);
			dracula.setPrecioSin(PRECIO1);
			dracula.setTotal((dracula.getPrecioSin() * dracula.getImpuestos()) + dracula.getPrecioSin());
			dracula.setCodigoISBN(CODIGO55);
			dracula.setTitulo(TITULO5);
			dracula.setAutor(AUTOR5);
			dracula.setEditorial(EDITORIAL5);
			p_Libro.add(dracula);
		}

		return p_Libro;
	}

}
