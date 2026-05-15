package es.poo.practica2.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import es.poo.practica2.apoyo.Fecha;
import es.poo.practica2.apoyo.Utilidades;

public class Main {

	/* Constantes */
	private static final String TIENDA = "/********** TIENDA VIRTUAL POO ***************/";
	private static final String LETRA_RAIS = "Ingrese una letra (R, A, I o S): ";
	private static final String BARRAS = "-----------------------------------";
	private static final String R_REGISTRADO = "(R) Usuario registrado";
	private static final String A_ALTA = "(A) Alta de usuario";
	private static final String I_INVITADO = "(I) Usuario invitado";
	private static final String S_SALIR = "(S) Salir: Saldrá del programa";
	private static final String SELECCIONE = "Seleccione una opción: ";
	private static final String LETRA_RAIS2 = "RAIS";
	private static final String DIME_CORREO = "Dime tu correo electronico";
	private static final int CERO = 0;
	private static final int UNO = 1;
	private static final int DOS = 2;
	private static final int TRES = 3;
	private static final String LETRA_BLV = "Ingrese una letra (B, L o V): ";
	private static final String B_BUSCAR = "(B) Buscar producto";
	private static final String L_LISTA = "(L) Listar productos seleccionados";
	private static final String V_VOLVER = "(V) Volver al menú anterior";
	private static final String LETRA_BLV2 = "BLV";
	private static final String NO_PEDIDOS = "No ha realizado ningun pedido";
	private static final String LETRA_ALDV = "Ingrese una letra (A, L, D o V): ";
	private static final String A_ALIMENTACION = "(A) Alimentación";
	private static final String L_LIBROS = "(L) Libros";
	private static final String D_DISCOS = "(D) Discos";
	private static final String LETRA_ALDV2 = "ALDV";
	private static final String DATOS_A = "Codigo  Descripcion  Precio    Impuestos  Total  Fecha de caducidad";
	private static final String DATOS_L = "Codigo  Descripcion  Precio  Impuestos  Total  codigo ISBN   Titulo   Autor"
			+ "                 Editorial";
	private static final String DATOS_D = "Codigo  Descripcion      Precio  Impuestos   Total  Artista o Grupo   Genero";
	private static final String ACCIONES = "Acciones:";
	private static final String AGREGAR = "(A) Agregar producto al pedido";
	private static final String LETRA_AV = "AV";
	private static final String LINEA = "Indique la línea del pedido:";
	private static final String NO_VALID = "Opción no válida. Por favor elija una opcion valida";
	private static final String ELEJIDO = "Ha elejido la opcion ";
	private static final String CUANTO = "Cuantas unidades desea";
	private static final String NUMERO_PED = "numero de pedidos realizado: ";
	private static final String DESEA_MAS = "¿Desea agregar otro producto? (S/N):";
	private static final String SI_NO = "SN";
	private static final String LISTA = "Codigo  Descripcion  Precio Neto  Cantidad  Impuestos  Total";
	private static final String LETRA_FRV = "Ingrese una letra (F, R o V): ";
	private static final String F_FORMALIZAR = "(F) Formalizar Compra ";
	private static final String R_VACIAR = "(R) Vaciar Productos";
	private static final String LETRA_FRV2 = "FRV";
	private static final String VACIADO = "Ha vaciado la cesta ";
	private static final String PASOS = "A continuación, le guiaremos en el proceso de compra del pedido, para ello pasará por los "
			+ "siguientes pasos:";
	private static final String PASO1 = "Paso1. Opción de envío";
	private static final String PASO2 = "Paso2. Dirección de envío";
	private static final String PASO3 = "Paso3. Forma de pago";
	private static final String PASO4 = "Paso4. Resumen y confirmación";
	private static final String A = "(A) ";
	private static final String B = "(B) ";
	private static final String C = "(C) ";
	private static final String D = "(D) ";
	private static final String LETRA_ABCDV = "ABCDV";
	private static final String HA_A = "Ha elegido la opcion A";
	private static final String HA_B = "Ha elegido la opcion B";
	private static final String HA_C = "Ha elegido la opcion C";
	private static final String HA_D = "Ha elegido la opcion D";
	private static final String P_PASO2 = "Paso 1 >> Paso2. Dirección de envío";
	private static final String MISMA_DIRE = "Le gustaría utilizar la dirección de envío que tenemos registrada para usted? (S/N)";
	private static final String INTRO_DIRE = "Introduzca la dirección de envío:";
	private static final String P_PASO3 = "Paso 1 >> Paso2 >> Paso3. Forma de pago";
	private static final String P_LETRA = "(P) Paypal";
	private static final String T_LETRA = "(T) Tarjeta de crédito";
	private static final String LETRA_PTV = "PTV";
	private static final String US_PAY = "Usuario paypal:";
	private static final String FE_CAD = "A continuacion ingrese la fecha de caducidad";
	private static final String INTRO_DIA = "Ingrese el dia";
	private static final String INTRO_MES = "Ingrese el mes";
	private static final String INTRO_ANO = "Ingrese el año";
	private static final String FECHA_INVA = "La fecha no es válida. Inténtalo de nuevo.";
	private static final String INTRO_NUM = "Ingrese el numero de tarjeta de crédito (debe tener 16 caracteres numericos):";
	private static final String FECHA_CAD = "A continuacion ingrese la fecha de caducidad";
	private static final String INTRO_CVC = "Ingrese el CVC:";
	private static final String CVC_INV = "La CVC no es válido, debe tener 3 números. Inténtalo de nuevo.";
	private static final String INTRO_TIT = "Ingrese el titular de la tarjeta:";
	private static final String TIPO_TAR = "Que tipo de Tarjeta usa?";
	private static final String A_LETRA = "(A) American";
	private static final String B_LETRA = "(B) 4B";
	private static final String E_LETRA = "(E) Euro600";
	private static final String I_LETRA = "(I) VISA";
	private static final String LETRA_ABEI = "ABEI";
	private static final String P_PASO4 = "Paso 1 >> Paso2 >> Paso3 >> Paso4. Resumen y confirmación";
	private static final String IMP_NETO = "Importe Neto total: ";
	private static final String IMPU = "Impuestos: ";
	private static final String EURO = "€";
	private static final String GASTO_ENV = "Gastos de envío: ";
	private static final String TOT = "IMPORTE TOTAL: ";
	private static final String PASS4 = "Paso4. Resumen y confirmación:";
	private static final String REALIZAR = "(R) Realizar pedido";
	private static final String DESCARTAR = "(D) Descartar pedido";
	private static final String LETRA_RDV = "RDV";
	private static final String FIN = "PEDIDO REALIZADO CORRECTAMENTE, ESPERAMOS VERLE PRONTO EN NUESTRA TIENDA ☺";
	private static final String FIN2 = "PEDIDO DESCARTADO CORRECTAMENTE";
	private static final String DIME_CORREO2 = "Dime tu correo";
	private static final String DIME_NOMBRE = "Dime tu nombre";
	private static final String DIME_AP = "Dime tus apellidos";
	private static final String DIME_FEHCA = "A continuacion dime tu fecha de nacimiento";
	private static final String DIME_DIA = "Dime el dia";
	private static final String DIME_MES = "Dime el mes";
	private static final String DIME_ANO = "Dime el año";
	private static final String DIME_DIRE = "Dime tu direccion";
	private static final String CORREO_INV = "Correo electrónico incorrecto. No se encontró ningún cliente con ese correo.";
	private static final String DIME_CON = "Dime la contraseña";
	private static final String CRED_VA = "Credenciales válidas. Acceso permitido.";
	private static final String CRED_INV = "Contraseña incorrecta. Acceso denegado.";
	private static final String INTENTA = "(R) Intertar de nuevo";
	private static final String LETRA_RV = "RV";

	public static void main(String[] args) {

		menuInicial();

		Utilidades.cerrarScanner();
	}

	/**
	 * Menú inicial del programa que presenta opciones al usuario.
	 */
	private static void menuInicial() {
		boolean i = true;
		do {
			System.out.println(TIENDA);
			System.out.println(LETRA_RAIS);
			System.out.println(BARRAS);
			System.out.println(R_REGISTRADO);
			System.out.println(A_ALTA);
			System.out.println(I_INVITADO);
			System.out.println(S_SALIR);
			System.out.println(BARRAS);
			System.out.println(SELECCIONE);

			// Obtener letra válida del usuario.
			char letra = Utilidades.obtenerLetraValida(LETRA_RAIS2);
			Pedido pedido = null;
			switch (letra) {
			case 'R':
				menu2(existeCliente(Utilidades.imprimir(DIME_CORREO)), pedido);
				break;
			case 'A':
				menu2(add(), pedido);
				break;
			case 'I':
				menu2(ClienteRegistrado.obtenerElementos(CERO).get(CERO), pedido);
				break;
			case 'S':
				i = false;
				break;

			}
		} while (i);

	}

	/**
	 * Menú secundario que presenta opciones relacionadas con la gestión de
	 * productos y pedidos.
	 * 
	 * @param cliente Cliente registrado que realiza las acciones.
	 * @param pedido  Pedido actual en el proceso de compra.
	 */
	private static void menu2(ClienteRegistrado cliente, Pedido pedido) {

		System.out.println(LETRA_BLV);
		System.out.println(BARRAS);
		System.out.println(B_BUSCAR);
		System.out.println(L_LISTA);
		System.out.println(V_VOLVER);
		System.out.println(BARRAS);
		System.out.println(SELECCIONE);
		char letra = Utilidades.obtenerLetraValida(LETRA_BLV2);

		if (pedido == null) {
			pedido = new Pedido();
			pedido.setCliente(cliente);
		}

		switch (letra) {
		case 'B':
			menuProducto(cliente, pedido);
			break;
		case 'L':
			if (!pedido.lp.isEmpty()) {
				menuLista(cliente, pedido);
			} else {
				System.out.println(NO_PEDIDOS);
				menu2(cliente, pedido);
			}
			break;
		case 'V':
			menuInicial();
			break;

		}

	}

	/**
	 * Menú de selección de tipo de producto y acciones relacionadas.
	 * 
	 * @param cliente Cliente registrado que realiza las acciones.
	 * @param pedido  Pedido actual en el proceso de compra.
	 */
	private static void menuProducto(ClienteRegistrado cliente, Pedido pedido) {

		System.out.println(LETRA_ALDV);
		System.out.println(BARRAS);
		System.out.println(A_ALIMENTACION);
		System.out.println(L_LIBROS);
		System.out.println(D_DISCOS);
		System.out.println(V_VOLVER);
		System.out.println(BARRAS);
		System.out.println(SELECCIONE);

		char letra = Utilidades.obtenerLetraValida(LETRA_ALDV2);

		switch (letra) {
		case 'A':
			// Muestra los prodcutos de tipo ProductoAlimentario
			ProductoAlimentario productoA = new ProductoAlimentario();
			System.out.println(DATOS_A);
			for (int i = CERO; i < productoA.obtenerElementos().size(); i++) {
				System.out.println((i + UNO) + "\s" + productoA.obtenerElementos().get(i).dameCadena() + "\n ");

			}

			acciones(cliente, pedido, productoA);

			break;
		case 'L':
			// Muestra los prodcutos de tipo ProductoLibro
			ProductoLibro productoL = new ProductoLibro();
			System.out.println(DATOS_L);
			for (int i = CERO; i < productoL.obtenerElementos().size(); i++) {
				System.out.println((i + UNO) + "\s" + productoL.obtenerElementos().get(i).dameCadena() + "\n ");
			}

			acciones(cliente, pedido, productoL);
			break;
		case 'D':
			// Muestra los prodcutos de tipo ProductoDisco
			ProductoDisco productoD = new ProductoDisco();
			System.out.println(DATOS_D);
			for (int i = CERO; i < productoD.obtenerElementos().size(); i++) {
				System.out.println((i + UNO) + "\s" + productoD.obtenerElementos().get(i).dameCadena() + "\n ");
			}

			acciones(cliente, pedido, productoD);
			break;
		case 'V':
//			cliente.pedidos.add(pedido);
			menu2(cliente, pedido);
			break;

		}

	}

	/**
	 * Realizar acciones relacionadas con la gestión de productos.
	 * 
	 * @param cliente  Cliente registrado que realiza las acciones.
	 * @param pedido   Pedido actual en el proceso de compra.
	 * @param producto Producto seleccionado.
	 */
	private static void acciones(ClienteRegistrado cliente, Pedido pedido, Producto producto) {

		System.out.println(ACCIONES);
		System.out.println(AGREGAR);
		System.out.println(V_VOLVER);
		System.out.println(SELECCIONE);
		char letra = Utilidades.obtenerLetraValida(LETRA_AV);
		switch (letra) {

		case 'A':

			int opcion;
			char otro;

			do {
				do {
					opcion = Utilidades.obtenerEntero(LINEA);

					if (opcion > producto.obtenerElementos().size()) {
						System.out.println(NO_VALID);

					}

				} while (opcion > producto.obtenerElementos().size());

				LineaPedido linea = new LineaPedido();
				linea.setProducto(producto.obtenerElementos().get(opcion - UNO));
				System.out.println(ELEJIDO + opcion);
				linea.setCantidad(Utilidades.obtenerEntero(CUANTO));
				pedido.lp.add(linea);
				System.out.println(NUMERO_PED + pedido.lp.size());
				System.out.println(DESEA_MAS);
				otro = Utilidades.obtenerLetraValida(SI_NO);

			} while (otro == 'S');
			menuProducto(cliente, pedido);
			break;
		case 'V':
			menuProducto(cliente, pedido);
			break;

		}

	}

	/**
	 * Menú de visualización y acciones sobre la lista de productos seleccionados en
	 * el pedido.
	 * 
	 * @param cliente Cliente registrado que realiza las acciones.
	 * @param pedido  Pedido actual en el proceso de compra.
	 */
	private static void menuLista(ClienteRegistrado cliente, Pedido pedido) {
		System.out.println(pedido.lp.size());

		System.out.println(LISTA);
		for (int i = CERO; i < pedido.lp.size(); i++) {
			System.out.println((i + UNO) + "\s" + pedido.lp.get(i).dameCadena() + "\n ");
		}

		System.out.println(LETRA_FRV);
		System.out.println(BARRAS);
		System.out.println(F_FORMALIZAR);
		System.out.println(R_VACIAR);
		System.out.println(V_VOLVER);
		System.out.println(BARRAS);
		System.out.println(SELECCIONE);
		char letra = Utilidades.obtenerLetraValida(LETRA_FRV2);
		switch (letra) {
		case 'F':
			formalizar(cliente, pedido);
			break;
		case 'R':
			pedido.lp.clear();
			System.out.println(VACIADO);
			menuProducto(cliente, pedido);
			break;
		case 'V':
			menu2(cliente, pedido);
			break;

		}

	}

	/**
	 * Proceso de formalización del pedido, incluyendo la selección de envío,
	 * dirección y forma de pago.
	 * 
	 * @param cliente Cliente registrado que realiza las acciones.
	 * @param pedido  Pedido actual en el proceso de compra.
	 */
	private static void formalizar(ClienteRegistrado cliente, Pedido pedido) {
		System.out.println(BARRAS);
		System.out.println(PASOS);
		System.out.println(PASO1);
		System.out.println(PASO2);
		System.out.println(PASO3);
		System.out.println(PASO4);
		System.out.println(BARRAS);

		System.out.println(PASO1);
		System.out.println(A + FormaEnvio.damePrestamos().get(CERO).dameCadena());
		System.out.println(B + FormaEnvio.damePrestamos().get(UNO).dameCadena());
		System.out.println(C + FormaEnvio.damePrestamos().get(DOS).dameCadena());
		System.out.println(D + FormaEnvio.damePrestamos().get(TRES).dameCadena());
		System.out.println(V_VOLVER);
		System.out.println(SELECCIONE);
		char letra = Utilidades.obtenerLetraValida(LETRA_ABCDV);
		switch (letra) {

		case 'A':
			System.out.println(HA_A);
			pedido.setFe(FormaEnvio.damePrestamos().get(CERO));
			paso2(cliente, pedido);
			paso3(cliente, pedido);
			paso4(cliente, pedido);
			break;
		case 'B':
			System.out.println(HA_B);
			pedido.setFe(FormaEnvio.damePrestamos().get(UNO));
			paso2(cliente, pedido);
			paso3(cliente, pedido);
			paso4(cliente, pedido);
			break;
		case 'C':
			System.out.println(HA_C);
			pedido.setFe(FormaEnvio.damePrestamos().get(DOS));
			paso2(cliente, pedido);
			paso3(cliente, pedido);
			paso4(cliente, pedido);

			break;
		case 'D':
			System.out.println(HA_D);
			pedido.setFe(FormaEnvio.damePrestamos().get(TRES));
			paso2(cliente, pedido);
			paso3(cliente, pedido);
			paso4(cliente, pedido);
			break;
		case 'V':
			menuLista(cliente, pedido);

			break;

		}

	}

	/**
	 * Paso 2 del proceso de formalización: introducción de la dirección de envío.
	 * 
	 * @param cliente Cliente registrado que realiza las acciones.
	 * @param pedido  Pedido actual en el proceso de compra.
	 */
	private static void paso2(ClienteRegistrado cliente, Pedido pedido) {
		System.out.println(BARRAS);
		System.out.println(P_PASO2);
		System.out.println(BARRAS);

		if (!(cliente.getDireccion() == null)) {
			System.out.println(MISMA_DIRE);
			char letra = Utilidades.obtenerLetraValida(SI_NO);
			if (letra == 'N') {
				pedido.setDireccion(Utilidades.imprimir(INTRO_DIRE));
			} else {
				pedido.setDireccion(cliente.getDireccion());
			}
		} else {
			pedido.setDireccion(Utilidades.imprimir(INTRO_DIRE));
		}

	}

	/**
	 * Paso 3 del proceso de formalización: selección de forma de pago.
	 * 
	 * @param cliente Cliente registrado que realiza las acciones.
	 * @param pedido  Pedido actual en el proceso de compra.
	 */
	private static void paso3(ClienteRegistrado cliente, Pedido pedido) {
		System.out.println(BARRAS);
		System.out.println(P_PASO3);
		System.out.println(BARRAS);

		System.out.println(P_LETRA);
		System.out.println(T_LETRA);
		System.out.println(V_VOLVER);

		char letra = Utilidades.obtenerLetraValida(LETRA_PTV);
		switch (letra) {

		case 'P':
			pedido.setMp(paso3Paypal());

			break;
		case 'T':
			pedido.setMp(paso3Tarjeta());

			break;

		case 'V':
			menuLista(cliente, pedido);

			break;

		}
	}

	/**
	 * Paso 3 del proceso de formalización: introducción de detalles de cuenta de
	 * Paypal.
	 * 
	 * @return Objeto de tipo Paypal con la información ingresada.
	 */
	private static MetodoPago paso3Paypal() {
		Paypal mp = new Paypal();
		mp.setUsuario(Utilidades.imprimir(US_PAY));
		System.out.println(FE_CAD);

		int dia, mes, ano;
		// Verificar fecha
		do {
			dia = Utilidades.obtenerEntero(INTRO_DIA);
			mes = Utilidades.obtenerEntero(INTRO_MES);
			ano = Utilidades.obtenerEntero(INTRO_ANO);

			if (!Fecha.fechaValida3(ano, mes, dia)) {
				System.out.println(FECHA_INVA);
			}

		} while ((!Fecha.fechaValida3(ano, mes, dia)));

		mp.setDia(ano, mes, dia);
		mp.setMes(ano, mes, dia);
		mp.setAno(ano, mes, dia);

		return mp;

	}

	/**
	 * Paso 3 del proceso de formalización: introducción de detalles de tarjeta de
	 * crédito.
	 * 
	 * @return Objeto de tipo TarjetaCredito con la información ingresada.
	 */
	private static MetodoPago paso3Tarjeta() {

		TarjetaCredito mp = new TarjetaCredito();
		tipoTarjeta(mp);

		int mes2, ano2;
		String cvc, numero;

		// validar el numero de la tarjeta de credito
		do {
			numero = Utilidades.imprimir(INTRO_NUM);
		} while (!TarjetaCredito.validarNumero(numero));
		mp.setNumero(numero);

		// validar fecha
		do {
			System.out.println(FECHA_CAD);
			mes2 = Utilidades.obtenerEntero(INTRO_MES);
			ano2 = Utilidades.obtenerEntero(INTRO_ANO);

			if (!Fecha.fechaValida(ano2, mes2)) {
				System.out.println(FECHA_INVA);
			}
		} while (!Fecha.fechaValida(ano2, mes2));

		mp.setMes(ano2, mes2);
		mp.setAno(ano2, mes2);

		// validr cvc
		do {
			cvc = Utilidades.imprimir(INTRO_CVC);
			if (!TarjetaCredito.validarCVC(cvc)) {
				System.out.println(CVC_INV);
			}

		} while (!TarjetaCredito.validarCVC(cvc));

		mp.setCvc(cvc);
		mp.setTitular(Utilidades.imprimir(INTRO_TIT));

		return mp;

	}

	/**
	 * Permite al usuario seleccionar el tipo de tarjeta de crédito que desea
	 * utilizar.
	 * 
	 * @param mp Objeto de tipo TarjetaCredito al cual se asignará el tipo de
	 *           tarjeta seleccionado.
	 */
	private static void tipoTarjeta(TarjetaCredito mp) {
		System.out.println(TIPO_TAR);
		System.out.println(A_LETRA);
		System.out.println(B_LETRA);
		System.out.println(E_LETRA);
		System.out.println(I_LETRA);
		char letra = Utilidades.obtenerLetraValida(LETRA_ABEI);
		switch (letra) {

		case 'A':
			mp.setTarjeta(TipoTarjeta.AMERICAN);
			break;

		case 'B':
			mp.setTarjeta(TipoTarjeta.B4);
			break;

		case 'E':
			mp.setTarjeta(TipoTarjeta.EURO600);
			break;

		case 'I':
			mp.setTarjeta(TipoTarjeta.VISA);
			break;

		}

	}

	/**
	 * Finaliza el proceso de compra mostrando un resumen y ofreciendo opciones para
	 * realizar o descartar el pedido.
	 * 
	 * @param cliente Objeto ClienteRegistrado que representa al cliente que realiza
	 *                la compra.
	 * @param pedido  Objeto Pedido que contiene la información de la compra.
	 */
	private static void paso4(ClienteRegistrado cliente, Pedido pedido) {

		// Mostrar los datos del pedido
		cliente.crearListas();
		System.out.println(BARRAS);
		System.out.println(P_PASO4);
		System.out.println(BARRAS);
		System.out.println(pedido.dameCadena());
		System.out.println(LISTA);
		double netoTotal = CERO;
		double impuestoTotal = CERO;

		// Mostrar la lista de productos seleccionados con todos sus detalles
		for (int i = CERO; i < pedido.lp.size(); i++) {
			System.out.println((i + UNO) + "\s" + pedido.lp.get(i).dameCadena() + "\n ");
			netoTotal = netoTotal + pedido.lp.get(i).getProducto().getPrecioSin() * pedido.lp.get(i).getCantidad();
			impuestoTotal = impuestoTotal + pedido.lp.get(i).getProducto().getPrecioSin()
					* pedido.lp.get(i).getCantidad() * pedido.lp.get(i).getProducto().getImpuestos();
		}

		// Mostrar su precio final
		double total = netoTotal + impuestoTotal + pedido.getFe().getCoste();
		System.out.println(BARRAS);
		System.out.println(IMP_NETO + netoTotal + EURO);
		System.out.println(IMPU + impuestoTotal + EURO);
		System.out.println(GASTO_ENV + pedido.getFe().getCoste() + EURO);
		System.out.println(TOT + total + EURO);
		System.out.println(BARRAS);
		fianl(cliente, pedido);

	}

	/**
	 * Ofrece opciones al usuario para finalizar la compra, descartarla o volver al
	 * menú anterior.
	 * 
	 * @param cliente Objeto ClienteRegistrado que representa al cliente que realiza
	 *                la compra.
	 * @param pedido  Objeto Pedido que contiene la información de la compra.
	 */
	private static void fianl(ClienteRegistrado cliente, Pedido pedido) {
		System.out.println(PASS4);
		System.out.println(REALIZAR);
		System.out.println(DESCARTAR);
		System.out.println(V_VOLVER);
		System.out.println(SELECCIONE);
		char letra = Utilidades.obtenerLetraValida(LETRA_RDV);
		switch (letra) {
		case 'R':
			cliente.crearListas();
			cliente.pedidos.add(pedido);
			cliente.metodosPago.add(pedido.getMp());
			cliente.formasEnvio.add(pedido.getFe());
			cliente.direcciones.add(pedido.getDireccion());
			System.out.println(FIN);

			break;

		case 'D':

			pedido = null;
			System.out.println(FIN2);

			break;

		case 'V':

			menuLista(cliente, pedido);

			break;

		}
	}

	/**
	 * Permite al usuario registrar un nuevo cliente.
	 * 
	 * @return Objeto ClienteRegistrado creado con la información proporcionada por
	 *         el usuario.
	 */
	private static ClienteRegistrado add() {

		ClienteRegistrado c = new ClienteRegistrado();

		c.setCorreo(Utilidades.imprimir(DIME_CORREO2));
		c.setNombre(Utilidades.imprimir(DIME_NOMBRE));
		c.setApellidos(Utilidades.imprimir(DIME_AP));

		System.out.println(DIME_FEHCA);

		int dia, mes, ano;

		do {
			dia = Utilidades.obtenerEntero(DIME_DIA);
			mes = Utilidades.obtenerEntero(DIME_MES);
			ano = Utilidades.obtenerEntero(DIME_ANO);

			if (!Fecha.fechaValida(ano, mes, dia)) {
				System.out.println(FECHA_INVA);
			}
		} while (!Fecha.fechaValida(ano, mes, dia));

		c.setDia(ano, mes, dia);
		c.setMes(ano, mes, dia);
		c.setAno(ano, mes, dia);
		c.setDireccion(Utilidades.imprimir(DIME_DIRE));
		c.addCliente();

		return c;

	}

	/**
	 * Busca un cliente en la lista de clientes registrados por su correo
	 * electrónico.
	 * 
	 * @param correo El correo electrónico del cliente que se está buscando.
	 * @return Un objeto de tipo Cliente si se encuentra, o null si no se encuentra.
	 */
	private static ClienteRegistrado existeCliente(String correo) {

		if (ClienteRegistrado.buscarCliente(correo) == null) {
			// Imprime un mensaje si no se encontró el cliente
			System.out.println(CORREO_INV);
			menuReintentar();
		} else {
			autentificar(ClienteRegistrado.buscarCliente(correo));
		}
		return ClienteRegistrado.buscarCliente(correo);

	}

	/**
	 * Autentica al usuario verificando su contraseña.
	 * 
	 * @param cliente Objeto ClienteRegistrado que se está autenticando.
	 */
	private static void autentificar(ClienteRegistrado cliente) {

		if (cliente.getContrasena().equals(Utilidades.imprimir(DIME_CON))) {
			// Credenciales válidas
			System.out.println(CRED_VA);
		}else{
			// Contraseña incorrecta
			System.out.println(CRED_INV);
			menuReintentar();

		}

	}

	/**
	 * Muestra un menú para reintentar el inicio de sesión o volver al menú
	 * anterior.
	 */
	private static void menuReintentar() {
		System.out.println(INTENTA);
		System.out.println(V_VOLVER);
		System.out.println(SELECCIONE);
		char letra = Utilidades.obtenerLetraValida(LETRA_RV);
		switch (letra) {
		case 'V':
			menuInicial();
			break;
		case 'R':
			existeCliente(Utilidades.imprimir(DIME_CORREO));
			break;

		}
	}

}
