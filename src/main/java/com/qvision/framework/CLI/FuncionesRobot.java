package com.qvision.framework.CLI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class FuncionesRobot {


	/**
	 * Este metodo permite escribir la letra que se esta ingresando a traves de
	 * la combinacion de teclas como resultado se pueden escribri cualquiera de
	 * los siguientes caracteres !"#$%&/()= ya que no son soportados
	 * directamente por la api de sikuli
	 *
	 * @param letra
	 *            La letra que será escrita
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 */
	public static String caracteresEspeciales(String letra) {
		String strSalida;
		try {
			Robot robot = new Robot();
			// Los Caracteres que se Imprimen a Continuación son: !"#$%&/()= o
			// !"#$%&()/=
			for (int i = 0; i < 1; i++) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				switch (letra.codePointAt(i)) {
				case 33:
					robot.keyPress(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_1);
					break;
				case 34:
					robot.keyPress(KeyEvent.VK_2);
					robot.keyRelease(KeyEvent.VK_2);
					break;
				case 35:
					robot.keyPress(KeyEvent.VK_3);
					robot.keyRelease(KeyEvent.VK_3);
					break;
				case 36:
					robot.keyPress(KeyEvent.VK_4);
					robot.keyRelease(KeyEvent.VK_4);
					break;
				case 37:
					robot.keyPress(KeyEvent.VK_5);
					robot.keyRelease(KeyEvent.VK_5);
					break;
				case 38:
					robot.keyPress(KeyEvent.VK_6);
					robot.keyRelease(KeyEvent.VK_6);
					break;
				case 40:
					robot.keyPress(KeyEvent.VK_8);
					robot.keyRelease(KeyEvent.VK_8);
					break;
				case 41:
					robot.keyPress(KeyEvent.VK_9);
					robot.keyRelease(KeyEvent.VK_9);
					break;
				case 47:
					robot.keyPress(KeyEvent.VK_7);
					robot.keyRelease(KeyEvent.VK_7);
					break;
				case 58:
					robot.keyPress(KeyEvent.VK_PERIOD);
					robot.keyRelease(KeyEvent.VK_PERIOD);
					break;
				case 59:
					robot.keyPress(KeyEvent.VK_COMMA);
					robot.keyRelease(KeyEvent.VK_COMMA);
					break;
				case 61:
					robot.keyPress(KeyEvent.VK_0);
					robot.keyRelease(KeyEvent.VK_0);
					break;
				default:
					break;
				}
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
			strSalida = "0";
		} catch (AWTException ex) {
			strSalida = ex.getMessage();
			System.out.println(ex.getMessage());
		}
		return strSalida;
	}

	public String darClickDerecho() throws AWTException {
		String salida;

		Robot robot = new Robot();
		robot.mousePress(InputEvent.BUTTON2_MASK);
		robot.mouseRelease(InputEvent.BUTTON2_MASK);
		salida = "0";
		return salida;
	}

	/**
	 * Este metodo da click sobre el lugar donde se encuentre el puntero
	 * 
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public static String click() throws AWTException {
		String strSalida = "";
		Robot robot = new Robot();
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		strSalida = "0";
		return strSalida;
	}

	/**
	 * Este metodo permite hacer doble click sobre la posicion en la que se
	 * encuentra el mouse
	 * 
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public static String dobleClick() throws AWTException {
		String strSalida;
		Robot robot = new Robot();
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		strSalida = "0";
		return strSalida;
	}

	/**
	 * Este metodo permite seleccionar haciendo click sostenodo desde un punto x
	 * hasta un punto y
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
	public String dragPointer(int xIni, int yIni, int xFin, int yFin) throws AWTException {
		String strSalida;

		Robot robot = new Robot();
		moverMouseRobot(xIni, yIni);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		moverMouseRobot(xFin, yFin);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(500);
		strSalida = "0";
		return strSalida;
	}

	/**
	 * Este metodo permite escribir en un punto en pantalla a traves de
	 * funciones propias de sikuli. Nota: Los caracteres especiales aceptados
	 * son: !"#$%&/()=
	 *
	 * @param texto
	 *            Texto que será escrito
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String escribir(String texto) throws AWTException {
		String strSalida;
		String oraDos = texto.toUpperCase();
		Robot robot = new Robot();
		robot.delay(1000);
		for (int i = 0; i < oraDos.length(); i++) {
			if (texto.codePointAt(i) > 96 && texto.codePointAt(i) < 123) {
				boolean flag = false;
				if (Toolkit.getDefaultToolkit().getLockingKeyState(20)) {
					robot.keyPress(20);
					robot.keyRelease(20);
					flag = true;
				}
				robot.keyPress(oraDos.codePointAt(i));
				robot.keyRelease(oraDos.codePointAt(i));
				if (flag) {
					robot.keyPress(20);
					robot.keyRelease(20);
				}
			} else if (texto.codePointAt(i) > 32 && texto.codePointAt(i) < 39
					|| texto.codePointAt(i) > 39 && texto.codePointAt(i) < 42
					|| texto.codePointAt(i) > 57 && texto.codePointAt(i) < 60 || texto.codePointAt(i) == 47
					|| texto.codePointAt(i) == 61) {
				String letra = texto.charAt(i) + "";
				caracteresEspeciales(letra);
			} else {
				boolean flag = false;
				if (!Toolkit.getDefaultToolkit().getLockingKeyState(20)) {
					robot.keyPress(20);
					robot.keyRelease(20);
					flag = true;
				}
				robot.keyPress(oraDos.codePointAt(i));
				robot.keyRelease(oraDos.codePointAt(i));
				if (flag) {
					robot.keyPress(20);
					robot.keyRelease(20);
				}
			}
			robot.delay(100);
		}
		strSalida = "0";
		return strSalida;
	}

	/**
	 * Este metodo mueve el puntero del mouse hasta la posicion x,y indicada
	 *
	 * @param x
	 *            Posicion x en Pantalla
	 * @param y
	 *            Posicion y en Pantalla
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String moverMouseRobot(int x, int y) throws AWTException {
		String strSalida = "";
		Robot robot = new Robot();
		robot.delay(500);
		robot.mouseMove(x, y);
		strSalida += "0";
		return strSalida;
	}

	/**
	 * Este metodo permite mover la barra de desplazamiento hacia arriba
	 *
	 * @param nVeces
	 *            Movimientos del mouse hacia arriba
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String moverBarraArribaRobot(int nVeces) throws AWTException {
		String strSalida;
		Robot robot = new Robot();
		robot.mouseWheel(nVeces);
		strSalida = "0";
		return strSalida;
	}

	/**
	 * Este metodo permite mover la barra de desplazamiento hacia abajo
	 *
	 * @param nVeces
	 *            Movimientos del mouse hacia abajo
	 * @return String con un 0 Si realizo la acción. Todo lo contrario a 0 es un
	 *         error al hacer la acción.
	 * @throws AWTException
	 */
	public String moverBarraAbajoRobot(int nVeces) throws AWTException {
		String strSalida = "";
		Robot robot = new Robot();
		robot.mouseWheel(nVeces);
		strSalida += "0";
		return strSalida;
	}
}
