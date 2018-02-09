package com.qvision.qvisionFw;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.interactions.Actions;

import com.qvision.frameworkWeb.AccionesWeb;

public class QvisionFw {

	public static void main(String[] args) throws InterruptedException{
		
		/*
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\UserQV\\workspace\\QvisionFw\\geckodriver.exe");
		WebDriver driver = new MarionetteDriver();
		//WebDriver driver = new FirefoxDriver();
		try{
			driver.get("http://www.elempleo.com/colombia/trabajo/ofertas.aspx");
			Actions actions = new Actions(driver);
			WebElement element = driver.findElement(By.linkText("Buscar empleo"));
			String javaScript = "var evObj = document.createEvent('MouseEvents');" +
                    "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
                    "arguments[0].dispatchEvent(evObj);";

			((JavascriptExecutor)driver).executeScript(javaScript, element);
			Thread.sleep(5000);
			driver.quit();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
	}
}
