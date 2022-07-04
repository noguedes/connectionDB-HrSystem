package br.com.fiap.jdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.jdbc.model.Cadidato;


public class CandidatoDAO {
	
	private Connection conectar;
	

	public CandidatoDAO(Connection conectar) {
		this.conectar = conectar;
	}
	
	public void delete(long id) throws SQLException{
		String sql = "delete  from usuarios where id=?";
		PreparedStatement stmt = conectar.prepareStatement(sql);
		stmt.setLong(1, id);
		stmt.execute();
		stmt.close();
	}
	
	public void insert(Cadidato candidato)throws SQLException{
		String sql = "insert into candidato(id_candidato, nome, data_nasc, genero, tempo_experiencia, formacao, telefone, email, endereco, idArea) values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conectar.prepareStatement(sql);
		
		stmt.setLong(1, candidato.getId_candidato());
		stmt.setString(2, candidato.getNome());
		stmt.setDate(3, candidato.getData_nasc());
		stmt.setString(4, candidato.getGenero());
		stmt.setFloat(5, candidato.getTempo_experiencia());
		stmt.setString(6, candidato.getFormacao());
		stmt.setString(7, candidato.getTelefone());
		stmt.setString(8, candidato.getEmail());
		stmt.setString(9, candidato.getEndereco());
		stmt.setLong(10, candidato.getIdArea());
		
		
		stmt.execute();
		stmt.close();
	}
	
	public void update(Cadidato candidato, float tempo_experiencia, String formacao, String telefone, String email, String endereco,
			long id_candidato) throws SQLException {
		String sql = "update candidato set tempo_experiencia? formacao=? telefone=? email=? endereco=?  where id_candidato=?";
		PreparedStatement stmt = conectar.prepareStatement(sql);
		
		stmt.setFloat(1, candidato.getTempo_experiencia());
		stmt.setString(2, candidato.getFormacao());
		stmt.setString(3, candidato.getTelefone());
		stmt.setString(4, candidato.getEmail());
		stmt.setString(5, candidato.getEndereco());
		stmt.setLong(6, candidato.getId_candidato());
	
		stmt.execute();
		stmt.close();
		
	}
	
	
	

}
