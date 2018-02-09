package com.qvision.frameworkGUI;

import java.util.Iterator;

import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class AccionesGUI {

	/**
	 * Realiza click sobre una imagen en pantalla que coincida con
	 * la imagen que se pase como parametro
	 * @param url ruta de la imagen
	 * @return true si se realiza la accion
	 * @throws FindFailed si la imagen no se encuentra en pantalla
	 */
	public boolean click(String url) throws FindFailed {
		boolean salida = false;
		Screen screen = new Screen();
		Pattern p = new Pattern(url);
		Region region = screen.find(url);
		region.highlight(2);
		region.click();
		salida = true;
		return salida;
	}

	/**
	 * Ubica el cursor en el centro de la imagen
	 * que se pase como parametro
	 * @param url ruta de la imagen
	 * @return
	 * @throws FindFailed
	 */
	public boolean hover(String url) throws FindFailed {
		boolean salida = false;
		Screen screen = new Screen();
		Pattern p = new Pattern(url);
		Region region = screen.find(url);
		region.highlight(2);
		region.hover();
		salida = true;
		return salida;
	}

	/**
	 * 	Busca una imagen en pantalla
	 * @param url ruta de la imagen a buscar
	 * @return
	 * @throws FindFailed 
	 */
	public boolean isImageInScreen(String url) {
		boolean salida = false;
		Screen screen = new Screen();
		Pattern p = new Pattern(url);
		Region region;
		try {
			region = screen.find(url);
			salida = true;
		} catch (FindFailed e) {
			return salida;
		}
		return salida;
	}
	
	/**
	 * Realiza drag and drop del centro de una imagen  
	 * al centro de otra
	 * @param urlBase ruta de la imagen inicial
	 * @param urlTarget ruta de la imagen destino
	 * @return
	 * @throws FindFailed
	 */
	public boolean dragAndDrop(String urlBase, String urlTarget) throws FindFailed {
		boolean salida = false;
		Screen screen = new Screen();
		Pattern pBase = new Pattern(urlBase);
		Pattern pTarget = new Pattern(urlTarget);
		new Region(screen.find(pBase)).highlight(2);
		new Region(screen.find(pTarget)).highlight(2);
		screen.dragDrop(pBase, pTarget);
		salida = true;
		return salida;
	}

	/**
	 * Realiza un dobleclick en el centro de una imagen
	 * @param url ruta de la imagen
	 * @return
	 * @throws FindFailed
	 */
	public boolean dobleClick(String url) throws FindFailed {
		boolean salida = false;
		Screen screen = new Screen();
		Pattern p = new Pattern(url);
		Region region = screen.find(url);
		region.highlight(2);
		region.doubleClick();
		salida = true;
		return salida;
	}

	/**
	 * Realiza un click derecho en el centro de una imagen
	 * @param url ruta de la imagen
	 * @return
	 * @throws FindFailed
	 */
	public boolean clickDerecho(String url) throws FindFailed {
		boolean salida = false;
		Screen screen = new Screen();
		Pattern p = new Pattern(url);
		Region region = screen.find(url);
		region.highlight(2);
		region.rightClick();
		return salida;
	}

	
	public boolean checkGui(String url, int pixCheck) {
		boolean salida = false;
		try {
			Screen sc = new Screen();
			Region rg = new Region(sc.find(url));
			rg.left(pixCheck).click();
			salida = true;
		} catch (FindFailed ex) {
			System.out.println(ex.getMessage());
		}
		return salida;
	}

	
	public boolean escribir(String url, String texto) throws FindFailed {
		boolean salida = false;
		Settings.OcrTextSearch = true;
		Screen screen = new Screen();
		Pattern p = new Pattern(url);
		Region region = screen.find(url);
		region.highlight(2);
		region.type(url, texto);
		salida = true;
		return salida;
	}

	public boolean listElementos(String url, String accion, int index, String valor) throws FindFailed {
		boolean salida = false;
		Screen sc = new Screen();
		Iterator<Match> elementos = sc.findAll(url);
		int i = 0;
		while (elementos.hasNext()) {
			i++;
			Match next = elementos.next();
			next.highlight(1);
			if (i == index) {
				switch (accion) {
				case "escribir":
					next.type(valor);
					break;
				case "click":
					next.click();
					break;
				}
			}
		}
		if (index > i) {
			salida = true;
		}
		return salida;
	}

	public String getText(String url) throws FindFailed {
		String texto = "";
		Screen sc = new Screen();
		Settings.OcrTextSearch = true;
		Settings.OcrTextRead = true;
		Region rg = new Region(sc.find(url));
		texto = rg.text();
		return texto;
	}
	
}
