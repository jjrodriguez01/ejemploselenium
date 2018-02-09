package com.qvision.frameworkWeb;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qvision.util.Persistencia;

public class AccionesWeb {

	private static RemoteWebDriver driver;
	private static Persistencia persistencia = new Persistencia();

	public AccionesWeb(){
		this.driver = new FirefoxDriver();
		this.driver.manage().deleteAllCookies();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static void irAUrl(String url){
		driver.get(url); 
	}
	
	public static void captura() {
		File fileRutaImg = new File("Imagenes");
		Date date = new Date();
		Long timestamp = date.getTime();
		String nombreImg = timestamp.toString();
		if (!fileRutaImg.exists()) {
			fileRutaImg.mkdir();
		}
		if (fileRutaImg.exists() && fileRutaImg.isDirectory()) {
			File screenshot = driver.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenshot,
						new File(fileRutaImg+"\\"+nombreImg+ ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void cerrarDriver(){
		driver.quit();
	}
	
	public static void click(int idObjeto){
		String identificadores = persistencia.consultarIdentificadores(idObjeto);
		WebElement webElement = Buscador.buscarElemento(identificadores, driver);;
		webElement.click();
	}
	
	public static void aceptarAlert(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public static void escribir(String cadena,int idObjeto){
		String identificadores = persistencia.consultarIdentificadores(idObjeto);
		WebElement webElement = Buscador.buscarElemento(identificadores, driver);;
		webElement.sendKeys(cadena); 
	}
	
	public static void foco(int idObjeto){
		String identificadores = persistencia.consultarIdentificadores(idObjeto);
		WebElement webElement = Buscador.buscarElemento(identificadores, driver);
		Actions actions = new Actions(driver);
		actions.moveToElement(webElement).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void seleccionar(String textoASeleccionar,int idObjeto){
	
		String identificadores = persistencia.consultarIdentificadores(idObjeto);
		WebElement webElement = Buscador.buscarElemento(identificadores, driver);
		String[] valoresMultiples = textoASeleccionar.split(",");
		if(valoresMultiples.length == 1){
			new Select(webElement).selectByVisibleText(textoASeleccionar);	
		}else if(valoresMultiples.length > 1){
			for (String valorASeleccionar : valoresMultiples) {
				new Select(webElement).selectByVisibleText(valorASeleccionar);
				webElement.sendKeys(Keys.CONTROL);
			}
		}
	}
	
	public static boolean verificarElementoPresente(int idObjeto){
		boolean estaPresente = false;
		String identificadores = persistencia.consultarIdentificadores(idObjeto);
		WebElement webElement = Buscador.buscarElementoPresente(driver, Buscador.getBy(identificadores), 5);
		if(webElement != null){
			estaPresente = true;
		}
		return estaPresente;
	}
	
	public static boolean verificarURL(String urlEsperada){
		boolean esIgual = false;
			if(driver.getCurrentUrl().equals("urlEsperada")){
				esIgual = true;
			}
		return esIgual;
	}
	
	public static boolean verificarValor(String valorEsperado,int idObjeto ){
		boolean esIgual = false;
		String identificadores = persistencia.consultarIdentificadores(idObjeto);
		WebElement webElement = Buscador.buscarElemento(identificadores, driver);
		String nodo = webElement.getTagName();
		
		if (nodo.equalsIgnoreCase("img") || nodo.equalsIgnoreCase("audio") || nodo.equalsIgnoreCase("video")) {
			return esIgual;
		} else if (nodo.equalsIgnoreCase("input")) {
			if (webElement.getAttribute("value").equals(valorEsperado)) {
				// si los valores son iguales
				return esIgual = true;
			} else {
				// si los valores no son iguales
				return esIgual;
			}
		} else if (nodo.equalsIgnoreCase("select")) {
			Select select = new Select(webElement);
			WebElement option = select.getFirstSelectedOption();
			if (option.getText().equals(valorEsperado)) {
				// si los valores son iguales
				return esIgual = true;
			} else {
				// si no son iguales
				return esIgual;
			}
		} else {
			if (webElement.getText().equals(valorEsperado)) {
				// si los valores son iguales
				return esIgual = true;
			} else {
				// si no son iguales
				return esIgual;
			}
		}
	}
	
}
