package com.qvision.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Persistencia {

	private Connection connection;
	
	public Persistencia(){
		
	}
	
	public void crearTabla(){
		try{
			Statement stat = connection.createStatement();
			stat.executeUpdate("drop table if exists objetos;");
			stat.executeUpdate("create table objetos (id INT, identificadores TEXT);");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public String consultarIdentificadores(int id){
		String identificadores = "";
		connection = Conectar.getInstance();
		ResultSet rs = null;
		PreparedStatement prepared = null;
		try {
			prepared = connection.prepareStatement(
			        "SELECT identificadores FROM objetos WHERE rowid = ?;");
			prepared.setInt(1, id);
			rs = prepared.executeQuery();
		while(rs.next()){
			identificadores = rs.getString("identificadores");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(prepared != null){
				prepared.close();
				}
				if(connection != null){
					Conectar.cerrarConexion();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return identificadores;
	}
}
