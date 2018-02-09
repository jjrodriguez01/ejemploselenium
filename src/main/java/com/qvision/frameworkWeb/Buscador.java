package com.qvision.frameworkWeb;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class Buscador {

	public static WebElement buscarElemento(String identificadores,
			RemoteWebDriver driver)throws NoSuchElementException,WebDriverException {
		WebElement webElement = null;
		
		String[] locators = identificadores.split(",");
		String[][] arrIdentificadores = new String[locators.length / 2][2];
		for (int i = 0; i < locators.length / 2; i++) {
			arrIdentificadores[i][1] = locators[i * 2];
			arrIdentificadores[i][0] = locators[i * 2 + 1];
		}
	
		String tipoIdentificador = arrIdentificadores[0][0];
		String nombreIdentificador = arrIdentificadores[0][1];
		webElement = localizar(tipoIdentificador, nombreIdentificador, driver);
			
			if(webElement == null){
				webElement = forzarBuscarElemento(arrIdentificadores, driver);
				if(webElement == null){
					throw new NoSuchElementException("Elemento no encontrado");
				}
				
			}
			return webElement;
	}
	
	public static By byDom(String domExpression, WebDriver driver) {
		try{
		final Object obj = ((JavascriptExecutor) driver).executeScript("return " + domExpression + ";");

		if (obj instanceof WebElement) {
			return new By() {
				@SuppressWarnings("serial")
				@Override
				public List<WebElement> findElements(SearchContext searchContext) {
					return new ArrayList<WebElement>() {
						{
							add((WebElement) obj);
						}
					};
				}
			};
		}

		return null;
		}catch(Exception e){
			return null;
		}
	}
	
	public static WebElement forzarBuscarElemento(String[][] arrIdentificadores,RemoteWebDriver driver) {
		WebElement webElement = null;
		for (int i = 0; i < arrIdentificadores.length; i++) {
			webElement = localizar(arrIdentificadores[i][0],arrIdentificadores[i][1], driver);
			if (webElement != null) {
				break;
			}
		}
		return webElement;
	}
	
	public static WebElement localizar(String tipoIdentificador,
			String nombreIdentificador,RemoteWebDriver driver){
		WebElement webElement = null;
		if (tipoIdentificador.length() > 0 && nombreIdentificador.length() > 0) {
			if (tipoIdentificador.equalsIgnoreCase("id")) {
				webElement = driver.findElement(By.id(nombreIdentificador));
			} else if (tipoIdentificador.equalsIgnoreCase("name")) {
				webElement = driver.findElement(By.name(nombreIdentificador));
			} else if (tipoIdentificador.equalsIgnoreCase("xpath") || tipoIdentificador.equalsIgnoreCase("xpath:attributes")) {
				tipoIdentificador = "xpath";
				webElement = driver.findElement(By.xpath(nombreIdentificador));
			} else if (tipoIdentificador.equalsIgnoreCase("link")) {
				webElement = driver.findElement(By.linkText(nombreIdentificador.toString()));
			} else if (tipoIdentificador.equalsIgnoreCase("css")) {
				webElement = driver.findElement(By.cssSelector(nombreIdentificador));
			} else if (tipoIdentificador.equalsIgnoreCase("class")) {
				webElement = driver.findElement(By.className(nombreIdentificador));
			} else if (tipoIdentificador.equalsIgnoreCase("dom") || tipoIdentificador.equalsIgnoreCase("dom:name")) {
				// nombreIdentificador = "dom";
				webElement = driver.findElement(byDom(nombreIdentificador, driver));
			}	
		}
		return webElement;
	}
	
	public static By getBy(String identificadores){
		String[] locators = identificadores.split(",");
		String[][] arrIdentificadores = new String[locators.length / 2][2];
		for (int i = 0; i < locators.length / 2; i++) {
			arrIdentificadores[i][1] = locators[i * 2];
			arrIdentificadores[i][0] = locators[i * 2 + 1];
		}
	
		String tipoIdentificador = arrIdentificadores[0][0];
		String nombreIdentificador = arrIdentificadores[0][1];
		
		if (tipoIdentificador.length() > 0 && nombreIdentificador.length() > 0) {
			if (tipoIdentificador.equalsIgnoreCase("id")) {
				return By.id(nombreIdentificador);
			} else if (tipoIdentificador.equalsIgnoreCase("name")) {
				return By.name(nombreIdentificador);
			} else if (tipoIdentificador.equalsIgnoreCase("xpath") || tipoIdentificador.equalsIgnoreCase("xpath:attributes")) {
				tipoIdentificador = "xpath";
				return By.xpath(nombreIdentificador);
			} else if (tipoIdentificador.equalsIgnoreCase("link")) {
				return By.linkText(nombreIdentificador);
			} else if (tipoIdentificador.equalsIgnoreCase("css")) {
				return By.cssSelector(nombreIdentificador);
			} else if (tipoIdentificador.equalsIgnoreCase("class")) {
				return By.className(nombreIdentificador);
			}	
		}
		return null;
	}
	
	public static WebElement buscarElementoPresente(RemoteWebDriver driver, final By by, int timeOutInSeconds) {

        WebElement element; 

        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //nullify implicitlyWait() 

            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds); 
            element = wait.until(ExpectedConditions.presenceOfElementLocated(by));

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //reset implicitlyWait
            return element; //return the element
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null; 
    }
}