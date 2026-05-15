package es.poo.practica2.main;

import java.util.ArrayList;

import es.poo.practica2.apoyo.Fecha;

public class ClienteRegistrado extends Cliente implements IMostrable {

	/* Constantes */
	private static final String FECHA = "Fecha de nacimiento:";
	private static final String APELLIDO = "Garcia";
	private static final String DIRE_DERE = "Abajo a la derecha";
	private static final String DIRE_IZQ = "Abajo a la izquierda";
	private static final String JUAN = "Juan";
	private static final String PEDRO = "Pedro";
	private static final String JOSE = "Jose";
	private static final String MIGUEL = "Miguel";
	private static final String LEO = "Leo";
	private static final String JUAN_CORREO = "juan.gmail.com";
	private static final String PEDRO_CORREO = "predro.gmail.com";
	private static final String JOSE_CORREO = "jose.gmail.com";
	private static final String MIGUEL_CORREO = "miguel.gmail.com";
	private static final String LEO_CORREO = "leo.gmail.com";
	private static final int ANO = 2000;
	private static final int UNO = 1;

	/* Atributos */
	protected String contrasena;
	protected int dia, mes, ano;
	public static ArrayList<ClienteRegistrado> clientes;
	protected ArrayList<Pedido> pedidos;
	protected ArrayList<MetodoPago> metodosPago;
	protected ArrayList<FormaEnvio> formasEnvio;
	protected ArrayList<String> direcciones;

	/* Constructor */
	public ClienteRegistrado() {
		pedidos = new ArrayList<>();
	}

	/* Getters y Setters */

	/**
	 * Obtiene la contraseña del cliente registrado.
	 * 
	 * @return La contraseña del cliente registrado.
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * Establece la contraseña del cliente registrado.
	 * 
	 * @param contraseña La nueva contraseña del cliente registrado.
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	// Métodos relacionados con la fecha de nacimiento

	/**
	 * Obtiene el día de nacimiento de la persona.
	 *
	 * @return El día de nacimiento de la persona.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Establece el día de nacimiento de la persona si la fecha es válida.
	 *
	 * @param año El año de nacimiento.
	 * @param mes El mes de nacimiento.
	 * @param dia El día de nacimiento.
	 */
	public void setDia(int ano, int mes, int dia) {
		if (Fecha.fechaValida(ano, mes, dia)) {
			this.dia = dia;
		}

	}

	/**
	 * Obtiene el mes de nacimiento de la persona.
	 *
	 * @return El mes de nacimiento de la persona.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Establece el mes de nacimiento de la persona si la fecha es válida.
	 *
	 * @param año El año de nacimiento.
	 * @param mes El mes de nacimiento.
	 * @param dia El día de nacimiento.
	 */
	public void setMes(int ano, int mes, int dia) {
		if (Fecha.fechaValida(ano, mes, dia)) {
			this.mes = mes;
		}

	}

	/**
	 * Obtiene el año de nacimiento de la persona.
	 *
	 * @return El año de nacimiento de la persona.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Establece el año de nacimiento de la persona si la fecha es válida.
	 *
	 * @param ano El nuevo año de nacimiento.
	 * @param mes El mes de nacimiento.
	 * @param dia El día de nacimiento.
	 */
	public void setAno(int ano, int mes, int dia) {
		if (Fecha.fechaValida(ano, mes, dia)) {
			this.ano = ano;
		}

	}

	/**
	 * Implementación del método de la interfaz IMostrable para obtener una cadena
	 * de texto con la información del cliente registrado.
	 * 
	 * @return Cadena de texto con la información del cliente registrado.
	 */
	/* Metodos */
	@Override
	public String dameCadena() {
		String cadena = super.dameCadena();
		cadena = cadena + FECHA + dia + "/" + mes + "/" + ano + "/" + "\s";

		return cadena;
	}

	/**
	 * Obtiene una lista de usuarios (clientes registrados).
	 * 
	 * @param n Parametro para identificar al cliente invitado.
	 * @return Lista de usuarios.
	 */
	public static ArrayList<ClienteRegistrado> obtenerElementos(int n) {

		if (clientes == null) {
			clientes = new ArrayList<ClienteRegistrado>();
		}

		if (n == 0) {
			ClienteRegistrado invitado = new ClienteRegistrado();
			clientes.add(invitado);

			return clientes;

		} else {
			ClienteRegistrado juan = new ClienteRegistrado();
			juan.setCorreo(JUAN_CORREO);
			juan.setContrasena(JUAN);
			juan.setNombre(JUAN);
			juan.setApellidos(APELLIDO);
			juan.setDireccion(DIRE_DERE);
			juan.setDia(ANO, UNO, UNO);
			juan.setMes(ANO, UNO, UNO);
			juan.setAno(ANO, UNO, UNO);
			clientes.add(juan);

			ClienteRegistrado pedro = new ClienteRegistrado();
			pedro.setCorreo(PEDRO_CORREO);
			pedro.setContrasena(PEDRO);
			pedro.setNombre(PEDRO);
			pedro.setApellidos(APELLIDO);
			pedro.setDireccion(DIRE_IZQ);
			pedro.setDia(ANO, UNO, UNO);
			pedro.setMes(ANO, UNO, UNO);
			pedro.setAno(ANO, UNO, UNO);
			clientes.add(pedro);

			ClienteRegistrado jose = new ClienteRegistrado();
			jose.setCorreo(JOSE_CORREO);
			jose.setContrasena(JOSE);
			jose.setNombre(JOSE);
			jose.setApellidos(APELLIDO);
			jose.setDireccion(DIRE_DERE);
			jose.setDia(ANO, UNO, UNO);
			jose.setMes(ANO, UNO, UNO);
			jose.setAno(ANO, UNO, UNO);
			clientes.add(jose);

			ClienteRegistrado leo = new ClienteRegistrado();
			leo.setCorreo(LEO_CORREO);
			leo.setContrasena(LEO);
			leo.setNombre(LEO);
			leo.setApellidos(APELLIDO);
			leo.setDireccion(DIRE_IZQ);
			leo.setDia(ANO, UNO, UNO);
			leo.setMes(ANO, UNO, UNO);
			leo.setAno(ANO, UNO, UNO);
			clientes.add(leo);

			ClienteRegistrado miguel = new ClienteRegistrado();
			miguel.setCorreo(MIGUEL_CORREO);
			miguel.setContrasena(MIGUEL);
			miguel.setNombre(MIGUEL);
			miguel.setApellidos(APELLIDO);
			miguel.setDireccion(DIRE_IZQ);
			miguel.setDia(ANO, UNO, UNO);
			miguel.setMes(ANO, UNO, UNO);
			miguel.setAno(ANO, UNO, UNO);
			clientes.add(miguel);

			return clientes;
		}

	}

	/**
	 * Busca un cliente registrado por su correo electrónico.
	 * 
	 * @param correo Correo electrónico del cliente a buscar.
	 * @return Objeto ClienteRegistrado si se encuentra, o null si no se encuentra.
	 */
	public static ClienteRegistrado buscarCliente(String correo) {

		ClienteRegistrado aux = null;

		for (ClienteRegistrado cliente : ClienteRegistrado.obtenerElementos(1)) {
			if (cliente.getCorreo().equals(correo)) {
				aux = cliente;
			}
		}
		return aux;
	}

	/**
	 * Agrega el cliente registrado a la lista de clientes.
	 */
	public void addCliente() {
		if (clientes == null) {
			clientes = new ArrayList<ClienteRegistrado>();
		}
		clientes.add(this);

	}

	/**
	 * Inicializa las listas asociadas al cliente registrado (pedidos, métodos de
	 * pago, formas de envío, direcciones).
	 */
	public void crearListas() {
		if (pedidos == null) {
			pedidos = new ArrayList<Pedido>();

		}
		if (metodosPago == null) {
			metodosPago = new ArrayList<MetodoPago>();

		}
		if (formasEnvio == null) {
			formasEnvio = new ArrayList<FormaEnvio>();

		}
		if (direcciones == null) {
			direcciones = new ArrayList<String>();

		}
	}

}
