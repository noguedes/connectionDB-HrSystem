package br.com.br.fiap.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection conectar() {
		
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "tm_arthur_barroco", "210904");
			
		}catch(SQLException e){
			System.out.println("Erro ao conectar");
			throw new RuntimeException(e);
		}
		
	}

}
