package es.poo.practica2.main;

import java.util.ArrayList;

public class Pedido implements IMostrable {

	/* Constantes */
	private static final String BARRAS = "-----------------------------------";
	private static final String NUM = "NUMERO DE PEDIDO:";
	private static final String INV = "Usuario: Invitado";
	private static final String US = "Usuario:";
	private static final String OP = "Opción de envío: ";
	private static final String DIRE = "Dirección de entrega: ";
	private static final String LISTA = "-- Listado de productos seleccionados --";

	/* Atributos */
	private int numero = 0;
	private ClienteRegistrado cliente;
	private MetodoPago mp;
	private String direccion;
	private FormaEnvio fe;
	public ArrayList<LineaPedido> lp;
	private double precioTotal;

	/* Constructor */
	public Pedido() {
		lp = new ArrayList<LineaPedido>();

	}
	/* Getters y Setters */

	/**
	 * Obtiene el número del pedido.
	 *
	 * @return El número del pedido.
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Establece el número del pedido.
	 *
	 * @param numero El nuevo número del pedido.
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Obtiene el cliente asociado al pedido.
	 *
	 * @return El cliente asociado al pedido.
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Establece el cliente asociado al pedido.
	 *
	 * @param cliente El nuevo cliente asociado al pedido.
	 */
	public void setCliente(ClienteRegistrado cliente) {
		this.cliente = cliente;
	}

	/**
	 * Obtiene el método de pago del pedido.
	 *
	 * @return El método de pago del pedido.
	 */
	public MetodoPago getMp() {
		return mp;
	}

	/**
	 * Establece el método de pago del pedido.
	 *
	 * @param mp El nuevo método de pago del pedido.
	 */
	public void setMp(MetodoPago mp) {
		this.mp = mp;
	}

	/**
	 * Obtiene la dirección de entrega del pedido.
	 *
	 * @return La dirección de entrega del pedido.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Establece la dirección de entrega del pedido.
	 *
	 * @param direccion La nueva dirección de entrega del pedido.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Obtiene la forma de envío del pedido.
	 *
	 * @return La forma de envío del pedido.
	 */
	public FormaEnvio getFe() {
		return fe;
	}

	/**
	 * Establece la forma de envío del pedido.
	 *
	 * @param fe La nueva forma de envío del pedido.
	 */
	public void setFe(FormaEnvio fe) {
		this.fe = fe;
	}

	/**
	 * Obtiene las líneas de pedido asociadas al pedido.
	 *
	 * @return Las líneas de pedido asociadas al pedido.
	 */
	public ArrayList<LineaPedido> getLp() {
		return lp;
	}

	/**
	 * Establece las líneas de pedido asociadas al pedido.
	 *
	 * @param lp Las nuevas líneas de pedido asociadas al pedido.
	 */
	public void setLp(ArrayList<LineaPedido> lp) {
		this.lp = lp;
	}

	/**
	 * Obtiene el precio total del pedido.
	 *
	 * @return El precio total del pedido.
	 */
	public double getPrecioTotal() {
		return precioTotal;
	}

	/**
	 * Establece el precio total del pedido.
	 *
	 * @param precioTotal El nuevo precio total del pedido.
	 */
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	/* Metodos */

	/**
	 * Obtiene una representación en cadena del pedido.
	 *
	 * @return Una cadena que representa el pedido.
	 */
	@Override
	public String dameCadena() {
		numero = cliente.pedidos.size() + 1;
		String cadena = "";
		cadena = cadena + NUM + numero + "\n";
		if (cliente.getNombre() == null) {
			cadena = cadena + INV + "\n";
		} else {
			cadena = cadena + US + cliente.getNombre() + " " + cliente.getApellidos() + "\n";
		}
		cadena = cadena + BARRAS + "\n";
		cadena = cadena + OP + fe.dameCadena() + "\n";
		cadena = cadena + DIRE + direccion + "\n";
		cadena = cadena + BARRAS + "\n";
		cadena = cadena + LISTA;
		return cadena;
	}

}
