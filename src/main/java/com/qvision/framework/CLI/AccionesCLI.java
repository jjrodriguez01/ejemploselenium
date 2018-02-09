package com.qvision.framework.CLI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AccionesCLI extends FuncionesRobot{


	/**
	 * Funcion que presiona una tecla mediante el robot java
	 * 
	 * @param temporal
	 *            tecla a presionar
	 * @param valor_1
	 *            cantidad de veces
	 * @return
	 */
	public String Tecla(String temporal, String valor_1) throws AWTException {
		String salida = "0";
		Robot r = new Robot();
		StringSelection stringSeleccion = new StringSelection(temporal);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSeleccion, null);
		r.delay(500);
		if (salida.equals("0")) {
			switch (temporal.toUpperCase()) {
			case "F1":
				r.keyPress(KeyEvent.VK_F1);
				r.keyRelease(KeyEvent.VK_F1);
				break;
			case "F2":
				r.keyPress(KeyEvent.VK_F2);
				r.keyRelease(KeyEvent.VK_F2);
				break;
			case "F3":
				r.keyPress(KeyEvent.VK_F3);
				r.keyRelease(KeyEvent.VK_F3);
				break;
			case "F4":
				r.keyPress(KeyEvent.VK_F4);
				r.keyRelease(KeyEvent.VK_F4);
				break;
			case "F5":
				r.keyPress(KeyEvent.VK_F5);
				r.keyRelease(KeyEvent.VK_F5);
				break;
			case "F6":
				r.keyPress(KeyEvent.VK_F6);
				r.keyRelease(KeyEvent.VK_F6);
				break;

			case "F7":
				r.keyPress(KeyEvent.VK_F7);
				r.keyRelease(KeyEvent.VK_F7);
				break;
			case "F8":
				r.keyPress(KeyEvent.VK_F8);
				r.keyRelease(KeyEvent.VK_F8);
				break;
			case "F9":
				r.keyPress(KeyEvent.VK_F9);
				r.keyRelease(KeyEvent.VK_F9);
				break;
			case "F10":
				r.keyPress(KeyEvent.VK_F10);
				r.keyRelease(KeyEvent.VK_F10);
				break;
			case "F11":
				r.keyPress(KeyEvent.VK_F11);
				r.keyRelease(KeyEvent.VK_F11);
				break;
			case "F12":
				r.keyPress(KeyEvent.VK_F12);
				r.keyRelease(KeyEvent.VK_F12);
				break;
			case "F13":
				r.keyPress(KeyEvent.VK_F13);
				r.keyRelease(KeyEvent.VK_F13);
				break;
			case "F14":
				r.keyPress(KeyEvent.VK_F14);
				r.keyRelease(KeyEvent.VK_F14);
				break;
			case "F15":
				r.keyPress(KeyEvent.VK_F15);
				r.keyRelease(KeyEvent.VK_F15);
				break;
			case "F16":
				r.keyPress(KeyEvent.VK_F16);
				r.keyRelease(KeyEvent.VK_F16);
				break;
			case "F17":
				r.keyPress(KeyEvent.VK_F17);
				r.keyRelease(KeyEvent.VK_F17);
				break;
			case "F18":
				r.keyPress(KeyEvent.VK_F18);
				r.keyRelease(KeyEvent.VK_F18);
				break;
			case "F19":
				r.keyPress(KeyEvent.VK_F19);
				r.keyRelease(KeyEvent.VK_F19);
			case "F20":
				r.keyPress(KeyEvent.VK_F20);
				r.keyRelease(KeyEvent.VK_F20);
				break;
			case "1":
				r.keyPress(KeyEvent.VK_1);
				r.keyRelease(KeyEvent.VK_1);
				break;
			case "2":
				r.keyPress(KeyEvent.VK_2);
				r.keyRelease(KeyEvent.VK_2);
				break;
			case "3":
				r.keyPress(KeyEvent.VK_3);
				r.keyRelease(KeyEvent.VK_3);
				break;
			case "4":
				r.keyPress(KeyEvent.VK_4);
				r.keyRelease(KeyEvent.VK_4);
				break;
			case "5":
				r.keyPress(KeyEvent.VK_5);
				r.keyRelease(KeyEvent.VK_5);
				break;
			case "6":
				r.keyPress(KeyEvent.VK_6);
				r.keyRelease(KeyEvent.VK_6);
				break;
			case "7":
				r.keyPress(KeyEvent.VK_7);
				r.keyRelease(KeyEvent.VK_7);
				break;
			case "8":
				r.keyPress(KeyEvent.VK_8);
				r.keyRelease(KeyEvent.VK_8);
				break;
			case "9":
				r.keyPress(KeyEvent.VK_9);
				r.keyRelease(KeyEvent.VK_9);
				break;
			case "ENTER":
				if (valor_1.equals("")) {
					valor_1 = "1";
				}
				for (int i = 0; i < Integer.parseInt(valor_1); i++) {
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
				}
				break;
			case "ESC":
				if (valor_1.equals("")) {
					valor_1 = "1";
				}
				for (int i = 0; i < Integer.parseInt(valor_1); i++) {
					r.keyPress(KeyEvent.VK_ESCAPE);
					r.keyRelease(KeyEvent.VK_ESCAPE);
				}
				break;
			case "TAB":
				if (valor_1.equals("")) {
					valor_1 = "1";
				}
				for (int i = 0; i < Integer.parseInt(valor_1); i++) {
					r.keyPress(KeyEvent.VK_TAB);
					r.keyRelease(KeyEvent.VK_TAB);
				}
				break;
			case "ARRIBA":
				if (valor_1.equals("")) {
					valor_1 = "1";
				}
				for (int i = 0; i < Integer.parseInt(valor_1); i++) {
					r.keyPress(KeyEvent.VK_KP_UP);
					r.keyRelease(KeyEvent.VK_KP_UP);
				}
				break;
			case "ABAJO":
				if (valor_1.equals("")) {
					valor_1 = "1";
				}
				for (int i = 0; i < Integer.parseInt(valor_1); i++) {
					r.keyPress(KeyEvent.VK_KP_DOWN);
					r.keyRelease(KeyEvent.VK_KP_DOWN);
				}
				break;
			case "DERECHA":
				if (valor_1.equals("")) {
					valor_1 = "1";
				}
				for (int i = 0; i < Integer.parseInt(valor_1); i++) {
					r.keyPress(KeyEvent.VK_KP_RIGHT);
					r.keyRelease(KeyEvent.VK_KP_RIGHT);
				}
				break;
			case "IZQUIERDA":
				if (valor_1.equals("")) {
					valor_1 = "1";
				}
				for (int i = 0; i < Integer.parseInt(valor_1); i++) {
					r.keyPress(KeyEvent.VK_KP_LEFT);
					r.keyRelease(KeyEvent.VK_KP_LEFT);
				}
				break;
			case "SUPR":
				if (valor_1.equals("")) {
					valor_1 = "1";
				}
				for (int i = 0; i < Integer.parseInt(valor_1); i++) {
					r.keyPress(KeyEvent.VK_DELETE);
					r.keyRelease(KeyEvent.VK_DELETE);
				}
				break;
			case "AvPag":
				if (valor_1.equals("")) {
					valor_1 = "1";
				}
				for (int i = 0; i < Integer.parseInt(valor_1); i++) {
					r.keyPress(KeyEvent.VK_PAGE_UP);
					r.keyRelease(KeyEvent.VK_PAGE_UP);
				}
				break;
			case "RePag":
				if (valor_1.equals("")) {
					valor_1 = "1";
				}
				for (int i = 0; i < Integer.parseInt(valor_1); i++) {
					r.keyPress(KeyEvent.VK_PAGE_DOWN);
					r.keyRelease(KeyEvent.VK_PAGE_DOWN);
				}
				break;
			default:
				break;
			}
			salida = "0";
		}
		return salida;
	}

	/**
	 * Presiona control+ tecla con robot de java
	 * 
	 * @param tecla
	 *            tecla a presionar junto con ctr
	 * @return String en 0
	 * @throws AWTException
	 */
	public String CtrTecla(String tecla) throws AWTException {
		String salida = "0";
		Robot r = new Robot();
		StringSelection stringSeleccion = new StringSelection(tecla);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSeleccion, null);
		r.delay(500);
		r.keyPress(KeyEvent.VK_CONTROL);
		if (salida.equals("0")) {
			switch (tecla.toUpperCase()) {
			case "F1":
				r.keyPress(KeyEvent.VK_F1);
				r.keyRelease(KeyEvent.VK_F1);
				break;
			case "F2":
				r.keyPress(KeyEvent.VK_F2);
				r.keyRelease(KeyEvent.VK_F2);
				break;
			case "F3":
				r.keyPress(KeyEvent.VK_F3);
				r.keyRelease(KeyEvent.VK_F3);
				break;
			case "F4":
				r.keyPress(KeyEvent.VK_F4);
				r.keyRelease(KeyEvent.VK_F4);
				break;
			case "F5":
				r.keyPress(KeyEvent.VK_F5);
				r.keyRelease(KeyEvent.VK_F5);
				break;
			case "F6":
				r.keyPress(KeyEvent.VK_F6);
				r.keyRelease(KeyEvent.VK_F6);
				break;
			case "F7":
				r.keyPress(KeyEvent.VK_F7);
				r.keyRelease(KeyEvent.VK_F7);
				break;
			case "F8":
				r.keyPress(KeyEvent.VK_F8);
				r.keyRelease(KeyEvent.VK_F8);
				break;
			case "F9":
				r.keyPress(KeyEvent.VK_F9);
				r.keyRelease(KeyEvent.VK_F9);
				break;
			case "F10":
				r.keyPress(KeyEvent.VK_F10);
				r.keyRelease(KeyEvent.VK_F10);
				break;
			case "F11":
				r.keyPress(KeyEvent.VK_F11);
				r.keyRelease(KeyEvent.VK_F11);
				break;
			case "F12":
				r.keyPress(KeyEvent.VK_F11);
				r.keyRelease(KeyEvent.VK_F12);
				break;
			case "F13":
				r.keyPress(KeyEvent.VK_F13);
				r.keyRelease(KeyEvent.VK_F13);
				break;
			case "F14":
				r.keyPress(KeyEvent.VK_F14);
				r.keyRelease(KeyEvent.VK_F14);
				break;
			case "F15":
				r.keyPress(KeyEvent.VK_F15);
				r.keyRelease(KeyEvent.VK_F15);
				break;
			case "F16":
				r.keyPress(KeyEvent.VK_F16);
				r.keyRelease(KeyEvent.VK_F16);
				break;
			case "F17":
				r.keyPress(KeyEvent.VK_F17);
				r.keyRelease(KeyEvent.VK_F17);
				break;
			case "F18":
				r.keyPress(KeyEvent.VK_F18);
				r.keyRelease(KeyEvent.VK_F18);
				break;
			case "F19":
				r.keyPress(KeyEvent.VK_F19);
				r.keyRelease(KeyEvent.VK_F19);
			case "F20":
				r.keyPress(KeyEvent.VK_F20);
				r.keyRelease(KeyEvent.VK_F20);
				break;
			case "Z":
				r.keyPress(KeyEvent.VK_Z);
				r.keyRelease(KeyEvent.VK_Z);
				break;
			case "C":
				r.keyPress(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_C);
				break;
			case "V":
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				break;
			case "X":
				r.keyPress(KeyEvent.VK_X);
				r.keyRelease(KeyEvent.VK_X);
				break;
			case "N":
				r.keyPress(KeyEvent.VK_N);
				r.keyRelease(KeyEvent.VK_N);
				break;
			default:
				break;
			}
			r.keyRelease(KeyEvent.VK_CONTROL);
			salida = "0";
		}

		return salida;
	}

	/**
	 * Presiona la tecla alt+tecla con robot java
	 * 
	 * @param tecla a presionar con alt
	 * @return String en 0
	 * @throws AWTException
	 */
	public String altTecla(String tecla) throws AWTException {
		String salida = "0";

		Robot r = new Robot();
		StringSelection stringSeleccion = new StringSelection(tecla);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSeleccion, null);
		r.delay(500);
		r.keyPress(KeyEvent.VK_ALT);
		if (salida.equals("0")) {
			for (int i = 0; i < 1; i++) {
				switch (tecla.codePointAt(i)) {
				case 49:
					r.keyPress(KeyEvent.VK_1);
					r.keyRelease(KeyEvent.VK_1);
					break;
				case 50:
					r.keyPress(KeyEvent.VK_2);
					r.keyRelease(KeyEvent.VK_2);
					break;
				case 51:
					r.keyPress(KeyEvent.VK_3);
					r.keyRelease(KeyEvent.VK_3);
					break;
				case 52:
					r.keyPress(KeyEvent.VK_4);
					r.keyRelease(KeyEvent.VK_4);
					break;
				case 53:
					r.keyPress(KeyEvent.VK_5);
					r.keyRelease(KeyEvent.VK_5);
					break;
				case 54:
					r.keyPress(KeyEvent.VK_6);
					r.keyRelease(KeyEvent.VK_6);
					break;
				case 55:
					r.keyPress(KeyEvent.VK_7);
					r.keyRelease(KeyEvent.VK_7);
					break;
				case 56:
					r.keyPress(KeyEvent.VK_8);
					r.keyRelease(KeyEvent.VK_8);
					break;
				case 57:
					r.keyPress(KeyEvent.VK_9);
					r.keyRelease(KeyEvent.VK_9);
					break;
				case 48:
					r.keyPress(KeyEvent.VK_0);
					r.keyRelease(KeyEvent.VK_0);
					break;
				case 39:
					r.keyPress(KeyEvent.VK_RIGHT);
					r.keyRelease(KeyEvent.VK_RIGHT);
					break;
				case 43:
					r.keyPress(KeyEvent.VK_PLUS);
					r.keyRelease(KeyEvent.VK_PLUS);
					break;
				default:
					if (tecla.toUpperCase().equals("F4")) {
						r.keyPress(KeyEvent.VK_F4);
						r.keyRelease(KeyEvent.VK_F4);
					}
					break;
				}
				r.keyRelease(KeyEvent.VK_ALT);
				salida = "0";
			}
		}

		return salida;
	}

	/**
	 * Presiona shift+tecla con robot java
	 * 
	 * @param tecla
	 *            a presionar con shift
	 * @return String en 0
	 * @throws AWTException
	 */
	public String ShiftTecla(String tecla) throws AWTException {
		String salida = "0";
		Robot r = new Robot();
		StringSelection stringSeleccion = new StringSelection(tecla);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSeleccion, null);
		r.delay(500);
		r.keyPress(KeyEvent.VK_SHIFT);
		if (salida.equals("0")) {
			for (int i = 0; i < 1; i++) {
				switch (tecla.codePointAt(i)) {
				case 49:
					r.keyPress(KeyEvent.VK_1);
					r.keyRelease(KeyEvent.VK_1);
					break;
				case 50:
					r.keyPress(KeyEvent.VK_2);
					r.keyRelease(KeyEvent.VK_2);
					break;
				case 51:
					r.keyPress(KeyEvent.VK_3);
					r.keyRelease(KeyEvent.VK_3);
					break;
				case 52:
					r.keyPress(KeyEvent.VK_4);
					r.keyRelease(KeyEvent.VK_4);
					break;
				case 53:
					r.keyPress(KeyEvent.VK_5);
					r.keyRelease(KeyEvent.VK_5);
					break;
				case 54:
					r.keyPress(KeyEvent.VK_6);
					r.keyRelease(KeyEvent.VK_6);
					break;
				case 55:
					r.keyPress(KeyEvent.VK_7);
					r.keyRelease(KeyEvent.VK_7);
					break;
				case 56:
					r.keyPress(KeyEvent.VK_8);
					r.keyRelease(KeyEvent.VK_8);
					break;
				case 57:
					r.keyPress(KeyEvent.VK_9);
					r.keyRelease(KeyEvent.VK_9);
					break;
				case 48:
					r.keyPress(KeyEvent.VK_0);
					r.keyRelease(KeyEvent.VK_0);
					break;
				case 39:
					r.keyPress(KeyEvent.VK_RIGHT);
					r.keyRelease(KeyEvent.VK_RIGHT);
					break;
				case 43:
					r.keyPress(KeyEvent.VK_PLUS);
					r.keyRelease(KeyEvent.VK_PLUS);
					break;
				case 58:
					r.keyPress(KeyEvent.VK_PERIOD);
					r.keyRelease(KeyEvent.VK_PERIOD);
					break;
				case 59:
					r.keyPress(KeyEvent.VK_COMMA);
					r.keyRelease(KeyEvent.VK_COMMA);
					break;
				case 61:
					r.keyPress(KeyEvent.VK_0);
					r.keyRelease(KeyEvent.VK_0);
					break;
				default:
					break;

				}
				switch (tecla.toUpperCase()) {
				case "F1":
					r.keyPress(KeyEvent.VK_F1);
					r.keyRelease(KeyEvent.VK_F1);
					break;
				case "F2":
					r.keyPress(KeyEvent.VK_F2);
					r.keyRelease(KeyEvent.VK_F2);
					break;
				case "F3":
					r.keyPress(KeyEvent.VK_F3);
					r.keyRelease(KeyEvent.VK_F3);
					break;
				case "F4":
					r.keyPress(KeyEvent.VK_F4);
					r.keyRelease(KeyEvent.VK_F4);
					break;
				case "F5":
					r.keyPress(KeyEvent.VK_F5);
					r.keyRelease(KeyEvent.VK_F5);
					break;
				case "F6":
					r.keyPress(KeyEvent.VK_F6);
					r.keyRelease(KeyEvent.VK_F6);
					break;
				case "F7":
					r.keyPress(KeyEvent.VK_F7);
					r.keyRelease(KeyEvent.VK_F7);
					break;
				case "F8":
					r.keyPress(KeyEvent.VK_F8);
					r.keyRelease(KeyEvent.VK_F8);
					break;
				case "F9":
					r.keyPress(KeyEvent.VK_F9);
					r.keyRelease(KeyEvent.VK_F9);
					break;
				case "F10":
					r.keyPress(KeyEvent.VK_F10);
					r.keyRelease(KeyEvent.VK_F10);
					break;
				case "F11":
					r.keyPress(KeyEvent.VK_F11);
					r.keyRelease(KeyEvent.VK_F11);
					break;
				case "F12":
					r.keyPress(KeyEvent.VK_F11);
					r.keyRelease(KeyEvent.VK_F12);
					break;
				case "F13":
					r.keyPress(KeyEvent.VK_F13);
					r.keyRelease(KeyEvent.VK_F13);
					break;
				case "F14":
					r.keyPress(KeyEvent.VK_F14);
					r.keyRelease(KeyEvent.VK_F14);
					break;
				case "F15":
					r.keyPress(KeyEvent.VK_F15);
					r.keyRelease(KeyEvent.VK_F15);
					break;
				case "F16":
					r.keyPress(KeyEvent.VK_F16);
					r.keyRelease(KeyEvent.VK_F16);
					break;
				case "F17":
					r.keyPress(KeyEvent.VK_F17);
					r.keyRelease(KeyEvent.VK_F17);
					break;
				case "F18":
					r.keyPress(KeyEvent.VK_F18);
					r.keyRelease(KeyEvent.VK_F18);
					break;
				case "F19":
					r.keyPress(KeyEvent.VK_F19);
					r.keyRelease(KeyEvent.VK_F19);
				case "F20":
					r.keyPress(KeyEvent.VK_F20);
					r.keyRelease(KeyEvent.VK_F20);
					break;
				}
				r.keyRelease(KeyEvent.VK_SHIFT);
				salida = "0";
			}
		}
		return salida;
	}

	/**
	 * Este metodo permite dar click sobre la posicion X y Y que hemos recibido
	 *
	 * @param x
	 *            Posición x en Pantalla
	 * @param y
	 *            Posición y en Pantalla
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String clickRobot(int x, int y) throws AWTException {
		String strSalida = moverMouseRobot(x, y);
		if (strSalida.equals("0")) {
			strSalida = click();
		}
		return strSalida;
	}

	public String clickDerechoRobot(int x, int y) throws AWTException {
		String strSalida = moverMouseRobot(x, y);
		if (strSalida.equals("0")) {
			strSalida = clickDerechoRobot(x, y);
		}
		return strSalida;
	}

	/**
	 * Este metodo realiza la accion ctr+ z para deshacer acciones en SO windows
	 * 
	 * @throws AWTException
	 */
	public void deshacer() throws AWTException {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_Z);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_Z);

	}

	/**
	 * Este metodo permite hacer doble click sobre la posicion X y Y que hemos
	 * recibido y copiar el texto que ha sido seleccionado al hacer doble click
	 *
	 * @param x
	 *            Posición x en Pantalla
	 * @param y
	 *            Posición y en Pantalla
	 * @return String con un el texto copiado . 0 es un error al hacer la
	 *         acción.
	 * @throws AWTException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws UnsupportedFlavorException
	 */
	public String copiarDobleClick(int x, int y)
			throws AWTException, ClassNotFoundException, UnsupportedFlavorException, IOException {
		String strSalida;

		Robot robot = new Robot();
		strSalida = dobleClickRobot(x, y);
		if (strSalida.equals("0")) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_C);
			robot.delay(500);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			Transferable tSel = clipboard.getContents(this);
			// Construimos el DataFlavor correspondiente al String java
			DataFlavor dataFlavorStringJava = new DataFlavor(
					"application/x-java-serialized-object; class=java.lang.String");
			// Y si el dato se puede conseguir como String java, lo sacamos por
			// pantalla
			if (tSel.isDataFlavorSupported(dataFlavorStringJava)) {
				String texto = (String) tSel.getTransferData(dataFlavorStringJava);
				strSalida = texto;
			}
		}
		return strSalida;
	}

	/**
	 * Este metodo permite copiar el Texto que previamente se ha seleccionado
	 * con las posiciones X y Y iniciales y con las posiciones X y Y Finales.
	 *
	 * @param xIni
	 *            Posición X Inicial en Pantalla
	 * @param yIni
	 *            Posición Y Inicial en Pantalla
	 * @param xFin
	 *            Posición X Final en Pantalla
	 * @param yFin
	 *            Posición Y Final en Pantalla
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String copiarTexto(int xIni, int yIni, int xFin, int yFin) throws AWTException {
		String strSalida;
		strSalida = dragPointer(xIni, yIni, xFin, yFin);
		if (strSalida.equals("0")) {
			Robot robot;
			try {
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(500);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				Transferable tSel = clipboard.getContents(this);
				// Construimos el DataFlavor correspondiente al String java
				DataFlavor dataFlavorStringJava = new DataFlavor(
						"application/x-java-serialized-object; class=java.lang.String");
				// Y si el dato se puede conseguir como String java, lo sacamos
				// por pantalla
				if (tSel.isDataFlavorSupported(dataFlavorStringJava)) {
					String texto = (String) tSel.getTransferData(dataFlavorStringJava);
					strSalida = texto;
				}
			} catch (AWTException | ClassNotFoundException | UnsupportedFlavorException | IOException ex) {
				System.out.println(ex.getMessage());
				strSalida = ex.getMessage();
			}
		} else {
			strSalida = "null";
		}
		return strSalida;
	}

	/**
	 * Este metodo permite borrar lo que se ha seleccionado con las posiciones X
	 * y Y iniciales y con las posiciones X y Y Finales.
	 *
	 * @param xIni
	 *            Posición X Inicial en Pantalla
	 * @param yIni
	 *            Posición Y Inicial en Pantalla
	 * @param xFin
	 *            Posición X Final en Pantalla
	 * @param yFin
	 *            Posición Y Final en Pantalla
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String borrarSeleccion(int xIni, int yIni, int xFin, int yFin) throws AWTException {
		String strSalida = "";
		strSalida += dragPointer(xIni, yIni, xFin, yFin);
		if (strSalida.equals("0")) {
			Robot robot;
			try {
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_DELETE);
				robot.delay(500);
			} catch (AWTException ex) {
				System.out.println(ex.getMessage());
				strSalida += ex.getMessage();
			}
		} else {
			strSalida += "null";
		}
		strSalida = "0";
		return strSalida;
	}

	/**
	 * Este metodo permite hacer doble click sobre la posicion X y Y que hemos
	 * recibido
	 *
	 * @param x
	 *            Posición x en Pantalla
	 * @param y
	 *            Posición y en Pantalla
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String dobleClickRobot(int x, int y) throws AWTException {
		String strSalida;

		Robot robot = new Robot();
		strSalida = moverMouseRobot(x, y);
		if (strSalida.equals("0")) {
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			robot.delay(50);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
		}
		return strSalida;
	}

	/**
	 * Este metodo permite escribir en pantalla guardando en memoria el texto y
	 * pegandolo sobre la posición X y Y que hemos recibido.
	 *
	 * @param x
	 *            Posición x en Pantalla
	 * @param y
	 *            Posición y en Pantalla
	 * @param cadena
	 *            Texto que será escrito
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String escribirPasteRobot(int x, int y, String cadena) throws AWTException {
		String strSalida;
		Robot robot = new Robot();
		StringSelection stringSeleccion = new StringSelection(cadena);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSeleccion, null);
		strSalida = clickRobot(x, y);
		robot.delay(500);
		if (strSalida.equals("0")) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			strSalida = "0";
		}

		return strSalida;
	}

	/**
	 * Este metodo nos permite escribir sobre la posición X y Y que nos han
	 * ingresado
	 *
	 * @param x
	 *            Posición x en Pantalla
	 * @param y
	 *            Posición y en Pantalla
	 * @param cadena
	 *            Texto que será escrito
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String escribirRobot(int x, int y, String cadena) throws AWTException {
		String strSalida = moverMouseRobot(x, y);
		if (strSalida.equals("0")) {
			strSalida = click();
			if (strSalida.equals("0")) {
				strSalida = escribir(cadena);
			}
		}
		return strSalida;
	}

	public void escribirRobot(String cadena) throws AWTException {
		escribir(cadena);
	}

	/**
	 * Este metodo permite copiar el Texto que previamente se ha seleccionado
	 * con las posiciones X y Y iniciales y con las posiciones X y Y Finales.
	 * Nota: Este Sirve para ser instanciado desde el FW
	 *
	 * @param xIni
	 *            Posición X Inicial en Pantalla
	 * @param yIni
	 *            Posición Y Inicial en Pantalla
	 * @param xFin
	 *            Posición X Final en Pantalla
	 * @param yFin
	 *            Posición Y Final en Pantalla
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String copiarSeleccionRobot(int xIni, int yIni, int xFin, int yFin) throws AWTException {
		AccionesCLI jRobot = new AccionesCLI();
		String salida = jRobot.copiarTexto(xIni, yIni, xFin, yFin);
		return salida;
	}

	/**
	 * Este metodo permite hacer doble click sobre la posicion X y Y que hemos
	 * recibido y copiar el texto que ha sido seleccionado al hacer doble click.
	 * Nota: Este Sirve para ser instanciado desde el FW.
	 *
	 * @param x
	 *            Posición x en Pantalla
	 * @param y
	 *            Posición y en Pantalla
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws IOException
	 * @throws UnsupportedFlavorException
	 * @throws AWTException
	 * @throws ClassNotFoundException
	 */
	public static String copiarDobleClickRobot(int x, int y)
			throws ClassNotFoundException, AWTException, UnsupportedFlavorException, IOException {
		AccionesCLI jrobot = new AccionesCLI();
		String salida = jrobot.copiarDobleClick(x, y);
		return salida;
	}

	/**
	 * Este metodo pega lo que este en el portapapeles en las coordenadas x y
	 * dadas
	 * 
	 * @param x coordenada x
	 * @param y coordenada y
	 * @return string en 0 si la accion se realizo todo lo contrario a 0 es un
	 *         error al realizar la accion
	 * @throws AWTException
	 */
	public String pegarSeleccion(int x, int y) throws AWTException {
		String strSalida = "";
		Robot robot = new Robot();
		strSalida += moverMouseRobot(x, y);
		robot.delay(500);
		if (strSalida.equals("0")) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			strSalida = "0";
		} else {
			strSalida += "null";
		}
		return strSalida;
	}
}
