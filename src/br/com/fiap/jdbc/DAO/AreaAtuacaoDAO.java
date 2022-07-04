package br.com.fiap.jdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.jdbc.model.AreaAtuacao;


public class AreaAtuacaoDAO {
	
	private Connection conectar;

	public AreaAtuacaoDAO(Connection conectar) {
		this.conectar = conectar;
	}
	
	public void insert(AreaAtuacao areaAtuacao)throws SQLException{
		String sql = "insert into areaAtuacao(idArea, nome) values (?,?)";
		PreparedStatement stmt = conectar.prepareStatement(sql);
		
		stmt.setLong(1, areaAtuacao.getIdArea());
		stmt.setString(2, areaAtuacao.getNome());
		
		stmt.execute();
		stmt.close();
	}
	
	public void delete(long id) throws SQLException{
		String sql = "delete  from usuarios where id=?";
		PreparedStatement stmt = conectar.prepareStatement(sql);
		stmt.setLong(1, id);
		stmt.execute();
		stmt.close();
	}
	
	public void update(AreaAtuacao areaAtuacao) throws SQLException{
		String sql = "update usuarios set nome=? where idArea=?";
		PreparedStatement stmt = conectar.prepareStatement(sql);
		
		stmt.setString(1, areaAtuacao.getNome());
		stmt.setLong(2, areaAtuacao.getIdArea());
		
		stmt.execute();
		stmt.close();
	}
	

}
