package com.qvision.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import com.qvision.frameworkWeb.AccionesWeb;
import com.qvision.util.Conectar;

public class AccionesWebTest {

	private AccionesWeb accionesWeb;
	
	
	@Before
	public void setUp(){
		accionesWeb = new AccionesWeb();
		accionesWeb.irAUrl("http://localhost:8084/PruebasFw/index.html");
	}
	
	@After
	public void tearDown(){
		accionesWeb.cerrarDriver();
	}
	
	@AfterClass
	public static void close(){
		Conectar.cerrarConexion();
	}
	
	@Test
	public void deriaHacerClick(){
		accionesWeb.click(2);
		boolean resultado = accionesWeb.verificarValor("1",1);
		assertTrue("error click", resultado);
		
	}
	
	@Test
	public void deberiaEscribir(){
		accionesWeb.escribir( "qvision",3);
		boolean resultado = accionesWeb.verificarValor("1",1 );
		assertTrue("error escribir", resultado);
		
	}
	
	@Test
	public void deberiaHacerFoco(){
		accionesWeb.foco(4);
		boolean resultado = accionesWeb.verificarValor("1",1);
		assertTrue("error foco", resultado);
	}
	
	@Test
	public void deberiaSeleccionar(){
		accionesWeb.seleccionar("Gibson", 5);
		boolean resultado = accionesWeb.verificarValor("1",1);
		assertTrue("error seleccionar", resultado);
	}
	
	
}
