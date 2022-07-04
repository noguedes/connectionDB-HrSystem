package br.com.fiap.jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.br.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.DAO.CandidatoDAO;
import br.com.fiap.jdbc.model.Cadidato;

public class CandidatoController {
	
	private CandidatoDAO candidatoDAO;
	
	public void CandidatoController() {
		Connection connection = new ConnectionFactory().conectar();
		this.candidatoDAO = new CandidatoDAO(connection);
	}
	
	public void delete(long id_candidato) throws SQLException {
		this.candidatoDAO.delete(id_candidato);
	}
	
	public void insert(Cadidato candidato) throws SQLException {
		this.candidatoDAO.insert(candidato);
	}
	
	public void update(Cadidato candidato, float tempo_experiencia, String formacao, String telefone, String email, String endereco, 
			long id_candidato) throws SQLException {
		this.candidatoDAO.update(candidato, tempo_experiencia, formacao, telefone, email, endereco, id_candidato);
	}

}
