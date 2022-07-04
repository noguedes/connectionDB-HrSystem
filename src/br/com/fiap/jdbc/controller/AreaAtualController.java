package br.com.fiap.jdbc.controller;

import java.sql.Connection;

import br.com.br.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.DAO.AreaAtuacaoDAO;

public class AreaAtualController {
	
	private AreaAtuacaoDAO areaAtuacaoDAO;

	public void AreaAtualController() {
		Connection connection = new ConnectionFactory().conectar();
		this.areaAtuacaoDAO = new AreaAtuacaoDAO(connection);
	}
	
	
	
	

}
