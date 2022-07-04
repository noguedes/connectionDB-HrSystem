package br.com.fiap.jdbc.model;

import java.sql.Date;

public class Cadidato {
	
	private long id_candidato;
	private String nome;
	private Date data_nasc;
	private String genero;
	private float tempo_experiencia;
	private String formacao;
	private String telefone;
	private String email;
	private String endereco;
	private long idArea;
	
	//Construtor
	public Cadidato() {

	}

	//Getters e Stters 
	public long getId_candidato() {
		return id_candidato;
	}

	public void setId_candidato(long id_candidato) {
		this.id_candidato = id_candidato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getTempo_experiencia() {
		return tempo_experiencia;
	}

	public void setTempo_experiencia(float tempo_experiencia) {
		this.tempo_experiencia = tempo_experiencia;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getIdArea() {
		return idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}
	

}
