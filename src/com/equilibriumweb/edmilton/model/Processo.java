package com.equilibriumweb.edmilton.model;
import java.util.Calendar;
import java.util.Date;

public class Processo {

	private int idProcesso;
	private int numero;
	private Calendar data;
	private double valorRecurso;
	private String objetivo;
	private TipoProcesso tipoProcesso;

	public Processo(int id, int numero, double valorRecurso, String objetivo) {
		super();
		this.idProcesso = id;
		this.numero = numero;
		this.data = Calendar.getInstance();
		this.valorRecurso = valorRecurso;
		this.objetivo = objetivo;
	}

	public Processo(int numero, double valorRecurso, String objetivo) {
		super();
		this.numero = numero;
		this.data = Calendar.getInstance();
		this.valorRecurso = valorRecurso;
		this.objetivo = objetivo;
	}

	public int getIdProcesso() {
		return idProcesso;
	}

	public void setIdProcesso(int idProcesso) {
		this.idProcesso = idProcesso;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero_processo) {
		this.numero = numero;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public double getValorRecurso() {
		return valorRecurso;
	}

	public void setValorRecurso(double valorRecurso) {
		this.valorRecurso = valorRecurso;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public TipoProcesso getTipoProcesso() {
		return tipoProcesso;
	}

	public void setTipoProcesso_id(TipoProcesso tipoProcesso) {
		this.tipoProcesso = tipoProcesso;
	}

	@Override
	public String toString() {
		return "Processo{" +
				"idProcesso=" + idProcesso +
				", numero=" + numero +
				", data=" + data +
				", valorRecurso=" + valorRecurso +
				", objetivo='" + objetivo + '\'' +
				", tipoProcesso=" + tipoProcesso +
				'}';
	}
}
