package com.equilibriumweb.edmilton.model;

public class TipoProcesso {
	
	private int idTipoProcesso;
	private String nome;

	public TipoProcesso(int idTipoProcesso, String nome){
		this.idTipoProcesso = idTipoProcesso;
		this.nome = nome;
	}

	public TipoProcesso(String nome) {
		this.nome = nome;
	}

	public int getIdTipoProcesso() {
		return idTipoProcesso;
	}

	public void setIdTipoProcesso(int idTipoProcesso) {
		this.idTipoProcesso = idTipoProcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "TipoProcesso{" +
				"idTipoProcesso=" + idTipoProcesso +
				", nome='" + nome + '\'' +
				'}';
	}
}
