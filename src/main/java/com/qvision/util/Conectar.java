package com.qvision.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

	private static Connection connection = null;
	

		public static void getConnection(){
		try{
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:"+System.getProperty("user.home")+"/ObjetosDB.db");			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
		
		public static Connection getInstance(){
					if(connection == null){
						getConnection();
					} else
						try {
							if(connection.isClosed()){
								getConnection();
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					return connection;
		}
		
		/**
		 * Cierra la conexión a BD
		 * @Author JJR 09NOV2015
		 */
		public static void cerrarConexion(){
			try {
				if(connection != null){
						connection.close();
				}
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
}

