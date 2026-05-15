package es.poo.practica2.main;

public class LineaPedido implements IMostrable {

	/* Atributos */

	private int cantidad;
	private Producto producto;

	/* Getters y Setters */

	/**
	 * Obtiene la cantidad de productos en la línea de pedido.
	 *
	 * @return La cantidad de productos.
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * Establece la cantidad de productos en la línea de pedido.
	 *
	 * @param cantidad La nueva cantidad de productos.
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Obtiene el producto asociado a la línea de pedido.
	 *
	 * @return El producto asociado.
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * Establece el producto asociado a la línea de pedido.
	 *
	 * @param producto El nuevo producto asociado.
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/* Metodos */

	/**
	 * Obtiene una representación en cadena de la línea de pedido.
	 *
	 * @return Una cadena que representa la línea de pedido.
	 */
	@Override
	public String dameCadena() {
		String cadena = "";
		cadena = cadena + producto.getCodigo() + "\s\s\s";
		cadena = cadena + producto.getDescripcion() + "\s\s\s\s\s\s\s";
		cadena = cadena + producto.getPrecioSin() * cantidad + "\s\s\s\s\s\s\s\s\s\s\s";
		cadena = cadena + cantidad + "\s\s\s\s\s\s\s\s";
		cadena = cadena + producto.getImpuestos() * producto.getPrecioSin() * cantidad + "\s\s\s\s\s\s";
		cadena = cadena + producto.getTotal();

		return cadena;
	}
}
