package br.com.fiap.jdbc.model;

public class AreaAtuacao {
	
	private long idArea;
	private String nome;
	
	//Construtor
	public AreaAtuacao(long idArea, String nome) {
	
	}
	
	//Getters e Stters 
	public long getIdArea() {
		return idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
