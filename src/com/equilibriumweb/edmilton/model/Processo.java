package com.equilibriumweb.edmilton.model;
import java.util.Date;

public class Processo {

	private int id_processo;
	private int numero_processo;
	private Date data;
	private double valor_recurso;
	private String objetivo;

	public Processo(int id_processo, int numero_processo, Date data, double valor_recurso, String objetivo) {
		super();
		this.id_processo = id_processo;
		this.numero_processo = numero_processo;
		this.data = data;
		this.valor_recurso = valor_recurso;
		this.objetivo = objetivo;
	}

	public int getId_processo() {
		return id_processo;
	}

	public void setId_processo(int id_processo) {
		this.id_processo = id_processo;
	}

	public int getNumero_processo() {
		return numero_processo;
	}

	public void setNumero_processo(int numero_processo) {
		this.numero_processo = numero_processo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor_recurso() {
		return valor_recurso;
	}

	public void setValor_recurso(double valor_recurso) {
		this.valor_recurso = valor_recurso;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	
}
